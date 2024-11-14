FROM maven:3.8.1-openjdk-11 as build
WORKDIR /app
COPY . .
RUN mvn clean package

FROM openjdk:11-jre-slim
WORKDIR /work
COPY --from=build /app/target/quarkus-app/lib/ /work/lib/
COPY --from=build /app/target/quarkus-app/*.jar /work/
COPY --from=build /app/target/quarkus-app/app/ /work/app/
COPY --from=build /app/target/quarkus-app/quarkus/ /work/quarkus/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/work/quarkus-run.jar"]