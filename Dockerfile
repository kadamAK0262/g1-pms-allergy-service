FROM openjdk:17
EXPOSE 8080
ADD target/g1-pms-allergy-docker.jar g1-pms-allergy-docker.jar
ENTRYPOINT [ "java","-jar","/g1-pms-allergy-docker.jar" ]