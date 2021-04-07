package Objects

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

import java.io.File

object PutUserById extends Simulation {

  private val authHeaders = Map(
    "Authorization" -> "Bearer ${access_token}")

  val putUserById: ChainBuilder = exec(
    http("/api/v1/user/18")
      .put("/User/18")
      .headers {
        authHeaders
      }
      .formParam("name", "LoadDima")
      .formParam("isMan", true)
      .formParam("playerId", "aee5c185-29b8-4d4c-a4bf-d7641aef-did")
      .formParam("BirthYear", "1986-07-01T00:00:00")
      .formParam("image", new File("src/test/scala/resoursces/Kiprensky_Pushkin.jpg"))
      .check(status.is(200)))
}
