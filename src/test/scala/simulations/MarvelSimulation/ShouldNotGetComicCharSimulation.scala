package simulations.MarvelSimulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.scenario.Simulation
import simulations.request.{Configs, getComicBooks}

class ShouldNotGetComicCharSimulation extends Simulation {

  val scn = scenario("Should not access comic character list due to un-authorize")
      .exec(getComicBooks.notAuthGetComicScn)

  setUp(scn.inject(rampUsers(Configs.users) over(1)).protocols(Configs.httpSetup))
}
