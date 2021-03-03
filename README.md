# POC - Study of Spring Cloud Stream + RabbitMQ

### 🚀 About

This project was created aiming to study these tecnologies and get something already finished to guide new projects where it is used.

### 🔨 Technologies
* [Java 11](https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html)
* [Spring Cloud Stream](https://spring.io/projects/spring-cloud-stream)
* [RabbitMQ](https://www.cloudamqp.com/)

### 💻 How to

To start this project, first you need docker-compose to initiate the RabbitMQ, inside the project files run: 
```sh
$ docker-compose up
```

After the RabbitMQ is started, you need to start the publisher and consumer, inside each project run:
```sh
$ mvn clean install
$ mvn spring-boot:run
```

---

Developed by: [Caique Campos](https://www.linkedin.com/in/caiquecsx/) 🚀