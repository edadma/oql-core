ThisBuild / licenses += "ISC" -> url("https://opensource.org/licenses/ISC")
ThisBuild / versionScheme     := Some("semver-spec")

publish / skip := true

lazy val oql_core = crossProject(JSPlatform, JVMPlatform, NativePlatform)
  .in(file("."))
  .settings(
    name         := "oql-core",
    version      := "0.0.1",
    scalaVersion := "3.5.2",
    scalacOptions ++=
      Seq(
        "-deprecation",
        "-feature",
        "-unchecked",
        "-language:postfixOps",
        "-language:implicitConversions",
        "-language:existentials",
        "-language:dynamics",
      ),
    organization := "com.vinctus",
    githubOwner  := "edadma", // this is temporary until the transfer of ownership
    resolvers += "GitHub Packages" at "https://maven.pkg.github.com/vinctustech/sjs-utils",
    githubRepository := name.value,
    libraryDependencies ++= Seq(
      "org.scalatest"          %%% "scalatest"                % "3.2.19" % "test",
      "org.scala-lang.modules" %%% "scala-parser-combinators" % "2.4.0",
//      "com.lihaoyi" %%% "pprint" % "0.9.0" % "test",
    ),
    publishMavenStyle      := true,
    Test / publishArtifact := false,
    licenses += "ISC"      -> url("https://opensource.org/licenses/ISC"),
  )
  .jvmSettings(
    libraryDependencies ++= Seq(
      "org.scala-js" %% "scalajs-stubs" % "1.1.0" % "provided",
    ),
  )
  .nativeSettings(
    libraryDependencies += "io.github.cquiroz" %%% "scala-java-time" % "2.6.0",
  )
  .jsSettings(
    stTypescriptVersion := "4.8.4",
    stIgnore += "source-map-support",
    jsEnv := new org.scalajs.jsenv.nodejs.NodeJSEnv(),
    //    Test / scalaJSUseMainModuleInitializer := true,
    //    Test / scalaJSUseTestModuleInitializer := false,
    Test / scalaJSUseMainModuleInitializer      := false,
    Test / scalaJSUseTestModuleInitializer      := true,
    scalaJSUseMainModuleInitializer             := true,
    libraryDependencies += "io.github.cquiroz" %%% "scala-java-time" % "2.6.0",
    libraryDependencies += "com.vinctus"       %%% "sjs-utils"       % "0.1.0-snapshot.33",
  )
lazy val oql_coreJS = oql_core.js.enablePlugins(ScalablyTypedConverterPlugin)
