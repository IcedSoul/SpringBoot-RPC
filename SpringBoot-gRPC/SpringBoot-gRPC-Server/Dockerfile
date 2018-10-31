FROM java:8-jre

ADD ./target/springboot-grpc-server-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/springboot-grpc-server-0.0.1-SNAPSHOT.jar"]

EXPOSE 19694