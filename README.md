# EventHub Backend API

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x%20%2F%204.x-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-21-orange.svg)](https://www.oracle.com/java/)
[![MySQL](https://img.shields.io/badge/MySQL-8.x-blue.svg)](https://www.mysql.com/)
[![Redis](https://img.shields.io/badge/Redis-Cache-red.svg)](https://redis.io/)

EventHub Backend is a high-performance RESTful API service built with **Spring Boot** and **Java 21**, designed for managing events, bookings, ticketing, and notifications.

---

## 🏗️ Architecture & Package Structure

```text
src/main/java/com/eventhub/api/
├── common/             # Common models (ApiResponse, PageResponse)
├── config/             # Spring configurations (Security, Redis, Auditing, CORS)
├── controller/         # REST API Controllers
├── dto/                # Data Transfer Objects (Requests & Responses)
├── entity/             # JPA Entities (BaseEntity, etc.)
├── enums/              # Business Enums & Constants
├── exception/          # Global Exception Handling & Error Codes
├── repository/         # Spring Data JPA Repositories
├── service/            # Business Logic Interfaces
│   └── impl/           # Business Logic Implementations
└── util/               # Helper utilities & tools
```

---

## 🚀 Tech Stack

- **Framework:** Spring Boot 4.x / 3.x
- **Language:** Java 21 (LTS)
- **Database:** MySQL 8.x + Spring Data JPA (Hibernate)
- **Caching & Session:** Redis + Spring Data Redis
- **Security:** Spring Security + JWT Authentication
- **Mail:** Spring Mail (SMTP)
- **Build Tool:** Maven (Wrapper included)

---

## ⚙️ Configuration & Environment Variables

Key configurations are located in `src/main/resources/application.yaml`. You can customize them via environment variables:

| Variable | Description | Default Value |
| :--- | :--- | :--- |
| `PORT` | Server HTTP port | `8080` |
| `SPRING_DATASOURCE_URL` | MySQL Connection URL | `jdbc:mysql://localhost:3306/eventhub_db` |
| `SPRING_DATASOURCE_USERNAME` | MySQL Username | `root` |
| `SPRING_DATASOURCE_PASSWORD` | MySQL Password | `root` |
| `SPRING_DATA_REDIS_HOST` | Redis Host | `localhost` |
| `SPRING_DATA_REDIS_PORT` | Redis Port | `6379` |
| `SPRING_MAIL_USERNAME` | SMTP Email Account | `your-email@gmail.com` |
| `SPRING_MAIL_PASSWORD` | SMTP App Password | `app-password` |
| `APP_JWT_SECRET` | Secret key for signing JWTs | *(Preconfigured default)* |

---

## 🛠️ Getting Started

### Prerequisites
- **JDK 21** or later installed
- **MySQL 8.x** running locally or via Docker
- **Redis** running locally or via Docker

### 1. Clone the repository
```bash
git clone https://github.com/nguyenvanhao-GitHub/eventhub-backend.git
cd eventhub-backend
```

### 2. Build the project
```bash
# Windows
.\mvnw.cmd clean package -DskipTests

# Linux / macOS
./mvnw clean package -DskipTests
```

### 3. Run the application
```bash
# Windows
.\mvnw.cmd spring-boot:run

# Linux / macOS
./mvnw spring-boot:run
```

### 4. Health Check Endpoint
Once started, test the health check endpoint:
```bash
GET http://localhost:8080/api/v1/health
```

**Sample Response:**
```json
{
  "code": 1000,
  "message": "EventHub Service is healthy",
  "result": {
    "service": "EventHub API",
    "status": "UP",
    "version": "0.0.1-SNAPSHOT"
  },
  "timestamp": "2026-09-09T10:00:00Z"
}
```

---

## 📌 Standard API Response Structure

All API responses adhere to the unified format:

```json
{
  "code": 1000,
  "message": "Success",
  "result": { ... },
  "timestamp": "2026-09-09T10:00:00.000Z"
}
```

In case of errors:
```json
{
  "code": 1003,
  "message": "User not found",
  "timestamp": "2026-09-09T10:00:00.000Z"
}
```

---

## 📄 License
This project is open-source and available under the [MIT License](LICENSE).
