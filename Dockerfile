FROM openjdk:11
WORKDIR /app
VOLUME /tmp
ADD ./target/simple-bank*.jar simple-bank.jar

COPY ./target/simple-bank*.jar simple-bank.jar
EXPOSE 8080
EXPOSE 5005
EXPOSE 3308
ENTRYPOINT ["java", "-jar", "simple-bank.jar"]
CMD ["java", "-jar", "simple-bank.jar"]
