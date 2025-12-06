# Spring Boot Docker Demo

This project demonstrates how to build and run a Spring Boot application inside a Docker container.  
It is created as a learning project to understand containerization with Docker.

---

## 🚀 Tech Stack
- Java 17
- Spring Boot
- Maven
- Docker
- Eclipse Temurin JDK 17 (Docker Base Image)

---

## 📁 Project Structure

springboot-docker-demo  
 ├── src/  
 ├── target/  
 ├── pom.xml  
 ├── Dockerfile  
 └── README.md  

---

## ⚙️ Step 1 — Build JAR Using Maven

build using the IDE

### ✔ Using IDE (Eclipse)
Right-click project → Run As → Maven Clean  
Right-click project → Run As → Maven Install  

### ✔ Using command line

The JAR gets generated in:

target/sb_docker_app.jar

---

## 🐳 Step 2 — Dockerfile Used

### 🔍 Explanation
- `FROM` → downloads Java 17 image  
- `COPY` → copies your JAR into container  
- `WORKDIR` → sets default working directory  
- `ENTRYPOINT` → runs the JAR when container starts  

---

## 🏗️ Step 3 — Build Docker Image

Run this inside the project root:

docker build -t sbapp .

---

## ▶️ Step 4 — Run Docker Container

docker run -p 8080:8080 sbapp

---

## ▶️ Step 5 — Application will run  

http://localhost:8080

---

