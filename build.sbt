ThisBuild / scalaVersion := "3.3.4"

wartremoverErrors ++= Warts.unsafe
wartremoverWarnings ++= Warts.all

lazy val root = (project in file("."))
  .settings(
    name := "TestPPS",
    libraryDependencies ++= Seq(
      // dipendenze
      "org.scalatest" %% "scalatest" % "3.2.17" % Test // ScalaTest per i test
      )
  )