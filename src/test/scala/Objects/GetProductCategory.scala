package Objects

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object GetProductCategory extends Simulation {

  private val authHeaders = Map(
    "Authorization" -> "Bearer ${access_token}")

  val getProductCategory: ChainBuilder = exec(
    http("ProductCategory")
      .get("/ProductCategory")
      .headers {
        authHeaders
      }
      .check(status.is(200)))
}
