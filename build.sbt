import com.lightbend.sbt.javaagent.JavaAgent.JavaAgentKeys.javaAgents

Global / cancelable := true
Global / onChangedBuildSource := ReloadOnSourceChanges
ThisBuild / scalaVersion := "2.13.10"

lazy val root = project
  .in(file("."))
  .enablePlugins(JavaAgent)
  .settings(
    run / fork := true,
    javaAgents += "io.kamon" % "kanela-agent" % "1.0.16",
    libraryDependencies ++= Seq(
      "io.kamon" %% "kamon-bundle" % "2.5.10", // Change this to "2.5.9" and logging the MDC tag will work again

      "ch.qos.logback" % "logback-classic" % "1.2.11",
      "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
      "net.logstash.logback" % "logstash-logback-encoder" % "7.2"
    )
  )
