FROM openjdk:11

RUN mkdir /app

Copy src/ /app

WORKDIR /app

CMD java Main.java