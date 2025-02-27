addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.4")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.13.1")
addSbtPlugin("org.foundweekends.conscript" % "sbt-conscript" % "0.5.8")
addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.3.1")
libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value
addSbtPlugin("com.github.sbt" % "sbt-site" % "1.6.0")
addSbtPlugin("com.github.sbt" % "sbt-ghpages" % "0.7.0")
