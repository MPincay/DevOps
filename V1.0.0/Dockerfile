FROM java:8
MAINTAINER marcosviniciop@gmail.com
COPY WhiteBlackList-0.0.1-SNAPSHOT.jar app.jar
RUN mkdir -p DevOps/config
RUN chmod 777 -R DevOps
EXPOSE 8080
ENTRYPOINT ["java","-Duser.timezone=America/Guayaquil","-jar","/app.jar"]