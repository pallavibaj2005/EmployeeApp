🚀 EmployeeApp – Spring Boot Employee Management (REST + Thymeleaf)

EmployeeApp is a lightweight Spring Boot application built using a clean Model–Service–Controller (MSC) architecture.
It provides both REST APIs for employee data access and a simple Thymeleaf UI for displaying employee details.


🔧 Features
✔ Model Layer

Employee.java

Contains fields: id, name, role

Includes constructor, getters, and setters


✔ Service Layer

EmployeeService.java

Initializes sample employee data using @PostConstruct

Provides core business operations:

getAllEmployees()

getEmployeeById(int id)

Uses an in-memory List<Employee> (no database yet)


✔ Controller Layer
EmployeeController (REST API)

Base Path: /api/employees

Method	Endpoint	Description
GET	/api/employees	Get all employees
GET	/api/employees/{id}	Get employee by ID
WebController (Thymeleaf UI)
GET	/home	Displays employees on home page


🧩 Thymeleaf View
home.html

Displays the list of employees

Uses th:each to iterate and show name + role


📁 Project Structure
src/main/java/com/example/employeeapp/
│
├── controller/
│   ├── EmployeeController.java
│   └── WebController.java
│
├── model/
│   └── Employee.java
│
└── service/
    └── EmployeeService.java

src/main/resources/templates/
└── home.html


🧠 How the App Works

Application starts → EmployeeService loads sample employees.

REST clients can access employee data via /api/employees.

UI users can visit /home to view the employee list in a webpage.

Controllers handle routing, service handles logic, model holds data.


💼 Tech Stack

Java 17+

Spring Boot (Web, MVC)

Thymeleaf

Maven


🏁 Running the Application
mvn spring-boot:run



Visit in browser:

UI → http://localhost:8080/home

API → http://localhost:8080/api/employees
      http://localhost:8080/api/employees/1


🎯 Purpose

This project showcases:

Clean Spring Boot architecture

REST API development

Thymeleaf-based UI rendering

Basic service layer abstraction

In-memory list operations

Perfect as a learning project or starter template.
