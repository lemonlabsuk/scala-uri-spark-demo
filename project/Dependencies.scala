import sbt._

object Dependencies {
  object spark {
    val version = "3.0.2"
    lazy val core = "org.apache.spark" %% "spark-core" % version
    lazy val sql = "org.apache.spark" %% "spark-sql" % version
  }
  object scalaTest {
    lazy val funspec = "org.scalatest" %% "scalatest-funspec" % "3.2.2"
  }
  object lemonlabs {
    lazy val uri = "io.lemonlabs" %% "scala-uri" % "3.1.0"
  }

}
