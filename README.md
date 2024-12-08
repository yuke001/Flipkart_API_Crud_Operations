# Flipkart REST API CRUD Operations

This is a Flipkart API built with Spring Boot that provides CRUD operations for managing Flipkart records. The API allows users to fetch, add, update, and delete Flipkart records, as well as add multiple records in a batch.

## Endpoints

### 1. Fetch All Flipkart Records
- **GET** `/flipkart`
- Fetches all Flipkart records.

### 2. Fetch Flipkart Record by ID
- **GET** `/flipkart/{id}`
- Fetch a Flipkart record by its unique ID.

### 3. Fetch Flipkart Record by Product Name
- **GET** `/flipkart/product/{productName}`
- Fetch a Flipkart record by the product name.

### 4. Add a New Flipkart Record
- **POST** `/flipkart`
- Adds a single Flipkart record.
- **Request Body Example:**
  ```json
  {
    "id": 1,
    "customerName": "John Doe",
    "mobile": 9876543210,
    "productName": "Smartphone X1",
    "brand": "BrandX",
    "price": 499.99,
    "orderItems": 2,
    "rating": 4.5,
    "quantity": 1
  }


### 5. Add Multiple Flipkart Records
- **POST** `/viewcarts`
- Adds multiple Flipkart records.
- **Request Body Example:**
  ```json
  [
    {
      "id": 2,
      "customerName": "Alice Smith",
      "mobile": 9123456789,
      "productName": "Laptop Pro 15",
      "brand": "TechWave",
      "price": 899.99,
      "orderItems": 1,
      "rating": 4.8,
      "quantity": 1
    },
    {
      "id": 3,
      "customerName": "Bob Brown",
      "mobile": 9876543211,
      "productName": "Smartwatch Pro",
      "brand": "WearTech",
      "price": 199.99,
      "orderItems": 1,
      "rating": 4.2,
      "quantity": 2
    }
  ]
  ```

### 6. Update an Existing Flipkart Record
- **PUT** `/flipkart`
- Updates an existing Flipkart record.
- **Request Body Example:**
  ```json
  {
    "id": 1,
    "customerName": "John Doe",
    "mobile": 9876543210,
    "productName": "Smartphone X1",
    "brand": "BrandX",
    "price": 499.99,
    "orderItems": 3,
    "rating": 4.7,
    "quantity": 2
  }
  ```

### 7. Delete a Flipkart Record by ID
- **DELETE** `/flipkart/{id}`
- Deletes a Flipkart record by its unique ID.

### 8. Update a Flipkart Record Using Patch
- **PATCH** `/flipkart/{id}`
- Partially updates a Flipkart record by its unique ID.
- **Request Body Example:**
  ```json
  {
    "price": 549.99,
    "rating": 4.6
  }
  ```

## Setup Instructions

1. Clone this repository to your local machine.
   ```bash
   git clone https://github.com/yuke001/Flipkart_Rest_API_CRUD_OPERATION.git
   ```

2. Navigate to the project directory:
   ```bash
   cd Flipkart_Rest_API_CRUD_OPERATION
   ```

3. Build the project using Maven:
   ```bash
   mvn clean install
   ```

4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

5. The API will be running on `http://localhost:8090/`.

## Technologies Used

- Java
- Spring Boot
- REST API
- Maven

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
```
