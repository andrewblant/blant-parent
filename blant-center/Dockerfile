FROM blant/jre8:3
VOLUME /tmp
ADD blant-center.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 8761
