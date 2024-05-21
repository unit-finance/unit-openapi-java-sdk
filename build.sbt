lazy val root = (project in file(".")).
  settings(
    organization := "unit",
    name := "unit-java-client",
    version := "0.0.4",
    scalaVersion := "2.11.4",
    scalacOptions ++= Seq("-feature"),
    javacOptions in compile ++= Seq("-Xlint:deprecation"),
    publishArtifact in (Compile, packageDoc) := false,
    resolvers += Resolver.mavenLocal,
    libraryDependencies ++= Seq(
        "com.fasterxml.jackson.core" % "jackson-core" % "2.14.1"
        "com.fasterxml.jackson.core" % "jackson-annotations" % "2.14.1"
        "com.fasterxml.jackson.core" % "jackson-databind" % "2.14.1"
        "com.fasterxml.jackson.datatype" % "jackson-datatype-jsr310" % "2.14.1"
        "org.openapitools" % "jackson-databind-nullable" % "0.2.1",
        "jakarta.annotation" % "jakarta.annotation-api" % "1.3.5" % "compile",
        "com.google.code.findbugs" % "jsr305" % "3.0.2" % "compile",
        "jakarta.annotation" % "jakarta.annotation-api" % "1.3.5" % "compile",
        "junit" % "junit" % "4.13.2"
        "org.junit.jupiter" % "junit-jupiter-api" % "5.9.1" % "test"
    )
  )
