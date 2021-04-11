package Objects

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object GetCompanyOffer extends Simulation {

  private val authHeaders = Map(
    "Authorization" -> "Bearer ${access_token}")

  val getCompanyOffer: ChainBuilder = exec(
    http("/api/v1/Company/1/offer")
      .get("/Company/1/offer")
      .headers {
        authHeaders
      }
      .check(status.is(200))
  ).pause(5)
}
