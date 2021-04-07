package Objects

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object GetUserById extends Simulation {

  private val authHeaders = Map(
    "Authorization" -> "Bearer ${access_token}")

  val getUserById: ChainBuilder = exec(
    http("/api/v1/user/18")
      .get("/User/18")
      .headers {
        authHeaders
      }
      .check(status.is(200))
  ).pause(4)
}
