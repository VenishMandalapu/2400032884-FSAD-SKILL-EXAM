 Shipment Management Application

Project Overview
This is a Spring Boot application that performs CRUD operations on Shipment entities using JPA.

Project Structure

src/main/java/com/klef/fsad/exam/
├── ExamApplication.java          # Main Spring Boot Application
├── model/
│   └── Shipment.java            # Entity class
├── repository/
│   └── ShipmentRepository.java  # JPA Repository
├── service/
│   ├── ShipmentService.java     # Service Interface
│   └── ShipmentServiceImpl.java # Service Implementation
└── controller/
    └── ShipmentController.java  # REST Controller


Database Configuration
- Database Name: fsadexam
- The database will be auto-created if it doesn't exist
- Default MySQL credentials: root/root (update in application.properties if needed)

API Endpoints

 POST - Add Shipment
- **URL**: `http://localhost:8080/api/shipments`
- **Method**: POST
- **Content-Type**: application/json
- **Request Body**:
```json
{
    "shipmentId": 1,
    "name": "Electronics Shipment",
    "date": "2024-01-15",
    "status": "PENDING",
    "sourceLocation": "New York",
    "destinationLocation": "Los Angeles",
    "weight": 50.5,
    "description": "Electronic goods shipment"
}

Note: Shipment ID MUST be provided and cannot be null.

 PUT - Update Shipment
- **URL**: `http://localhost:8080/api/shipments/{id}`
- **Method**: PUT
- **Content-Type**: application/json
- **Request Body** (fields to update):
```json
{
    "status": "SHIPPED",
    "destinationLocation": "Chicago"
}
```

### GET - Get All Shipments
- **URL**: `http://localhost:8080/api/shipments`
- **Method**: GET

### GET - Get Shipment by ID
- **URL**: `http://localhost:8080/api/shipments/{id}`
- **Method**: GET

### DELETE - Delete Shipment
- **URL**: `http://localhost:8080/api/shipments/{id}`
- **Method**: DELETE

## How to Run
1. Ensure MySQL is running on localhost:3306
2. Update database credentials in `src/main/resources/application.properties` if needed
3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## Testing with Postman
1. Start the Spring Boot application
2. Open Postman
3. Test the POST and PUT endpoints as described above

