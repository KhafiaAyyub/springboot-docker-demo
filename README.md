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
```
FROM eclipse-temurin:17-jdk
COPY target/sb_docker_app.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java", "-jar", "sb_docker_app.jar"]
```

### 🔍 Explanation
- `FROM` → downloads Java 17 image  
- `COPY` → copies your JAR into container  
- `WORKDIR` → sets default working directory  
- `ENTRYPOINT` → runs the JAR when container starts  

---

## 🏗️ Step 3 — Build Docker Image

Run this inside the project root:

`docker build -t sbapp . `

---

## ▶️ Step 4 — Run Docker Container

`docker run -p 8080:8080 sbapp`

---

## ▶️ Step 5 — Application will run  

` http://localhost:8080 `

---
---

## 🔥 Docker Commands Cheat Sheet

### 🏗️ Image Commands
| Command | Description |
|--------|-------------|
| `docker images` | List all images |
| `docker pull <image>` | Download an image |
| `docker build -t <name> .` | Build image from Dockerfile |
| `docker rmi <image>` | Remove an image |

---

### 🚀 Container Commands
| Command | Description |
|--------|-------------|
| `docker ps` | List running containers |
| `docker ps -a` | List all containers (including stopped) |
| `docker run -p 8080:8080 <image>` | Run container with port mapping |
| `docker stop <container>` | Stop a running container |
| `docker start <container>` | Start a stopped container |
| `docker restart <container>` | Restart container |
| `docker rm <container>` | Remove a container |

---

### 📦 Logs & Debugging
| Command | Description |
|--------|-------------|
| `docker logs <container>` | Show logs of container |
| `docker logs -f <container>` | Live log streaming |
| `docker exec -it <container> /bin/bash` | Enter a container shell |

---

### 🧹 Cleanup Commands
| Command | Description |
|--------|-------------|
| `docker system prune` | Remove unused data |
| `docker container prune` | Remove all stopped containers |
| `docker image prune` | Remove dangling images |

---

### 🏛️ Docker Compose (if you learn later)
| Command | Description |
|--------|-------------|
| `docker-compose up -d` | Start services |
| `docker-compose down` | Stop & remove services |
| `docker-compose logs -f` | Show live logs |

