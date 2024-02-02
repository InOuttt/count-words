#
# build stage
#
FROM maven:3.8.4-openjdk-11-slim  AS build
ENV HOME=/usr/app
RUN mkdir -p $HOME
WORKDIR $HOME
ADD . $HOME
RUN --mount=type=cache,target=/root/.m2 \ 
    mvn clean package 

#
# package stage
#
FROM openjdk:17-slim
COPY --from=build /usr/app/target/countwords-1.0.jar countWords.jar
ENTRYPOINT ["java","-jar","countWords.jar"]
