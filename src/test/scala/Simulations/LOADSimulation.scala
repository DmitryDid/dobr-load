package Simulations

import Objects.BaseHHTP.HTTPRequest
import Objects.GetChatUser.getChatUser
import Objects.GetCompany.getCompany
import Objects.GetCompanyTOP.getCompanyTOP
import Objects.GetProductCategory.getProductCategory
import Objects.GetUserImage.getUserImage
import Objects.GetUserStories.getUserStories
import Objects.PostToken.postToken
import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder

class LOADSimulation extends Simulation {

  val scn: ScenarioBuilder = scenario("first man")
    .exec(postToken)
    .exec(getUserStories)
    .exec(getUserImage)
    .exec(getProductCategory)
    .exec(getCompany)
    .exec(getChatUser)
    .exec(getCompanyTOP)

  setUp(
    scn.inject(
      atOnceUsers(1))
  ).protocols(HTTPRequest)
}
