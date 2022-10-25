#### Guide
How to configure Prometheus and Grafana for spring boot service monitoring. 


### Prerequisite
* jdk-1.8.0
* maven 3.6.3
* docker & docker-compose

#### Build the application with Maven
It's a maven based application, To build the application following command need to be run from command line.

```
mvn package
```

#### Run the application

```aidl
java -jar target/service-monitoring-0.0.1-SNAPSHOT.jar
```
**Make sure 8080 port is free**
#### Spin up Prometheus and Grafana

```
docker-compose up 
```


**Make sure 9090 and 3000 port is free**

#### Visualization
Now launch any browser and enter the following url

```
http://localhost:3000
```
**Grafana UI** will show up and by adding **Prometheus** as data source you can monitor the spring boot application.
