# 🚀 IT Communication Platform

IT Communication Platform is a **microservices-based backend system** built with **Spring Boot 3**.  
The platform demonstrates scalable backend architecture, service-to-service communication, and production-style development practices.

---

# 🧱 Architecture

The system consists of independent microservices.  
Each service follows the **Database-per-Service** pattern and can run independently.

## Services

| Service | Description |
|-------|-------|
| notification-service | Handles notification delivery |
| account-service | Manages user financial accounts and balances |
| achievement-service | Handles gamification and achievements |
| analytics-service | Tracks user activity and engagement |
| payment-service | Processes payments, invoices, and refunds |
| post-service | Manages posts, comments, likes and content |
| project-service | Handles project creation and management |
| url-shortener | Generates short links for platform resources |
| user-service | Manages user accounts and profiles |

---

# 🛠 Tech Stack

- Java 17  
- Spring Boot 3  
- Spring Data JPA  
- Spring Cloud OpenFeign  
- PostgreSQL  
- Redis  
- Liquibase  
- Testcontainers  
- MapStruct  
- Lombok
- Docker
- Kafka


---


## 📦 Installation

### 1. Clone the repository

```bash
git clone https://github.com/annaantoshkova13/ITCommunicationPlatform.git
cd ITCommunicationPlatform
```

---

# ⚙️ Running with Docker

### PostgreSQL
```bash
docker run -d \
--name postgres \
-e POSTGRES_USER=postgres \
-e POSTGRES_PASSWORD=postgres \
-e POSTGRES_DB=platform \
-p 5432:5432 \
postgres:15
```

### Redis
```bash
docker run -d \
--name redis \
-p 6379:6379 \
redis:7
```

### Zookeeper
```bash
docker run -d \
--name zookeeper \
-p 2181:2181 \
confluentinc/cp-zookeeper:7.5.0
```

### Kafka
```bash
docker run -d \
--name kafka \
-p 9092:9092 \
-e KAFKA_ZOOKEEPER_CONNECT=host.docker.internal:2181 \
-e KAFKA_ADVERTISED_LISTENERS=PLAINTEXT://localhost:9092 \
-e KAFKA_OFFSETS_TOPIC_REPLICATION_FACTOR=1 \
confluentinc/cp-kafka:7.5.0
```

---
