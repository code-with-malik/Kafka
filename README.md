# YouTube Channel
If you're looking to learn more about Apache Kafka please go throught the couses on our Youtube channel:
https://www.youtube.com/@codewithmalik2944

## Introduction
Apache Kafka is an open-source distributed streaming platform that was initially developed at LinkedIn. It is designed to handle large volumes of real-time data from various sources, including sensors, applications, and databases.

Kafka is a publish-subscribe messaging system that allows applications to publish data to one or more topics and consume data from one or more topics. It is a fast, scalable, and fault-tolerant system that can handle high volumes of data with low latency.

Kafka can be used for various use cases, including real-time analytics, event-driven architectures, and data integration. It has a simple architecture that consists of producers, brokers, and consumers.

## Architecture
The Kafka architecture consists of three main components: producers, brokers, and consumers.

## Producers
Producers are applications that publish data to Kafka topics. They send messages to brokers, which are then stored in partitions on the broker. Each message has a key and a value, which can be of any type.

## Brokers
Brokers are servers that store and manage Kafka topics. They receive messages from producers and store them in partitions. Brokers also handle consumer requests for data from topics.

Consumers
Consumers are applications that consume data from Kafka topics. They read messages from partitions on brokers and process them. Consumers can be part of a consumer group, which allows them to scale horizontally to handle high volumes of data.

## Installation
To install Kafka, you will need to have Java installed on your machine. Kafka requires Java 8 or later. You can download the latest version of Kafka from the Apache Kafka website.

## Getting Started
Once you have installed Kafka, you can start by running a single broker instance on your local machine. You can do this by running the following command:

bin/kafka-server-start.sh config/server.properties
This will start a Kafka broker using the default configuration file. You can then create a topic and start producing and consuming messages.

## Creating a Topic
To create a topic, you can use the following command:

bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic my-topic
This will create a topic called my-topic with a replication factor of 1 and a single partition.

## Producing Messages
To start producing messages to the my-topic topic, you can use the following command:

bin/kafka-console-producer.sh --broker-list localhost:9092 --topic my-topic
This will start a console producer that will allow you to enter messages that will be sent to the my-topic topic.

## Consuming Messages
To start consuming messages from the my-topic topic, you can use the following command:

bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic my-topic --from-beginning
This will start a console consumer that will display all messages that have been sent to the my-topic topic.

## Conclusion
Apache Kafka is a powerful tool for building real-time data pipelines and streaming applications. With its scalability, fault-tolerance, and high availability, Kafka is used by many companies to handle high volumes of streaming data.
