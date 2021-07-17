package co.com.choucair.certificacion.proyectobase.stepdefinitions;


import co.com.choucair.certificacion.proyectobase.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;



public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants to learn automation at the academy Chourcair$")

    public void thanBrandomWantsToLearnAutomationAtTheAcademyChoucair()  {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage());

    }

    @When("^he search for the course Recursos Automatizacion Bancolombia on the choucair academy platform$")

    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform()  {

    }

    @Then("^he find the course called Recursos Automatizacion Bancolombia$")

    public void heFindTheCourseCalledRecursosAutomatizacionBancolombia() {

    }


}