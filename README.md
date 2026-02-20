<div align="center">
  <img src="./src/main/resources/static/img/mailhog.jpeg" >
</div>

<div align="right">
  <img width="24" height="24" src="./src/main/resources/static/icons/backend/java/png/java.png" />
  <img width="20" height="20" src="./src/main/resources/static/icons/devops/png/maven.png" />
  <img width="22" height="22" src="./src/main/resources/static/icons/devops/png/postman.png" />
  <img width="22" height="22" src="./src/main/resources/static/icons/devops/png/git.png" />
  <img width="20" height="20" src="./src/main/resources/static/icons/backend/java/png/junit.png" />
  <img width="20" height="20" src="./src/main/resources/static/icons/devops/png/swagger.png" />
  <img width="20" height="20" src="./src/main/resources/static/icons/backend/java/png/spring-boot.png" />
  <img width="20" height="20" src="./src/main/resources/static/icons/devops/png/docker.png" />
</div>

<br>

<br>

<div align="right">
  <a href="./src/main/resources/static/translation/README.es.md" target="_blank">
    <img src="./src/main/resources/static/img/arg-flag.jpg" width="65" height="40" />
  </a>
  <a href="https://github.com/andresWeitzel/emails-notifications-MailHog" target="_blank">
    <img src="./src/main/resources/static/img/eeuu-flag.jpg" width="65" height="40" />
  </a>
</div>

<br>

<div align="center">

# Email Notifications MailHog ![Status](./src/main/resources/static/icons/badges/status-completed.svg)

</div>

This is a Spring Boot-based demo project for sending emails. It uses MailHog as an SMTP server for local testing and is fully Dockerized for easy execution.

