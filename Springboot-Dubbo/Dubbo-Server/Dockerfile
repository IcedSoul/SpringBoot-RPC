FROM java:8-jre

ADD ./target/dubbo-server-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/dubbo-server-0.0.1-SNAPSHOT.jar"]

EXPOSE 19691