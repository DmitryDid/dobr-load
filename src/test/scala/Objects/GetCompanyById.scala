package Objects

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object GetCompanyById extends Simulation {

  private val authHeaders = Map(
    "Authorization" -> "Bearer ${access_token}")

  val getCompanyById: ChainBuilder = exec(
    http("/api/v1/Company/5")
      .get("/Company/5")
      .headers {
        authHeaders
      }
      .check(status.is(200)))
}
