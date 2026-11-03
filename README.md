# Employee Management System – Backend

## 📌 Project Overview

The Employee Management System (EMS) is a RESTful backend application developed using Java and Spring Boot. It provides APIs to manage employee and department information with MySQL database integration.

The application follows a layered architecture using Controller, Service, Repository, Entity, DTO and Mapper components.

## 🛠️ Technologies Used

- Java 25
- Spring Boot 4
- Spring Data JPA
- Hibernate ORM
- MySQL
- Maven
- RESTful APIs
- Postman
- IntelliJ IDEA

## ✨ Features

### Employee Management
- Create new employees
- Retrieve all employees
- Retrieve employee by ID
- Update employee details
- Delete employees

### Department Management
- Create new departments
- Retrieve all departments
- Retrieve department by ID
- Update department details
- Delete departments

### Additional Features
- REST API development
- MySQL database integration
- Entity and DTO mapping
- Employee–Department relationship using Many-to-One mapping
- Exception handling
- Layered backend architecture

## 🏗️ Project Architecture

```text
ems-backend/
│
├── src/main/java/
│   └── net/javaguides/ems_backend/
│       ├── Entity/
│       ├── controller/
│       ├── dto/
│       ├── exception/
│       ├── mapper/
│       ├── repository/
│       └── service/
│           └── impl/
│
├── src/main/resources/
│   └── application.properties
│
├── pom.xml
└── .gitignore
```

## 🗄️ Database Configuration

This project uses MySQL as its relational database.

Create the database:

```sql
CREATE DATABASE employeemanagementsystem;
```

Configure `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employeemanagementsystem
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=8081
```

Replace the username and password with your local MySQL credentials. Never upload actual database credentials to GitHub.

## ⚙️ Installation and Setup

### 1. Clone the Repository

```bash
git clone https://github.com/sivabandaru31/Spring-Boot-EMS-backend-project.git
```

### 2. Navigate to the Project

```bash
cd Spring-Boot-EMS-backend-project
```

### 3. Configure MySQL

Create the database and configure your database credentials in `application.properties`.

### 4. Build the Project

```bash
mvn clean install
```

### 5. Run the Application

```bash
mvn spring-boot:run
```

### 6. Backend URL

```text
http://localhost:8081
```

## 🔗 REST API Endpoints

### Employee APIs

| HTTP Method | Endpoint | Description |
|---|---|---|
| POST | `/api/employees` | Create Employee |
| GET | `/api/employees` | Get All Employees |
| GET | `/api/employees/{id}` | Get Employee By ID |
| PUT | `/api/employees/{id}` | Update Employee |
| DELETE | `/api/employees/{id}` | Delete Employee |

### Department APIs

| HTTP Method | Endpoint | Description |
|---|---|---|
| POST | `/api/departments` | Create Department |
| GET | `/api/departments` | Get All Departments |
| GET | `/api/departments/{id}` | Get Department By ID |
| PUT | `/api/departments/{id}` | Update Department |
| DELETE | `/api/departments/{id}` | Delete Department |

## 🧪 API Testing

All REST APIs are tested using Postman.

Testing includes:
- Employee creation and retrieval
- Employee updates and deletion
- Department creation and retrieval
- Department updates and deletion
- Employee–Department relationship

## 📸 Screenshots

Add your project screenshots here:

- Employee API – POST request
- Employee API – GET request
- Department API – GET request
- Successful API responses

## 👨‍💻 Author

**Sivakrishna Bandaru**

GitHub: https://github.com/sivabandaru31

## ⭐ Project

Employee Management System – Java Full Stack Development Project
