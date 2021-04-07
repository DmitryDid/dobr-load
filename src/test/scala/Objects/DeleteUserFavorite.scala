package Objects

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object DeleteUserFavorite extends Simulation {

  private val authHeaders = Map(
    "Authorization" -> "Bearer ${access_token}")

  val deleteUserFavorite: ChainBuilder = exec(
    http("/api/v1/User/18/favorite/1")
      .delete("/User/18/favorite/1")
      .headers {
        authHeaders
      }
      .check(status.is(200))
  ).pause(4)
}
