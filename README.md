# 🏎️ F1 Team Management REST API

A complete Formula 1 team management system built with **Spring Boot**, **JPA/Hibernate**, and **PostgreSQL**. Provides RESTful endpoints for managing teams, drivers, cars, race strategies, pit stops, and race data.

## Tech Stack

- **Java 17**
- **Spring Boot 4.0.5**
- **Spring Data JPA** (Hibernate ORM)
- **PostgreSQL 18**
- **Maven**

## API Endpoints

### Teams
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/teams` | Get all teams |
| GET | `/api/teams/{id}` | Get team by ID |
| POST | `/api/teams` | Create new team |
| PUT | `/api/teams/{id}` | Update team |
| DELETE | `/api/teams/{id}` | Delete team |

### Drivers
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/drivers` | Get all drivers |
| GET | `/api/drivers/{id}` | Get driver by ID |
| POST | `/api/drivers` | Create new driver |
| PUT | `/api/drivers/{id}` | Update driver |
| DELETE | `/api/drivers/{id}` | Delete driver |

### Cars
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/F1Cars` | Get all F1 cars |
| GET | `/api/F1Cars/{id}` | Get car by ID |
| POST | `/api/F1Cars` | Create new car |
| PUT | `/api/F1Cars/{id}` | Update car |
| DELETE | `/api/F1Cars/{id}` | Delete car |

### Race Strategies
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/racestrategies` | Get all strategies |
| GET | `/api/racestrategies/{id}` | Get strategy by ID |
| POST | `/api/racestrategies` | Create new strategy |
| PUT | `/api/racestrategies/{id}` | Update strategy |
| DELETE | `/api/racestrategies/{id}` | Delete strategy |

### Pit Stops
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/pitstops` | Get all pit stops |
| GET | `/api/pitstops/{id}` | Get pit stop by ID |
| POST | `/api/pitstops` | Create new pit stop |
| PUT | `/api/pitstops/{id}` | Update pit stop |
| DELETE | `/api/pitstops/{id}` | Delete pit stop |

### Races
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/races` | Get all races |
| GET | `/api/races/{id}` | Get race by ID |
| POST | `/api/races` | Create new race |
| PUT | `/api/races/{id}` | Update race |
| DELETE | `/api/races/{id}` | Delete race |

## Security

This API is secured with **JWT (JSON Web Token)** authentication.

### How it works
All endpoints except `/api/auth/login` require a valid JWT token.

### Login
```http
POST /api/auth/login
Content-Type: application/json

{
    "username": "admin",
    "password": "password123"
}
```

**Response:**
```json
{
    "token": "eyJhbGciOiJIUzI1NiJ9..."
}
```

### Using the token
Include the token in every subsequent request:
```
Authorization: Bearer <your-token>
```

### Without token
```json
HTTP 403 Forbidden
```

## Error Handling

All errors return a consistent JSON response:
```json
{
    "timestamp": "2026-04-05T10:30:00",
    "status": 404,
    "error": "Not Found",
    "message": "Team with ID 999 not found"
}
```

| Status Code | Meaning |
|-------------|---------|
| 200 | Success |
| 401 | Invalid credentials |
| 403 | Missing or invalid token |
| 404 | Resource not found |
| 500 | Internal server error |

## Database Schema

```
teams
├── team_id (PK)
├── team_name
├── principal
├── headquarters
└── founded_year

drivers
├── driver_id (PK)
├── name
├── nationality
├── driver_number
├── team_id (FK → teams)
└── experience_years

f1_cars
├── car_id (PK)
├── car_model
├── team_id (FK → teams)
├── engine_power
├── fuel_capacity
└── weight

race_strategies
├── strategy_id (PK)
├── strategy_name
├── tire_choice
├── pit_lap
├── fuel_strategy
└── driver_id (FK → drivers)

pit_stops
├── pit_stop_id (PK)
├── driver_id (FK → drivers)
├── lap_number
├── pit_duration
├── tire_change
├── fuel_added
└── status

races
├── race_id (PK)
├── race_name
├── circuit
├── race_date
├── total_laps
└── winner_driver_id (FK → drivers)
```

## Getting Started

### Prerequisites
- Java 17+
- PostgreSQL
- Maven

### Setup

1. Clone the repository:
```bash
git clone https://github.com/Novice-max/f1-team-api.git
cd f1-team-api
```

2. Create the PostgreSQL database:
```sql
CREATE DATABASE f1_team_system_db;
```

3. Configure database connection in `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/f1_team_system_db
spring.datasource.username=your_username(replace with actual!)
spring.datasource.password=your_password(replace with actual!)
```

4. Run the application:
```bash
./mvnw spring-boot:run
```

5. Access the API at `http://localhost:8080/api/teams`

## Sample Request

**POST** `/api/teams`
```json
{
    "teamName": "Mercedes",
    "principal": "Toto Wolff",
    "headQuarters": "Brackley, UK",
    "foundedYear": 2010
}
```

**Response** `200 OK`
```json
{
    "teamId": 1,
    "teamName": "Mercedes",
    "principal": "Toto Wolff",
    "headQuarters": "Brackley, UK",
    "foundedYear": 2010
}
```

## Architecture

```
Controller Layer (@RestController)
    ↓
Service Layer (@Service)
    ↓
Repository Layer (@Repository / JPA)
    ↓
PostgreSQL Database
```

## Author

Built by [Novice-max](https://github.com/Novice-max) — aspiring F1 Systems Engineer.