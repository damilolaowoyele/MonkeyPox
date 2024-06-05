# MonkeyPox Application

## Description
This is a Spring Boot application for managing MonkeyPox patients. It provides a RESTful API for creating, retrieving, updating, and deleting MonkeyPox patient records.

## Technologies
- Java
- Spring Boot
- Maven

## Setup
To run this project, you need to have Java and Maven installed on your machine.

1. Clone the repository:
```bash
git clone https://github.com/damilolaowoyele/MonkeyPoxApplication.git
```

2. Navigate into the project directory:
```bash
cd MonkeyPoxApplication
```

3. Build the project using Maven:
```bash
mvn clean install
```

4. Run the application:
```bash
mvn spring-boot:run
```

## API Endpoints
The application provides the following endpoints:

- `POST /api/monkeypox-patients`: Create a new MonkeyPox patient.
- `PUT /api/monkeypox-patients/{id}`: Update a MonkeyPox patient.
- `GET /api/monkeypox-patients/{id}`: Retrieve a MonkeyPox patient by ID.
- `GET /api/monkeypox-patients`: Retrieve all MonkeyPox patients.
- `DELETE /api/monkeypox-patients/{id}`: Delete a MonkeyPox patient by ID.

## Testing
The application includes a suite of unit tests for testing the controller endpoints. The tests use JUnit 5, Spring's `MockMvc` for testing HTTP requests, and Mockito for mocking dependencies.

To run the tests, use the following command:
```bash
mvn test
```

## Exception Handling
The application includes a global exception handler for handling `ResourceNotFoundException`. When a `ResourceNotFoundException` is thrown, the handler returns a `ResponseEntity` with a status of `HttpStatus.NOT_FOUND` and a body containing the exception message.

