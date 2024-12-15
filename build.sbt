ThisBuild / scalaVersion := "3.3.4"

scalafmtOnCompile := true
coverageEnabled := true
wartremoverErrors ++= Warts.unsafe
wartremoverWarnings ++= Warts.all

lazy val hooks = (project in file("./git-hooks"))
  .settings(
    name := "hooks",
    Global / onLoad ~= (_ andThen ("writeHooks" :: _)),
  )

lazy val root = (project in file("."))
  .settings(
    name := "TestPPS",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.18" % Test // ScalaTest per i test
    ),
  )
