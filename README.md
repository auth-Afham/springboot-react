# Spring Boot & React Tech Stack

This repository demonstrates a full-stack web application using Spring Boot for the backend and React for the frontend.

## Project Structure
```
- springboot-react/
  - backend/ (Spring Boot Backend)
    - gradle.groovy.demo/ (Gradle-based Spring Boot app)
    - maven.demo/ (Maven-based Spring Boot app)
  - frontend/ (React Frontend)
```

## Backend
The backend is implemented using Spring Boot and provides RESTful APIs for data handling. Two versions of the backend are included:

### Gradle-based Spring Boot App
- Located in `backend/gradle.groovy.demo/`
- Uses Gradle for dependency management
- `build.gradle` file for configurations

### Maven-based Spring Boot App
- Located in `backend/maven.demo/`
- Uses Maven for dependency management
- `pom.xml` file for configurations

### Key Components
- `controller/` - Handles API requests
- `model/` - Defines data entities
- `repository/` - Manages database operations
- `service/` - Implements business logic

### Running the Backend
#### Using Gradle:
```sh
cd backend/gradle.groovy.demo/demo
./gradlew bootRun
```

#### Using Maven:
```sh
cd backend/maven.demo/demo
mvn spring-boot:run
```

## Frontend
The frontend is a React application that interacts with the backend APIs.

### Running the Frontend
```sh
cd frontend
npm install
npm start
```

## Technologies Used
- **Backend:** Java, Spring Boot, Spring Data JPA, Spring Security
- **Frontend:** React, JavaScript, Axios
- **Build Tools:** Maven, Gradle
- **Database:** H2 (in-memory), MySQL (optional)

## API Endpoints
Example API endpoint to fetch users:
```
GET /api/users
```

## Contributing
Feel free to fork the repository and create pull requests. Any contributions are welcome!

## License
This project is open-source and available under the MIT License.

