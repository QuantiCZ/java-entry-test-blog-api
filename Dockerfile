# Build
FROM maven:3.8.3-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

# Package
FROM openjdk:11-jre-slim
COPY --from=build /home/app/target/java-entry-test-blog-api-1.0.0.jar /usr/local/lib/java-entry-test-blog-api.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/usr/local/lib/java-entry-test-blog-api.jar"]