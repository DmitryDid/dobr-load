package Objects

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object getUserFavorite extends Simulation {

  private val authHeaders = Map(
    "Authorization" -> "Bearer ${access_token}")

  val getUserFavorite: ChainBuilder = exec(
    http("/api/v1/User/22/favorite")
      .get("/User/22/favorite")
      .headers {
        authHeaders
      }
      .check(status.is(200)))
}
