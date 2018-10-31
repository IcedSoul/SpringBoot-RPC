FROM java:8-jre

ADD ./target/thriftrpc-server-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/thriftrpc-server-0.0.1-SNAPSHOT.jar"]

EXPOSE 19695