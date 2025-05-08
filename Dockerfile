FROM maven:3.8-jdk-11 AS builder
WORKDIR /home/app
COPY . /home/app
RUN chmod +x ./mvnw
RUN mvn clean package -DskipTests

FROM bellsoft/liberica-runtime-container:jre-21-musl 

WORKDIR /home/app
COPY --from=builder /home/app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
