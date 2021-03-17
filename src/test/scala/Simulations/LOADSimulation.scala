package Simulations

import Objects.BaseHHTP.HTTPRequest
import Objects.DeleteUserFavorite.deleteUserFavorite
import Objects.GetChatUserById.getChatUserById
import Objects.GetCompany.getCompany
import Objects.GetCompanyById.getCompanyById
import Objects.GetCompanyCategory.getCompanyCategory
import Objects.GetCompanyIdImage._
import Objects.GetCompanyOffer.getCompanyOffer
import Objects.GetCompanyTOP.getCompanyTOP
import Objects.GetOfferIdImage._
import Objects.GetOfferTOP.getOfferTOP
import Objects.GetProductCategory.getProductCategory
import Objects.GetUser.getUser
import Objects.GetUserById.getUserById
import Objects.GetUserImage.getUserImage
import Objects.GetUserOffer.getUserOffer
import Objects.GetUserStories.getUserStories
import Objects.PostToken.postToken
import Objects.PutUserById._
import Objects.getUserFavorite.getUserFavorite
import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder

class LOADSimulation extends Simulation {

  val scn: ScenarioBuilder = scenario("first man")
    .exec(postToken)
    .exec(getUserStories)
  /*  .exec(getUserImage)*/
    .exec(getProductCategory)
    .exec(getCompany)
    .exec(getChatUserById)
    .exec(getCompanyTOP)
    .exec(getOfferTOP)
    .exec(getUser)
 /*   .exec(getCompanyIdImage5)
    .exec(getCompanyIdImage6)
    .exec(getCompanyIdImage5)
    .exec(getCompanyIdImage7)
    .exec(getCompanyIdImage6)
    .exec(getCompanyIdImage6)
    .exec(getCompanyIdImage7)
    .exec(getOfferIdImage96)
    .exec(getOfferIdImage99)
    .exec(getOfferIdImage104)*/
    .exec(putUserById)
    .exec(getUserById)
    .exec(getUserOffer)
    .exec(getUserOffer)
    .exec(getUserById)
    .exec(getCompanyCategory)
    .exec(getCompanyOffer)
    .exec(getCompanyById)
    .exec(getCompanyOffer)
    .exec(getChatUserById)
    .exec(getCompanyOffer)
    .exec(deleteUserFavorite)
    .exec(getUserFavorite)
    .exec(getUserStories)
    .exec(getUser)
    .exec(getUserStories)


  setUp(
    scn.inject(
      rampConcurrentUsers(1).to(100).during(50),
      constantConcurrentUsers(100).during(50))
  ).protocols(HTTPRequest)
}
