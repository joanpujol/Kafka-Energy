package com.jpujol.kafkaenergy.cli;

import com.jpujol.kafkaenergy.DeviceEvent;
import io.confluent.kafka.serializers.AbstractKafkaSchemaSerDeConfig;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;
import io.dropwizard.cli.Command;
import io.dropwizard.setup.Bootstrap;
import net.sourceforge.argparse4j.inf.Namespace;
import net.sourceforge.argparse4j.inf.Subparser;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.*;

import java.util.Map;
import java.util.Properties;

import static java.util.Collections.singletonMap;

public class StreamSaver extends Command {
    public StreamSaver() {
        // The name of our command is "hello" and the description printed is
        // "Prints a greeting"
        super("stream", "Processes stream");
    }

    @Override
    public void configure(Subparser subparser) {
        // Add a command line option
    }

    private void saveStream() throws InterruptedException {
        Properties props = new Properties();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "testing-streams-api");
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");


        Serde<String> stringSerde = Serdes.String();

        StreamsConfig streamsConfig = new StreamsConfig(props);
        StreamsBuilder builder = new StreamsBuilder();

        final Serde<DeviceEvent> deviceEventSerde = new SpecificAvroSerde<>();
        Map<String, String> config = singletonMap(AbstractKafkaSchemaSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, "http://localhost:8081");
        deviceEventSerde.configure(config, false);

        KStream<String, DeviceEvent> deviceEvents  = builder.stream("DeviceEvent-topic", Consumed.with(stringSerde, deviceEventSerde));
        deviceEvents.filter((k, v) -> v.getChargingSource().toString().equals("utility"))
                .to( "out-topic-3", Produced.with(stringSerde, deviceEventSerde));


        KafkaStreams kafkaStreams = new KafkaStreams(builder.build(), streamsConfig);
        kafkaStreams.start();
        Thread.sleep(5000);
    }

    @Override
    public void run(Bootstrap<?> bootstrap, Namespace namespace) throws Exception {
        System.out.println("Start!");
        saveStream();
    }
}
