ThisBuild / scalaVersion := "3.3.4"

scalafmtOnCompile := true
wartremoverWarnings ++= Warts.all

lazy val startupTransition: State => State = { s: State =>
  "writeHooks" :: s
}

lazy val root = (project in file("."))
  .settings(
    name := "TestPPS",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.18" % Test // ScalaTest per i test
      )
  )
  Global / onLoad := {
    val old = (Global / onLoad).value
    startupTransition compose old
  }