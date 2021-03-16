package Simulations

import Objects.BaseHHTP.HTTPRequest
import Objects.GetProductCategory.getProductCategory
import Objects.GetToken.getToken
import Objects.GetUserImage.getUserImage
import Objects.UserStories.getUserStories
import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder

class LOADSimulation extends Simulation {

  val scn: ScenarioBuilder = scenario("first man")
    .exec(getToken)
    .exec(getUserStories)
    .exec(getUserImage)
    .exec(getProductCategory)

  setUp(
    scn.inject(
      atOnceUsers(1))
  ).protocols(HTTPRequest)
}
