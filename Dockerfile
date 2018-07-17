FROM java:8
ADD target/config-service.jar config-service.jar
ENTRYPOINT ["java","-jar","config-service.jar"]