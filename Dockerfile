FROM openjdk:17
EXPOSE 8080
ADD target/rajjni786.jar rajjni786.jar
ENTRYPOINT ["java","-jar","/rajjni786.jar"]