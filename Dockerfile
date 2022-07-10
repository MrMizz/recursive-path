FROM sbtscala/scala-sbt:17.0.2_1.6.2_3.1.3

COPY ./src src
COPY build.sbt .
COPY Dockerfile .

RUN \
   sbt "testOnly audius.Spec"
