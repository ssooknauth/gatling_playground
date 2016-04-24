import com.typesafe.sbt.packager.archetypes.JavaAppPackaging
import io.gatling.sbt.utils.PropertyUtils

enablePlugins(GatlingPlugin)
enablePlugins(JavaAppPackaging)


scalaVersion := "2.11.8"
scalacOptions := Seq(
  "-encoding", "UTF-8", "-target:jvm-1.7", "-deprecation", "-feature", "-unchecked",
  "-language:implicitConversions", "-language:postfixOps")


//Pass in parameters to overwrite number of users, and base-url host: local, staging, prod etc.
javacOptions in Gatling := overrideDefaultJavaOptions("-Durl")
javacOptions in Gatling := overrideDefaultJavaOptions("-Dusers")

libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.2.0" % "test"
libraryDependencies += "io.gatling" % "gatling-test-framework" % "2.2.0" % "test"
resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

//custom alias shortcut call 'mega command' which executes sbt task: clean, compile, scalastyle, and test all in one
addCommandAlias("mega_command", ";clean ;compile ;gatling:test")

name := "gatling_playground"
version := "1.0"