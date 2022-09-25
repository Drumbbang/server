FROM openjdk:17
ARG PROJECTNAME
ENV APPNAME ${PROJECTNAME}
RUN mkdir /app
ADD ./${PROJECTNAME} /app
WORKDIR /app
EXPOSE 8080
#CMD ["java", "-jar", "./${APPNAME}"]
CMD ["sh", "-c", "java -jar $APPNAME"]