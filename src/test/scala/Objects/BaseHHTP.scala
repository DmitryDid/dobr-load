package Objects

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder

object BaseHHTP extends Simulation {

  val header = Map("Content-Type" -> "application/json;charset=utf-8")

  val HTTPRequest: HttpProtocolBuilder = http.baseUrl("https://bdobr.ru/api/v1")
    .headers(header)
}
