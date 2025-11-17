<!-- 
    EmployeeApp README – Stylish & Clean
    Designed by pallavibaj2005
-->

<p align="center">
  <img src="https://img.shields.io/badge/Spring%20Boot-2.7%2B-brightgreen?logo=springboot" alt="Spring Boot Badge"/>
  <img src="https://img.shields.io/badge/Java-17%2B-orange?logo=openjdk" alt="Java Badge"/>
  <img src="https://img.shields.io/badge/Maven-build-blue?logo=apachemaven" alt="Maven Badge"/>
  <img src="https://img.shields.io/badge/Thymeleaf-UI-green?logo=thymeleaf" alt="Thymeleaf Badge"/>
</p>

<h1 align="center">🚀 EmployeeApp</h1>
<p align="center"><strong>Spring Boot Employee Management – REST API + Thymeleaf UI</strong></p>

---

## 🏷️ Overview

**EmployeeApp** is a lightweight, starter-friendly Spring Boot application following the Model–Service–Controller (MSC) architecture.<br>
It demonstrates REST API development and dynamic UI rendering with Thymeleaf.<br>
Use it to learn, extend, or as a template for your next employee-centric application!

---

## ✨ Features

- **Model Layer:**  
  `Employee.java` – Fields: <kbd>id</kbd>, <kbd>name</kbd>, <kbd>role</kbd>; Constructor, getters, setters.

- **Service Layer:**  
  `EmployeeService.java` –  
    ⤷ Loads sample employees at startup (`@PostConstruct`)  
    ⤷ Provides methods:
    - `getAllEmployees()`
    - `getEmployeeById(int id)`
    ⤷ Stores data in-memory (`List<Employee>`)

- **Controller Layer:**  
  - `EmployeeController` (REST API)
    - <kbd>GET /api/employees</kbd> — All employees
    - <kbd>GET /api/employees/{id}</kbd> — By ID
  - `WebController` (Thymeleaf UI)
    - <kbd>GET /home</kbd> — Employee list web page

- **Thymeleaf View:**  
  `home.html` — Loops through employees, displays name & role.

---

## 🗂️ Project Structure

```plaintext
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
```

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot (Web, MVC)
- Thymeleaf
- Maven

---

## 🚦 How It Works

1. Application starts ⇒ Service layer loads sample employees.
2. **REST API:**  
   - `GET /api/employees`  
   - `GET /api/employees/{id}`
3. **UI:**  
   - `GET /home` (shows employee table via Thymeleaf)
4. Controllers route, service processes, model stores!

---

## 🏁 Getting Started

**1. Build & Run:**
```bash
mvn spring-boot:run
```

**2. Open in Browser:**

- 🌐 UI: [`http://localhost:8080/home`](http://localhost:8080/home)
- 🔗 API: [`http://localhost:8080/api/employees`](http://localhost:8080/api/employees)  
  [`http://localhost:8080/api/employees/1`](http://localhost:8080/api/employees/1)

---

## 🎯 Purpose

- Clean architecture (MSC)
- Hands-on REST API development
- Dynamic UI (Thymeleaf)
- Basic service abstraction
- In-memory operations
- **Perfect** for learning or starting your employee management project!

---

<p align="center">
  <sub>Made with ❤️ by <a href="https://github.com/pallavibaj2005">pallavibaj2005</a></sub>
</p>
