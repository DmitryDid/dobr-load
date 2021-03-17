package Objects

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object GetCompanyIdImage extends Simulation {

  private val authHeaders = Map(
    "Authorization" -> "Bearer ${access_token}")

  val getCompanyIdImage5: ChainBuilder = exec(
    http("/api/v1/company/5/image")
      .get("/Company/5/image")
      .headers {
        authHeaders
      }
      .check(status.is(200)))

  val getCompanyIdImage7: ChainBuilder = exec(
    http("/api/v1/company/7/image")
      .get("/Company/7/image")
      .headers {
        authHeaders
      }
      .check(status.is(200)))

  val getCompanyIdImage6: ChainBuilder = exec(
    http("/api/v1/company/6/image")
      .get("/Company/6/image")
      .headers {
        authHeaders
      }
      .check(status.is(200)))
}
