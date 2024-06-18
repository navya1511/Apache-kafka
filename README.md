Apache Kafka Contents-> 


1. Kafka -> Kafka is distributed event streaming platform used for building data pipelines and streaming applications.
2. Why Kafka? -> High Throughput, Durable, Scalable, Fault Tolerant
3. Producer-> Producers public messages to Kafka Topics.
4. Consumer -> Consumer subscribes the topics and then consume the messages.
5. Topic -> this is a category by which producer can publish their messages to and consumer can consume their messages from.
6. To create a topic -> kafka-topics.sh --create --topic topic_name --bootstrap-server localhost:9092
7. Durability and Fault-Tolerance -> Kafka stores data in multiple nodes and consumer consumes from Leader Replica and follower replicas synchronize data.
8. Use Cases-> Kafka is used for real-time analytics, data lakes, aggregating data from different sources, and acting as a buffer to handle burst data loads.
9. Kafka with SpringBoot -> KafkaListener Annotation for Consumer and KafkaTemplate for Producer.
 @KafkaListener(topics = AppConstants.LOCATION_TOPIC_NAME, groupId = AppConstants.GROUP_NAME)
public void updateLocation(String value){
        System.out.println(value);
        
    }
kafkaTemplate.send("myTopic", "myMessage");

10.Filter Messages -> Implement a `RecordFilterStrategy` to filter out unwanted records before they reach the `@KafkaListener`.
11.Secure Kafka Communication -> Configure SSL properties in the `application.yml` or `application.properties` file for secure communication.
12.Brokers -> While it comes to manage storage of messages in the topic(s) we use Kafka Brokers
13. Offset -> There is a sequential ID number given to the messages in the partitions what we call, an offset. So, to identify each message in the partition uniquely, we use these offsets
14. Main Apis of Kafka -> Apache Kafka has 4 main APIs:

Producer API
Consumer API
Streams API
Connector API
15.Initialize Kafka Server -> first zookeeper initialization -> bin/zookeeper-server-start.sh config/zookeeper.properties
                              then kafka ->  bin/kafka-server-start.sh config/server.properties

16. Streams API->An API which permits an application to act as a stream processor, and also consuming an input stream from one or more topics and producing an output stream to one or more output topics, moreover, transforming the input streams to output streams effectively, is what we call Streams API.
17. Connector API-> An API which permits to run as well as build the reusable producers or consumers which connect Kafka topics to existing applications or data systems is what we call the Connector API.
18.                               
    
