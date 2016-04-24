package simulations.request

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object getComicBooks {

  val headers = Map("""Accept""" -> """text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8""")

  val getComicsScn = exec(http("Get marvel list of public apis")
      .get("/docs/public")
      .headers(headers)
      .check(status.is(200))
  ) .exitHereIfFailed

  val notAuthGetComicScn = exec(http("Un-auth access to comic characters")
      .get("/v1/public/characters")
     .headers(headers)
     .check(status.is(409))
     .check(jsonPath("$.code").find.is("MissingParameter"))
  ).exitHereIfFailed
}
