name := "ScalaJs-2.13-HelloWorld"

enablePlugins(ScalaJSPlugin)

scalaVersion := "2.13.1"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.7"