FROM java:8

COPY target/atomist-rest-0.0.1.jar /opt/build/

WORKDIR /opt/build

EXPOSE 8080

ENTRYPOINT ["java", "-Xmx1g", "-jar", "atomist-rest-0.0.1.jar"]