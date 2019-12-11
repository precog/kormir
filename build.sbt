import scala.collection.Seq

homepage in ThisBuild := Some(url("https://github.com/slamdata/kormir"))

scmInfo in ThisBuild := Some(ScmInfo(
  url("https://github.com/slamdata/kormir"),
  "scm:git@github.com:slamdata/kormir.git"))

// Include to also publish a project's tests
lazy val publishTestsSettings = Seq(
  Test / packageBin / publishArtifact := true)

lazy val root = project
  .in(file("."))
  .settings(noPublishSettings)
  .aggregate(core)
  .enablePlugins(AutomateHeaderPlugin)

lazy val core = project
  .in(file("core"))
  .settings(name := "kormir")
  .settings(
    performMavenCentralSync := false,
    publishAsOSSProject := true)
  .enablePlugins(AutomateHeaderPlugin)
