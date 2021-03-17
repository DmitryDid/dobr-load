package Objects

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object GetCompanyCategory extends Simulation {

  private val authHeaders = Map(
    "Authorization" -> "Bearer ${access_token}")

  val getCompanyCategory: ChainBuilder = exec(
    http("/api/v1/company/category/5")
      .get("/Company/category/5")
      .headers {
        authHeaders
      }
      .check(status.is(200)))
}
