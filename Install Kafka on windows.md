### Watch on youtube: https://youtube.com/playlist?list=PLztMKKdMhujk2DiRXc0R37K4mLiuK7Whc

# Installing Kafka on Windows involves the following steps:

### Step 1:Download Kafka: Download the latest version of Apache Kafka from the official website https://kafka.apache.org/downloads.

![Kafka](images/kafka_downloads.png?raw=true "Kafka")

### Step 2: Extract Kafka: Extract the downloaded Kafka zip file to a directory of your choice. For example, you can extract it to "C:\kafka".

### Step 3: Copy the path of the Kafka folder. Now go to config inside kafka folder and open zookeeper.properties file. Copy the path against the field dataDir and add /zookeeper-data to the path.
For example if the path is c:/kafka
``



kafka-topics --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic test