FROM java:8-jre

ADD ./target/thriftrpc-client-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/thriftrpc-client-0.0.1-SNAPSHOT.jar"]

EXPOSE 19696