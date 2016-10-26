name := "algorithm-learning"

version := "1.0"

scalaVersion := "2.11.7"
    
libraryDependencies ++= Seq(
  "org.scalanlp" %% "breeze" % "0.12", //main linear algebra lib
//  "org.scalanlp" %% "breeze-natives" % "0.12", //native implementations
   "org.scalanlp" %% "breeze-viz" % "0.12", //visualization
  "org.scalatest" %% "scalatest" % "3.0.0" % "test"
)

resolvers += "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"

testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-oF")
