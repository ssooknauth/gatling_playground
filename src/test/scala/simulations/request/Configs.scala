package simulations.request

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Configs {

  val url = System.getProperty("url")
  val users: Int = Integer.getInteger("users", 1)

  val httpSetup = http
    .baseURL(url)
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8") // Here are the common headers
    .doNotTrackHeader("1")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .acceptEncodingHeader("gzip, deflate")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0")
    .disableWarmUp
    .disableCaching
}
