// See LICENSE for license details.
organization := "bilkent"
name := "chisel-soc"
version := "1.0.0"

lazy val commonSettings = Seq(
  scalaVersion := "2.12.15",  // This needs to match rocket-chip's scalaVersion
  scalacOptions ++= Seq(
    "-deprecation",
    "-feature",
    "-unchecked",
    "-Xsource:2.11",
    "-language:reflectiveCalls"
  ),
  addCompilerPlugin("edu.berkeley.cs" % "chisel3-plugin" % "3.5.0" cross CrossVersion.full),
  libraryDependencies += "edu.berkeley.cs" %% "chisel3" % "3.5.0",
  // We also recommend using chiseltest for writing unit tests 
  libraryDependencies += "edu.berkeley.cs" %% "chiseltest" % "0.5.0" % "test"
)

// A RootProject (not well-documented) tells sbt to treat the target directory
// as its own root project, reading its build settings. If we instead used the
// normal `project in file()` declaration, sbt would ignore all of rocket-chip's
// build settings, and therefore not understand that it has its own dependencies
// on chisel, etc.

lazy val rocketChip = RootProject(file("rocket-chip"))


lazy val topModule = (project in file(".")).
  dependsOn(rocketChip).
  settings(commonSettings: _*)
