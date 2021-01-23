FROM openjdk:8

COPY ./target/MyBank.war MyBank.war

CMD ["java","-jar","MyBank.war"]
