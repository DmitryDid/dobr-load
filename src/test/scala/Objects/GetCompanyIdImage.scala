package Objects

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object GetCompanyIdImage extends Simulation {

  private val authHeaders = Map(
    "Authorization" -> "Bearer ${access_token}")

  val getCompanyIdImage1: ChainBuilder = exec(
    http("/api/v1/company/1/image")
      .get("/Company/1/image")
      .headers {
        authHeaders
      }
      .check(status.is(200)))

  val getCompanyIdImage2: ChainBuilder = exec(
    http("/api/v1/company/2/image")
      .get("/Company/2/image")
      .headers {
        authHeaders
      }
      .check(status.is(200)))

  val getCompanyIdImage3: ChainBuilder = exec(
    http("/api/v1/company/3/image")
      .get("/Company/3/image")
      .headers {
        authHeaders
      }
      .check(status.is(200)))
}
