# Task Tracking API

## Description
This is a RESTful API for a task tracking application built using Spring Boot and PostgreSQL as the backend database. The API allows users to perform CRUD (Create, Read, Update, Delete) operations on tasks.

## Prerequisites
- Java 11 or higher
- Maven 3.6.x or higher
- PostgreSQL 11 or higher

## Setup Database
1. Install PostgreSQL on your system.
2. Create a new database named "task_tracking."
3. Execute the following SQL query to create the "tasks" table with columns id, title, description, and due_date:

```sql
CREATE TABLE tasks (
    id SERIAL PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    description TEXT,
    due_date DATE
);


Building the API:
Clone the repository or download the source code.
Open a terminal or command prompt and navigate to the project root directory.
Run the following Maven command to build the project:

    mvn clean package

The above command will compile the code, run tests, and package the application into a JAR file.

Running Tests:
Make sure PostgreSQL is running, and the "task_tracking" database is accessible.
Open a terminal or command prompt and navigate to the project root directory.
Run the following Maven command to execute unit tests and integration tests:

        mvn test

Running the API:
Make sure PostgreSQL is running, and the "task_tracking" database is accessible.
Open a terminal or command prompt and navigate to the project root directory.
Run the following command to start the Spring Boot application:

        java -jar target/task-tracking-api.jar

The API will start, and you can access it at http://localhost:8080/.


API Endpoints:
POST /tasks: Create a new task.
GET /tasks/{id}: Retrieve a task by its ID.
GET /tasks: Retrieve a list of all tasks.
PUT /tasks/{id}: Update an existing task by its ID.
DELETE /tasks/{id}: Delete a task by its ID.

Error Handling
The API implements comprehensive error handling for various scenarios, including invalid input data,
database errors, and unexpected situations. The API returns appropriate HTTP status codes and response
messages to communicate errors clearly to clients.

Data Validation
Data validation is implemented using Bean Validation (JSR-303) annotations on the Task entity.
 The API enforces data validation rules to ensure only valid and properly formatted data is stored in the database.

