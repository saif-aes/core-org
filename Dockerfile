FROM openjdk:17
EXPOSE 8080
ADD build/libs/core-org-0.0.1-SNAPSHOT.jar core-org-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/core-org-0.0.1-SNAPSHOT.jar"]
# /home/saiffardin/test_run/core-org