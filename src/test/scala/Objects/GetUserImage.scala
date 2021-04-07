package Objects

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object GetUserImage extends Simulation {

  private val authHeaders = Map(
    "Authorization" -> "Bearer ${access_token}")

  val getUserImage: ChainBuilder = exec(
    http("/api/v1/user/1/image")
      .get("/user/1/image")
      .headers {
        authHeaders
      }
      .check(status.is(200))
  ).pause(4)
}
