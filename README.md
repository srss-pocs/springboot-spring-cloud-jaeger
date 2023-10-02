Spring Boot 3.1.4
A Simple Spring Boot Spring Cloud Jaeger Integration for distributed tracing

Install Docker in ur local
Maven Build and Docker Compose Up 

java -jar target/jaeger-0.0.1-SNAPSHOT.jar --spring.application.name=Service-1 --server.port=8080

java -jar target/jaeger-0.0.1-SNAPSHOT.jar --spring.application.name=Service-2 --server.port=9090

curl localhost:8080/service/path1

![image](https://github.com/srss-pocs/springboot-spring-cloud-jaeger/assets/145287517/faacd175-c60a-4aa6-a0af-a8a7484f9707)


