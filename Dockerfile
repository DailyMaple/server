#Dockerfile

# jdk17 image start
FROM openjdk:17

# 인자 정리
ARG JAR_FILE=daily-maple-0.0.1-SNAPSHOT.jar

#jar 파일 copy
COPY ./build/libs/${JAR_FILE} app.jar

#EntryPoint
ENTRYPOINT ["java","-jar","/app.jar"]

EXPOSE 8080