resolvers += Resolver.sonatypeRepo("releases")
resolvers += Resolver.bintrayRepo("slamdata-inc", "maven-public")

addSbtPlugin("com.eed3si9n"    % "sbt-buildinfo" % "0.12.0")
addSbtPlugin("com.slamdata"    % "sbt-slamdata"  % "5.1.5")
