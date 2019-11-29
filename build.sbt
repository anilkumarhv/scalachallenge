import play.sbt.PlaySettings
import sbt.Keys._

name := "scalachallenge"

version := "0.1"

scalaVersion := "2.13.0"

// The Play project itself
lazy val root = (project in file("."))
  .settings(
    name := """scalachallenge""",
  )

