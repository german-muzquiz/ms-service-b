FROM java:8

WORKDIR /usr/local

COPY target/service-*.jar /usr/local/service-b.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/usr/local/service-b.jar"]
