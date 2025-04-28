<div align = "center">
  <img src="./src/main/resources/static/img/mailhog.jpeg" >
</div>

<br>

<div align="right">
     <a href="./translations/README.es.md" target="_blank">
       <img src="./src/main/resources/static/img/arg-flag.jpg" width="10%" height="10%" />
   </a>
    <a href="https://github.com/andresWeitzel/Api_Rest_Microservices_Projects" target="_blank">
       <img src="./src/main/resources/static/img/eeuu-flag.jpg" width="10%" height="10%" />
   </a>
</div>

<div align="center">

## Email Notifications MailHog

</div>

<br>

This is a Spring Boot-based demo project for sending emails. It uses MailHog as an SMTP server for local testing and is fully Dockerized for easy execution.
[Demo](https://www.youtube.com/watch?v=QMlpFdOQHfI)

### Technologies and Dependencies
* Spring Boot: Core framework for building Java applications.
* Spring Boot Starter Web: For creating RESTful web applications.
* Spring Boot Starter Mail: For handling emails.
* Lombok: A library to reduce boilerplate in code.
* MailHog: SMTP server for local email testing.
* Docker: For creating and managing application containers.

### Features
* User Registration: Through a REST controller, users can register and receive a welcome email.
* Sending Emails: Using JavaMailSender to send emails through MailHog in the development environment.

### Requirements
* Java 17 or higher.
* Docker to run MailHog and the containerized application.

### Configuration and Execution
* If any of the following steps don't work, watch this [video](https://www.youtube.com/watch?v=QMlpFdOQHfI)
* Repository Clone
```git
git clone https://github.com/youruser/email-notifications.git
cd email-notifications
```
* Before building the Docker image, you need to generate the JAR file of the project. Run the following command from the root directory of the project:
```git
./mvnw clean package
or
mvn clean package (If you have Maven installed globally)
```
* This will create a .jar file inside the target/ directory, with a name similar to:
```git
target/email-notifications-0.0.1-SNAPSHOT.jar
```
* This file will be used by Docker to build the application image.
* Before building and running the containers, make sure you have Docker running (for Windows, use [Docker Desktop]([https://nodejs.org/en/download](https://www.docker.com/products/docker-desktop/)))
* Once installed, make sure Docker is running
```git
docker --version
```
* Once Docker is running, you can build and deploy the containers
```git
docker-compose up --build
```
* If there is any problem building our service environment with Docker and if any image is in use and you cannot remove it directly, you can force the removal with the following command:
```git
docker rmi -f $(docker images -q)
```
* Then, to do a general cleanup of everything unused (stopped containers, untagged images, unused networks, etc.), you can use the following command::
```git
docker system prune -a --volumes
```
* We rebuild our containers
```git
docker-compose up --build
```

### Testing
* Access MailHog. The MailHog web interface will be available at `http://localhost:8025`, where you can view sent emails.
* You can test the API using Postman or any HTTP client by sending a POST request to `http://localhost:8080/api/users` with the following JSON body.
```git
{
"name": "John",
"email": "john@example.com"
}
```
* `Important` : Now the application is Dockerized. We can stop or run the app directly with Docker.
