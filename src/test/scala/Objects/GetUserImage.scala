package Objects

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object GetUserImage extends Simulation {

  private val authHeaders = Map(
    "Authorization" -> "Bearer ${access_token}")

  val getUserImage: ChainBuilder = exec(
    http("/api/v1/user/22/image")
      .get("/user/22/image")
      .headers {
        authHeaders
      }
      .check(status.is(200)))
}
