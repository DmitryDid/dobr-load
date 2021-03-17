package Objects

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object GetChatUser extends Simulation {

  private val authHeaders = Map(
    "Authorization" -> "Bearer ${access_token}")

  val getChatUser: ChainBuilder = exec(
    http("chat/user/7")
      .get("/Chat/company/7")
      .headers {
        authHeaders
      }
      .check(status.is(200)))
}
