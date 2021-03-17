package Objects

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object GetCompany extends Simulation {

  private val authHeaders = Map(
    "Authorization" -> "Bearer ${access_token}")

  val getCompany: ChainBuilder = exec(
    http("/api/v1/Company")
      .get("/Company")
      .headers {
        authHeaders
      }
      .check(status.is(200)))
}
