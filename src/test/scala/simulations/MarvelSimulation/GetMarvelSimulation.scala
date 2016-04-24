package simulations.MarvelSimulation

import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import simulations.request.{Configs, getComicBooks}

class GetMarvelSimulation extends Simulation {

    val scn = scenario("Get a list of open apis from Marvel comics")
      .exec(getComicBooks.getComicsScn)

    setUp(scn.inject(rampUsers(Configs.users) over(1)).protocols(Configs.httpSetup))

}
