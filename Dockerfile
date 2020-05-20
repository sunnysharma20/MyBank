FROM openjdk:8
COPY ./target/MyBank.war MyBank.war

# Add docker-compose-wait tool -------------------
ENV WAIT_VERSION 2.7.2
ADD https://github.com/ufoscout/docker-compose-wait/releases/download/$WAIT_VERSION/wait /wait
RUN chmod +x /wait

CMD ["java","-jar","MyBank.war"]
