package Objects

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object GetOfferTOP extends Simulation {

  private val authHeaders = Map(
    "Authorization" -> "Bearer ${access_token}")

  val getOfferTOP: ChainBuilder = exec(
    http("/api/v1/offer/top")
      .get("/Offer/top")
      .headers {
        authHeaders
      }
      .check(status.is(200)))
}
