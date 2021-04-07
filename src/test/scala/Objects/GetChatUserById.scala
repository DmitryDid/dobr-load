package Objects

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object GetChatUserById extends Simulation {

  private val authHeaders = Map(
    "Authorization" -> "Bearer ${access_token}")

  val getChatUserById: ChainBuilder = exec(
    http("/chat/user/3")
      .get("/Chat/company/3")
      .headers {
        authHeaders
      }
      .check(status.is(200))
  ).pause(4)
}
