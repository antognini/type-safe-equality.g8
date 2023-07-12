scalaVersion := "3.3.0"
name := "type-safe-equality"
organization := "example"

name := "$name$"
libraryDependencies += "ch.produs" %% "type-safe-equality" % "0.4.1"
scalacOptions += "-language:strictEquality"
scalacOptions += "-Yimports:scala,scala.Predef,java.lang,equality.all"

