package com.jpujol.kafkaenergy;

import com.codahale.metrics.health.HealthCheck;
import com.jpujol.kafkaenergy.cli.StreamSaver;
import com.jpujol.kafkaenergy.resources.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.jdbi3.JdbiFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.jdbi.v3.core.Jdbi;

public class KafkaEnergyApplication extends Application<KafkaEnergyConfiguration> {

    public static void main(final String[] args) throws Exception {
        new KafkaEnergyApplication().run(args);
    }

    @Override
    public String getName() {
        return "KafkaEnergy";
    }

    @Override
    public void initialize(final Bootstrap<KafkaEnergyConfiguration> bootstrap) {
        bootstrap.addCommand(new StreamSaver());
    }

    @Override
    public void run(final KafkaEnergyConfiguration configuration,
                    final Environment environment) {
        final JdbiFactory factory = new JdbiFactory();
        final Jdbi jdbi = factory.build(environment, configuration.getDataSourceFactory(), "postgresql");
        final MyDAO myDao = jdbi.onDemand(MyDAO.class);
        environment.jersey().register(new HelloWorldResource(myDao));
        environment.healthChecks().register("healthcheck", new HealthCheck() {
            @Override
            protected Result check() throws Exception {
                return Result.healthy();
            }
        });
    }

}
