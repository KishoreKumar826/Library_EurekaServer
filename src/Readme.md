# Library Eureka Server

This project is a Spring Boot application that serves as a Eureka Server for service discovery in a microservices architecture.

## Project Features

- **Service Discovery**: Provides a registry for microservices to register themselves and discover other services.
- **Spring Boot Integration**: Built using Spring Boot for easy configuration and deployment.
- **Eureka Server**: Uses Netflix Eureka for service discovery and registration.
- **Custom Configuration**: Configurable server port and Eureka settings via `application.yml`.
- **Health Checks**: Includes health checks for monitoring the status of the Eureka server.

## Project Structure
```
/library_Eurekaserver
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── eurekaserver
│   │   │               ├── EurekaServerApplication.java
│   │   │               └── config
│   │   │                   └── CustomEurekaConfig.java
│   │   └── resources
│   │       ├── application.yml
│   │       └── static
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── eurekaserver
│                       └── EurekaServerApplicationTests.java
├── .gitignore
├── README.md
└── pom.xml
```

The Eureka Server will start and be accessible at http://localhost:8072.
