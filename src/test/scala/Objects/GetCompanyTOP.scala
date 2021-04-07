package Objects

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object GetCompanyTOP extends Simulation {

  private val authHeaders = Map(
    "Authorization" -> "Bearer ${access_token}")

  val getCompanyTOP: ChainBuilder = exec(
    http("/api/v1/Company/top")
      .get("/Company/top")
      .headers {
        authHeaders
      }
      .check(status.is(200))
  ).pause(4)
}
