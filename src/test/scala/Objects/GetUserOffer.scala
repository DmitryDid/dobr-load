package Objects

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object GetUserOffer extends Simulation {

  private val authHeaders = Map(
    "Authorization" -> "Bearer ${access_token}")

  val getUserOffer: ChainBuilder = exec(
    http("/api/v1/user/2/offer")
      .get("/User/2/offer")
      .headers {
        authHeaders
      }
      .check(status.is(200)))
}
