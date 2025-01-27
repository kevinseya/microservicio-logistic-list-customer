# GRAPHQL in Java with Spring Boot

This project is a simple GRAPHQL created with Spring Boot that allows managing the CUSTOMER domain, specifically for the LIST microservice. The API offers the basic operation such as list customers, displaying the GRAPHI technology screen as the main page.
## Project Structure

- **`ListCustomerApplication.java`**: The main class that runs the Spring Boot application and defines the GRAPHI tecnology.

- `POST /graphql`: Allows you to list the customers, under the required query.

## Requirements

- **JDK 17** o superior.
- **Maven** (for dependency management and project construction).

## Installation

1. **Clone the repository**

    ```bash
    git clone <https://github.com/kevinseya/microservicio-logistic-list-customer.git>
    ```

2. **Build and run the application** with Maven:

    ```bash
    mvn spring-boot:run
    ```

3. The application run on: `http://localhost:8080`.

## Use of GraphQL

### 1. POST /graphql

List customers. The request body must contain the user details in JSON format with query
POST request example:
```bash
POST /graphql Content-Type: application/json
    
    {
    "query": "query { customers { id name lastname email phone address } }"
    }
```
**Response:**
```json
    {
  "data": {
    "customers": [
      {
        "id": "0f855de5-8768-4fc5-ad2d-0c304aab7a81",
        "name": "John",
        "lastname": "Doe",
        "email": "john.doe3@example.com",
        "phone": "1234567890",
        "address": "Gonzalo Hidalgo y Gualberto Perez S9-50"
      }
    ]
  }
}
```
**Response code:**
- **`200 OK:`** List customers.
- **`400 Bad Request:`** Bad Request.
- **`500 Internal Server Error:`** Server error.
