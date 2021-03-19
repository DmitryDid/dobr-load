package Objects

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object PostToken extends Simulation {

  val postToken: ChainBuilder = exec(
    http("/auth/token/user")
      .post("/auth/token/user/aee5c185-29b8-4d4c-a4bf-d7641aefc556")
      .check(status.is(200))
      .check(jsonPath("$.access_token").saveAs("access_token"))
  )
}
