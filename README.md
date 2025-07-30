# 🎟️ Event Management System (Spring Boot Backend)

This is a full-featured backend system for an Event Management platform built with **Spring Boot**. It handles user authentication, event creation, seat booking, feedback collection, and real-time notifications using WebSocket.

---

## 📁 Tech Stack

- **Spring Boot** (RESTful APIs, MVC, Security)
- **Spring Security** (Custom login, route protection)
- **MySQL** (Persistent data storage)
- **JPA + Hibernate** (ORM)
- **WebSocket (STOMP + SockJS)** (Real-time notifications)
- **Thymeleaf / HTML Templates** (Login, registration, events UI)
- **Bootstrap** (Frontend styling)

---

## 📦 Features

- 🔐 **User Authentication** (Registration + Login)
- 🎫 **Event Management** (Add, view, update events)
- 💺 **Seat Booking** (Track availability per event)
- 💬 **User Feedback** (Linked to event and user)
- 🔔 **WebSocket Notifications** (Real-time event updates)

---

## 🔗 REST API Endpoints Summary

### 🔐 Authentication
- `POST /register` — Register a new user
- `POST /login` — Login with username & password

### 📅 Events
- `GET /events` — Get all events
- `POST /events` — Create a new event
- `GET /events/{id}` — Get event details

### 💺 Seats
- `GET /events/{eventId}/seats` — View available seats
- `POST /events/{eventId}/seats/book` — Book a seat

### ✍️ Feedback
- `POST /events/{eventId}/feedback` — Submit feedback for an event
- `GET /events/{eventId}/feedback` — Get feedback for an event

### 📡 WebSocket (STOMP)
- Connect to: `ws://localhost:8080/ws`
- Send message to: `/app/notify`
- Subscribe to updates: `/topic/updates`

---

## ⚙️ Tech Stack

- **Spring Boot 3+**
- **Spring Security** – Form login, authentication, BCrypt
- **Spring Data JPA** – DB interactions
- **MySQL** – Database
- **WebSocket + STOMP** – Real-time messaging
- **Thymeleaf / Bootstrap (Frontend)**

---

## 🛠️ Getting Started

1. **Clone the Repo**  
   ```bash
   git clone https://github.com/your-username/event-management-backend.git

2. **Set up MySQL Database**
   ```bash
   CREATE DATABASE event_management;
3. **Configure application.properties**
   ```bash
   spring.datasource.url=jdbc:mysql://localhost:3306/event_management
   spring.datasource.username=root
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
4. **Run the Application**
   - Open in IntelliJ or Eclipse
   - Run `EventManagementSystemApplication.java`
   - App will be live at `http://localhost:8080/` 
   
   
 4.
   -Open in IntelliJ or Eclipse
   -Run EventManagementSystemApplication.java
   -App will be live at http://localhost:8080/

 5.Access Frontend Pages
 ```bash
   http://localhost:8080/login
   http://localhost:8080/register
   http://localhost:8080/events (after login)
