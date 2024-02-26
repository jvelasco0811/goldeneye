FROM maven:3.9.6-amazoncorretto-21 AS build
WORKDIR /app
# Copy the pom.xml and the project files to the container
COPY pom.xml .
COPY src ./src
# Build the application using Maven
RUN mvn clean package -DskipTests
#RUN ls -al target/ && sapo

FROM amazoncorretto:8-alpine3.19-jre
WORKDIR /app
# Copy the built JAR file from the previous stage to the container
COPY --from=build /app/target/goldeneye-0.0.1-SNAPSHOT.jar ./
# Set the command to run the application
CMD ["java", "-jar", "goldeneye-0.0.1-SNAPSHOT.jar"]