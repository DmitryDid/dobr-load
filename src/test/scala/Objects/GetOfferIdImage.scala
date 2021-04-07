package Objects

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object GetOfferIdImage extends Simulation {

  private val authHeaders = Map(
    "Authorization" -> "Bearer ${access_token}")

  val getOfferIdImage1: ChainBuilder = exec(
    http("/api/v1/Offer/96/image")
      .get("/Offer/1/image")
      .headers {
        authHeaders
      }
      .check(status.is(200)))

  val getOfferIdImage2: ChainBuilder = exec(
    http("/api/v1/Offer/104/image")
      .get("/Offer/2/image")
      .headers {
        authHeaders
      }
      .check(status.is(200)))

  val getOfferIdImage3: ChainBuilder = exec(
    http("/api/v1/Offer/99/image")
      .get("/Offer/3/image")
      .headers {
        authHeaders
      }
      .check(status.is(200)))
}
