# Spring Boot Simple Web App

A lightweight Spring Boot web application with RESTful API endpoints for managing products. This application demonstrates the implementation of a simple CRUD application using Spring Boot, JPA, and PostgreSQL.

## Project Overview

This project is a simple web application built with Spring Boot that provides:

-   REST API endpoints for product management
-   PostgreSQL database integration
-   Basic project structure following MVC architecture

## Technologies Used

-   Java 21
-   Spring Boot 3.4.4
-   Spring Data JPA
-   PostgreSQL
-   Lombok
-   Maven for dependency management

## Prerequisites

Before running this application, make sure you have:

1.  Java 21 installed
2.  PostgreSQL database installed and running
3.  Maven or the included Maven wrapper

## Database Setup

The application requires a PostgreSQL database. Configure your database with:

-   Database name: `simple_web_app`
-   Username: `postgres`
-   Password: `1234`
-   Port: `5432`

You can modify these settings in the `application.properties` file if needed.

## Running the Application

You can run the application using the Maven wrapper:

```bash
# On Windows
mvnw.cmd spring-boot:run

# On Unix/Linux/macOS
./mvnw spring-boot:run

```

Once started, the application will be available at: http://localhost:8080

## API Endpoints

The application provides the following RESTful endpoints:

### Products API

-   **GET /products** - Get all products
-   **GET /products/{id}** - Get a product by ID
-   **POST /products/add** - Add a new product
-   **PUT /products/update** - Update an existing product
-   **DELETE /products/delete/{id}** - Delete a product by ID

### Sample Request for Adding a Product

```json
POST /products/add
{
    "name": "Sample Product",
    "price": 19.99
}

```

## Project Structure

```
simple-web-app/
├── src/
│   ├── main/
│   │   ├── java/com/lgdlong/simplewebapp/
│   │   │   ├── controller/
│   │   │   │   ├── HomeController.java
│   │   │   │   ├── LoginController.java
│   │   │   │   └── ProductController.java
│   │   │   ├── dto/
│   │   │   │   └── ProductDTO.java
│   │   │   ├── model/
│   │   │   │   └── Product.java
│   │   │   ├── repository/
│   │   │   │   └── ProductRepository.java
│   │   │   ├── service/
│   │   │   │   └── ProductService.java
│   │   │   └── SimpleWebAppApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/com/lgdlong/simplewebapp/
│           └── SimpleWebAppApplicationTests.java
└── pom.xml

```

## Development

The project uses Spring Boot DevTools which enables automatic restarts when code changes.

To modify or extend the application:

1.  Edit or add controllers in the `controller` package
2.  Create new models in the `model` package
3.  Implement new repositories in the `repository` package
4.  Add business logic in the `service` package

## Contributing

Feel free to fork this project and submit pull requests or create issues for bugs and feature requests.

## License

This project is open source and available under standard open source licenses.