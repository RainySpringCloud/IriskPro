package com.spring.irisk.irisk.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;
import java.util.Random;

public class Producer {

    public static String topic = "shenhua";

    public static void main(String[] args) {
        Properties p = new Properties();
        p.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"127.0.0.1:9092");
        p.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        p.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,StringSerializer.class);
        KafkaProducer<String,String> kafkaProducer = new KafkaProducer<String, String>(p);

        try{

            while(true){
                String msg = "Hello " +  new Random().nextInt(100);
                ProducerRecord<String,String> record = new ProducerRecord<>(topic,msg);
                kafkaProducer.send(record);
                System.out.println("发送成功" + msg);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            kafkaProducer.close();
        }

    }


}
