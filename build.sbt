name := """GrndCtrl2MajTom"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala, SbtWeb)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  jdbc,
  "com.typesafe.play" %% "anorm" % "2.5.3",
  cache,
  "mysql" % "mysql-connector-java" % "5.1.32",
  evolutions,
  "org.pegdown" % "pegdown" % "1.5.0",
  "org.webjars" %% "webjars-play" % "2.5.0",
  "org.webjars.npm" % "jquery" % "3.1.1"
)

includeFilter in (Assets, LessKeys.less) := "*.less"

excludeFilter in (Assets, LessKeys.less) := "_*.less"

LessKeys.compress in Assets := true
