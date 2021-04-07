package Objects

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object GetUser extends Simulation {

  private val authHeaders = Map(
    "Authorization" -> "Bearer ${access_token}")

  val getUser: ChainBuilder = exec(
    http("/api/v1/user")
      .get("/User")
      .headers {
        authHeaders
      }
      .check(status.is(200)))
}
