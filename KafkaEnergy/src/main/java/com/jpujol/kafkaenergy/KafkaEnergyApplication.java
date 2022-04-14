package com.jpujol.kafkaenergy;

import com.codahale.metrics.health.HealthCheck;
import com.jpujol.kafkaenergy.resources.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

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
        // TODO: application initialization
    }

    @Override
    public void run(final KafkaEnergyConfiguration configuration,
                    final Environment environment) {
        environment.jersey().register(new HelloWorldResource());
        environment.healthChecks().register("healthcheck", new HealthCheck() {
            @Override
            protected Result check() throws Exception {
                return Result.healthy();
            }
        });
    }

}
