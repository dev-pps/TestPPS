ThisBuild / scalaVersion := "3.3.4"

wartremoverErrors ++= Warts.unsafe
wartremoverWarnings ++= Warts.all

lazy val startupTransition: State => State = { s: State =>
  "writeHooks" :: s
}

scalafmtOnCompile := true

lazy val root = (project in file("."))
//  .enablePlugins(ScalafmtPlugin)
//  .enablePlugins(WartRemover)
  .settings(
    name := "TestPPS",
    libraryDependencies ++= Seq(
      // dipendenze
      "org.scalatest" %% "scalatest" % "3.2.18" % Test // ScalaTest per i test
      )
  )
  Global / onLoad := {
    val old = (Global / onLoad).value
    // compose the new transition on top of the existing one
    // in case your plugins are using this hook.
    startupTransition compose old
  }