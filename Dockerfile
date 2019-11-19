FROM openjdk:8
EXPOSE 9003
ADD target/demoapp.jar demoapp.jar
ENTRYPOINT ["java","-jar","/demoapp.jar"]