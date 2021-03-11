package example

import io.lemonlabs.uri.Url
import io.lemonlabs.uri.config.UriConfig
import io.lemonlabs.uri.decoding._
import org.apache.spark.sql.SparkSession

object UriDemo {

  def parseSearchRequest(str: String): String = {
    implicit val cfg = UriConfig.default.copy(queryDecoder = plusAsSpace + PercentDecoder(ignoreInvalidPercentEncoding = true))
    val uri = Url.parse(str)
    uri.hostOption.getOrElse("").toString
  }

  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder
      .appName("ScalaUriDemo")
      .getOrCreate()
    println(parseSearchRequest("https://www.example.com/test"))
    spark.stop()
  }
}
