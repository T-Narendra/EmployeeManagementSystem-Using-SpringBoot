## 👨‍💼 Employee Management System

A CRUD-based Employee Management System built with Java + Spring Boot using an in-memory H2 Database for rapid development and testing.

## 🚀 Features

REST APIs for Employee management

CRUD operations (Create, Read, Update, Delete)

Layered architecture: Controller → Service → Repository

In-memory H2 database (auto-reset on restart)

Tested with Postman

## 🛠️ API Endpoints

Method	Endpoint	Description

GET	/api/employees	Get all employees

GET	/api/employees/{id}	Get employee by ID

POST	/api/employees	Create new employee

PUT	/api/employees/{id}	Update employee

DELETE	/api/employees/{id}	Delete employee