*   [Functional tests video](https://www.youtube.com/watch?v=QMlpFdOQHfI) <a href="https://www.youtube.com/watch?v=QMlpFdOQHfI" target="_blank"> <img src="./src/main/resources/static/icons/social-networks/yt.png" width="25" /></a>

<br>

## Index 📜

<details>
  <summary> View details </summary>

<div align="right">

`Latest update: 20/02/26`

</div>

### Section 1) Description, Configuration and Technologies

*   [1.0) Description.](#10-description-)
*   [1.1) Project Execution.](#11-project-execution-)
*   [1.2) Project Structure.](#12-project-structure-)
*   [1.3) Technologies.](#13-technologies-)

### Section 2) Processing Flow and Testing

*   [2.0) Processing Flow.](#20-processing-flow-)
*   [2.1) Implemented Validations.](#21-implemented-validations-)
*   [2.2) Testing.](#22-testing-)

### Section 3) Functionality Testing and References

*   [3.0) Functionality Test.](#30-functionality-test-)
*   [3.1) Reports.](#31-reports-)
*   [3.2) Contributing.](#32-contributing-)
*   [3.3) License.](#33-license-)

<br>

</details>

<br>

## Section 1) Description, Configuration and Technologies

### 1.0) Description [🔝](#index-)

<details>
  <summary>View details</summary>

  <br>

This is a Spring Boot-based demo project for sending emails. It uses MailHog as an SMTP server for local testing and is fully Dockerized for easy execution. The project implements a simple email notification system that covers the following features:

* **User Registration**: Through a REST controller, users can register and receive a welcome email.

* **Sending Emails**: Using JavaMailSender to send emails through MailHog in the development environment.

**Requirements:**

* Java 17 or higher.

* Docker to run MailHog and the containerized application.

<br>

</details>

### 1.1) Project Execution [🔝](#index-)

<details>
  <summary>View details</summary>

<br>

* If any of the following steps don't work, watch this [video](https://www.youtube.com/watch?v=QMlpFdOQHfI)

* We create a work environment through some IDE, we may or may not create a root folder for the project, we position ourselves on it

```git
cd 'projectRootName'
```

* Once a work environment has been created, we clone the project

```git
git clone https://github.com/andresWeitzel/emails-notifications-MailHog
```

* We position ourselves on the project

```git
cd 'emails-notifications-MailHog'
```

* Before building the Docker image, you need to generate the JAR file of the project. Run the following command from the root directory of the project:

```git
./mvnw clean package
# or
mvn clean package # (If you have Maven installed globally)
```

* This will create a .jar file inside the target/ directory, with a name similar to:

```git
target/email-notifications-0.0.1-SNAPSHOT.jar
```

* This file will be used by Docker to build the application image.

* Before building and running the containers, make sure you have Docker running (for Windows, use [Docker Desktop](https://www.docker.com/products/docker-desktop))

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

* Then, to do a general cleanup of everything unused (stopped containers, untagged images, unused networks, etc.), you can use the following command:

```git
docker system prune -a --volumes
```

* We rebuild our containers

```git
docker-compose up --build
```

* `Important` : It is possible that there are other previous steps that have not been included due to synchronization between docs in relation to development. Please open a conversation thread within the 'Issues' section of the project.

<br>

</details>

### 1.2) Project Structure [🔝](#index-)

<details>
  <summary>View details</summary>

<br>

```
emails-notifications-MailHog/
├── src/
│   ├── main/
│   │   ├── java/com/example/demo/
│   │   │   ├── controller/UserController.java
│   │   │   ├── model/User.java
│   │   │   └── service/EmailService.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/img/
│   │           ├── arg-flag.jpg
│   │           ├── eeuu-flag.jpg
│   │           └── mailhog.jpeg
│   │       └── static/translation/README.es.md
│   └── test/java/com/example/demo/EmailNotificationsApplicationTests.java
├── docker-compose.yml
├── Dockerfile
├── pom.xml
└── README.md
```

<br>

</details>

### 1.3) Technologies [🔝](#index-)

<details>
  <summary>View details</summary>

  <br>

| **Technologies** | **Version** | **Purpose** |
| ------------- | ------------- | ------------- |
| [Java](https://docs.oracle.com/en/java/) | 17+ | Core programming language |
| [Spring Boot](https://spring.io/projects/spring-boot) | 3.x | Core framework for building Java applications |
| [Spring Boot Starter Web](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/) | 3.x | For creating RESTful web applications |
| [Spring Boot Starter Mail](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/) | 3.x | For handling emails |
| [Lombok](https://projectlombok.org/) | 1.18+ | Library to reduce boilerplate in code |
| [MailHog](https://github.com/mailhog/MailHog) | 1.0 | SMTP server for local email testing |
| [Docker](https://www.docker.com/) | 20+ | For creating and managing application containers |
| [Maven](https://maven.apache.org/) | 3.9+ | Build automation and dependency management |
| [JUnit](https://junit.org/junit5/) | 5.x | Testing framework |
| [Postman](https://www.postman.com/downloads/) | 10+ | Http Client for API testing |
| [Git](https://git-scm.com/downloads) | 2.x | Version Control |
| Others | - | Others |

<br>

</details>

<br>

## Section 2) Processing Flow and Testing

### 2.0) Processing Flow [🔝](#index-)

<details>
  <summary>View details</summary>

  <br>

1. **User Registration**: Receives a POST request with user data (name, email).

2. **Email Sending**: Sends a welcome email to the registered user using MailHog as SMTP.

3. **Email Verification**: The email can be viewed in the MailHog web interface.

<br>

</details>

### 2.1) Implemented Validations [🔝](#index-)

<details>
  <summary>View details</summary>

  <br>

* Email must be present and valid format (handled by JavaMailSender, but you can extend validation in the User model or controller).

* Name must be present.

<br>

</details>

### 2.2) Testing [🔝](#index-)

<details>
  <summary>View details</summary>

<br>

### 2.2.0) Verify that the application is running

* **Verify Docker containers:**

```bash
docker ps
```

You should see two containers running:
- `springboot-app` on port 8080
- `mailhog` on port 8025

* **Verify application logs:**

```bash
docker logs springboot-app
```

### 2.2.1) Access MailHog

* The MailHog web interface will be available at `http://localhost:8025`

* Here you can see all emails sent by the application

* The interface shows: sender, recipient, subject and email content

### 2.2.2) API test cases

#### Case 1: Successful user registration

**Endpoint:** `POST http://localhost:8080/api/users`

**Headers:** `Content-Type: application/json`

**Body:**

```json
{
    "name": "John Doe",
    "email": "john.doe@example.com"
}
```

**Expected response:**

```json
{
    "status": 200,
    "message": "User registered and email sent."
}
```

#### Case 2: Registration with minimal data

**Body:**

```json
{
    "name": "Jane",
    "email": "jane@test.com"
}
```

#### Case 3: Registration with special characters

**Body:**

```json
{
    "name": "María José",
    "email": "maria.jose@company.com"
}
```

### 2.2.3) Email verification in MailHog

After each successful registration, verify at `http://localhost:8025`:

* **Sender:** `spring-boot@localhost`

* **Recipient:** The email provided in the request

* **Subject:** `Welcome [name]`

* **Content:** `Hello [name], welcome to our platform!`

### 2.2.4) Test cases with tools

#### Using cURL

```bash
# Basic registration
curl -X POST http://localhost:8080/api/users \
  -H "Content-Type: application/json" \
  -d '{"name": "Carlos López", "email": "carlos@example.com"}'
```

#### Using Postman

1. Create new collection "Email Notifications"

2. Create POST request to `http://localhost:8080/api/users`

3. Add in Headers: `Content-Type: application/json`

4. Add in Body (raw JSON):

```json
{
    "name": "Test User",
    "email": "test@example.com"
}
```

### 2.2.5) Cleanup and restart

#### Clear emails in MailHog

* Access `http://localhost:8025`

* Click "Delete All" to clear all emails

#### Restart services

```bash
# Stop services
docker-compose down

# Restart services
docker-compose up --build

# Restart only the application
docker-compose restart app
```

### 2.2.6) Troubleshooting

#### Problem: No emails received

* Verify that MailHog is running: `docker ps`

* Verify MailHog logs: `docker logs mailhog`

* Verify SMTP configuration in `application.properties`

#### Problem: API connection error

* Verify that the application is running: `docker ps`

* Verify application logs: `docker logs springboot-app`

* Verify that port 8080 is available

#### Problem: Docker error

```bash
# Clean Docker completely
docker system prune -a --volumes
docker-compose up --build
```

* `Important` : Now the application is Dockerized. We can stop or run the app directly with Docker.

<br>

</details>

<br>

## Section 3) Functionality Testing and References

### 3.0) Functionality Test [🔝](#index-)

<details>
  <summary>View details</summary>

<br>

#### [Watch video](https://www.youtube.com/watch?v=QMlpFdOQHfI)

  <a href="https://www.youtube.com/watch?v=QMlpFdOQHfI">
    <img src="./src/main/resources/static/img/mailhog_yt.png" />
  </a>

<br>

</details>

### 3.1) Reports [🔝](#index-)

<details>
  <summary>View details</summary>

  <br>

* **MailHog Web Interface:** All sent emails can be viewed at [http://localhost:8025](http://localhost:8025)

* **Application Logs:**
  * View logs with `docker logs springboot-app`
  * View MailHog logs with `docker logs mailhog`

* **Troubleshooting:** See the Troubleshooting section in [Testing](#22-testing-).

<br>

</details>

### 3.2) Contributing [🔝](#index-)

<details>
  <summary>View details</summary>

  <br>

1. Fork the project

2. Create your feature branch (`git checkout -b feature/AmazingFeature`)

3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)

4. Push to the branch (`git push origin feature/AmazingFeature`)

5. Open a Pull Request

<br>

</details>

### 3.3) License [🔝](#index-)

<details>
  <summary>View details</summary>

  <br>

This project is under the MIT License - see the LICENSE file for details.

<br>

</details>
