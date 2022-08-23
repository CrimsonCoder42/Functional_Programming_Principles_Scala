ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.3"

lazy val root = (project in file("."))
  .settings(
    name := "FPP_Scala"
  )

libraryDependencies += "org.apache.commons" % "commons-configuration2" % "2.8.0"
