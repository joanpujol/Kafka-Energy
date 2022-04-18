package com.jpujol.kafkaenergy.core;

import io.confluent.kafka.serializers.KafkaAvroSerializer;
import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KafkaEnergyProducer {
    private final static String TOPIC = "DeviceEvent-topic";
    private final static String BOOTSTRAP_SERVERS = "localhost:9092";
    private final static Logger LOG = Logger.getLogger(KafkaEnergyProducer.class.getName());


    private static KafkaProducer<String, DeviceEvent> createProducer() {
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVERS);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class.getName());
        props.put("schema.registry.url", "http://localhost:8081");
        return new KafkaProducer<String, DeviceEvent>(props);
    }

    public static void runProducer(DeviceEventModel deviceEventModel) {
        final KafkaProducer<String, DeviceEvent> producer = createProducer();

        try {
            DeviceEvent deviceEvent = DeviceEvent.newBuilder()
                    .setId(deviceEventModel.getId())
                    .setCharging(deviceEventModel.getCharging())
                    .setChargingSource(deviceEventModel.getCharging_source())
                    .setCurrentCapacity(deviceEventModel.getCurrent_capacity())
                    .setModuleLTemp(deviceEventModel.getModuleL_temp())
                    .setModuleRTemp(deviceEventModel.getModuleR_temp())
                    .setProcessor1Temp(deviceEventModel.getProcessor1_temp())
                    .setProcessor2Temp(deviceEventModel.getProcessor2_temp())
                    .setProcessor3Temp(deviceEventModel.getProcessor3_temp())
                    .setProcessor4Temp(deviceEventModel.getProcessor4_temp())
                    .setInverterState(deviceEventModel.getInverter_state())
                    .setSoCRegulator(deviceEventModel.getSoC_regulator())
                    .build();
            ProducerRecord<String, DeviceEvent> producerRecord = new ProducerRecord<String, DeviceEvent>(
                    TOPIC, (String) deviceEvent.getId(), deviceEvent
            );
            producer.send(producerRecord);
        } catch (Exception exception) {
            LOG.log(Level.SEVERE, "Error while executing main thread", exception);
        } finally {
            producer.flush();
            producer.close();
        }
    }
}
