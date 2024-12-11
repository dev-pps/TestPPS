ThisBuild / version := "0.1.0-SNAPSHOT"

// Scala version
ThisBuild / scalaVersion := "3.3.4"

// Specifica la classe principale
assembly / mainClass := Some("HelloWorld")

// Aggiungi il repository Sonatype OSS
// Aggiungi repository se non trova in maven
resolvers += Resolver.sonatypeRepo("releases")

// Evita conflitti di dipendenze
assembly / assemblyMergeStrategy := {
  case PathList("META-INF", xs@_*) => MergeStrategy.discard
  case x                           => MergeStrategy.first
}

lazy val root = (project in file("."))
  .settings(
    name := "HelloWorld",
    version := "0.1.0-SNAPSHOT",
//    scalaVersion := "3.3.4",
//    mainClass := Some("HelloWorld"),
    libraryDependencies ++= Seq(
      // dipendenze
      "org.scalatest" %% "scalatest" % "3.2.17" % Test // ScalaTest per i test
      )
    )

