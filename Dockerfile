FROM openjdk:8
EXPOSE 8080
ADD target/demoapp.jar demoapp.jar
ENTRYPOINT ["java","-jar","/demoapp.jar"]