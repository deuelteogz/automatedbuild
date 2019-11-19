FROM openjdk:8
EXPOSE 9004
ADD target/demoapp.jar demoapp.jar
ENTRYPOINT ["java","-jar","/demoapp.jar"]