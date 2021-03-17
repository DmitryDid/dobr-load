package Objects

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object GetUserStories extends Simulation {

  private val authHeaders = Map(
    "Content-Type" -> "application/json",
    "Authorization" -> "Bearer ${access_token}")

  val getUserStories: ChainBuilder =
    exec(http("user/14/stories")
      .get("/user/14/stories/")
      .headers {
        authHeaders
      }
      .check(status.is(200)))

}
