### Watch on youtube: https://youtube.com/playlist?list=PLztMKKdMhujk2DiRXc0R37K4mLiuK7Whc

# Installing Kafka on Windows involves the following steps:

#### Step 1:Download the latest version of Apache Kafka from the official website https://kafka.apache.org/downloads.

![Kafka](images/kafka_downloads.png?raw=true "Kafka")

#### Step 2:Extract the downloaded Kafka zip file to a directory of your choice. For example, you can extract it to "C:\kafka".
```javascript unzip file
tar -xvzf kafka_2.13-3.4.0.tgz
```
#### Step 3:Copy the path of the Kafka folder. Now go to config inside Kafka folder and open zookeeper.properties file. Copy the path against the field dataDir and add /zookeeper-data to the path.
```javascript zookeeper
dataDir=C:/Kafka/kafka/zookeeper-data
```
![Kafka](images/Zookeeper.png?raw=true "Kafka")

#### Step 4:Modify the config/server.properties file. Below is the change:
```javascript server
log.dirs=C:/Kafka/kafka/kafka_logs
```
![Kafka](images/server.png?raw=true "Kafka")

## Run Kafka Server:
#### Step 1: Kafka requires Zookeeper to run. Basically, Kafka uses Zookeeper to manage the entire cluster and various brokers. Therefore, a running instance of Zookeeper is a prerequisite to Kafka.
To start Zookeeper, we can open a PowerShell prompt and execute the below command:
```javascript Start Zookeeper
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
```
#### If the command is successful, Zookeeper will start on port 2181.

#### Step 2: Now open another command prompt and change the directory to the kafka folder. Run kafka server using the command:
```javascript Start Zookeeper
.\bin\windows\kafka-server-start.bat .\config\server.properties
```
#### Now your Kafka Server is up and running, you can create topics to store messages. Also, we can produce or consume data directly from the command prompt.

#### Step 3: Create a Kafka Topic: Open a new command prompt in the location \bin\windows Run the following command:
```javascript Create topic
kafka-topics --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic test
```

#### Step 4: Creating Kafka Producer:
```javascript Create topic
kafka-console-producer.bat --broker-list localhost:9092 --topic test
```

#### Step 5: Creating Kafka Consumer:
```javascript Create topic
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test --from-beginning
```

![Kafka](images/PrdCns.png?raw=true "Kafka")
