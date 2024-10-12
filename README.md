# Product Management REST API

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Usage](#usage)
- [File Structure](#file-structure)
- [Contributions](#contributions)
- [License](#license)

## Overview
This project is a Spring Boot REST API designed to manage products. It allows users to create, view, update, and delete products, as well as retrieve products with pagination and filtering options. The application demonstrates the use of Spring Boot for building RESTful services and Spring Data for interacting with a relational database.

### Features
- **Product Management**: Create, read, update, and delete products.
- **Pagination**: Supports pagination for listing products efficiently.
- **Filtering**: Filters products based on category and price range.

## Usage
1. **Setup and Deployment**:
    - Clone the repository to your local machine.
    - Build the application using Maven.
    - Configure your database in the `application.properties` file.
    - Run the application.

2. **Access the API**:
    - The API endpoints are available at `http://localhost:8080/api/products`.
    - You can use tools like Postman or cURL to send requests to the API.

3. **Interacting with the API**:
    - **GET** `/api/products`: Retrieve a paginated list of products, optionally filtered by category and price range.
    - **GET** `/api/products/{id}`: Retrieve a specific product by its ID.
    - **POST** `/api/products`: Create a new product.
    - **PUT** `/api/products/{id}`: Update an existing product by its ID.
    - **DELETE** `/api/products/{id}`: Delete a product by its ID.

## File Structure
- `src/main/java/com/sangarius/product_management_rest_swagger/`: Java source files for controllers, models, and services.
    - `ProductController.java`: Controller for managing product-related requests.
    - `Product.java`: Model class representing a product.
    - `ProductRepository.java`: Repository interface for managing product storage and retrieval.
    - `ProductService.java`: Service class for handling business logic related to products.
    - `ProductSpecification.java`: Class for defining product specifications and filters.
    - `Category.java`: Model class representing a product category.
    - `CategoryRepository.java`: Repository interface for managing category storage and retrieval.
    - `CategoryService.java`: Service class for handling business logic related to categories.
    - `HomeController.java`: Controller for handling the main page and navigation.
    - `ProductManagementRestSwaggerApplication.java`: Main class for running the Spring application.
    - `SwaggerConfig.java`: Configuration class for Swagger API documentation.

- `src/main/resources/application.properties`: Configuration file for the Spring application, including database settings.

## Contributions
Contributions, feedback, and suggestions are welcome. If you have any improvements or find issues, please submit a pull request or open an issue.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
