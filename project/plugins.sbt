addSbtPlugin("io.gatling" % "gatling-sbt" % "2.2.0")
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.13.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.0.3")
//addSbtPlugin("org.scalastyle" % "scalastyle-sbt-plugin" % "0.8.0")
addSbtPlugin("org.programmiersportgruppe.sbt" %% "tabulartestreporter" % "3.0.0")

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases"