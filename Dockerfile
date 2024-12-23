FROM eclipse-temurin:23-jdk

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
COPY docker-compose.yaml ./

RUN ./mvnw dependency:go-offline

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]
