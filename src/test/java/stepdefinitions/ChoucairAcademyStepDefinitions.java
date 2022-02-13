package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.AcademyChoucairData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.Login;
import tasks.OpenUp;
import userinterface.Search;


import java.util.List;

public class ChoucairAcademyStepDefinitions {

    private String course;

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Oscar wants to learn automation at the Academy Choucair$")
    public void thanOscarWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> AcademyChoucairData) throws Exception {
        OnStage.theActorCalled("Oscar").wasAbleTo(OpenUp.thePage(), (Login.
                onThePage(AcademyChoucairData.get(0).getStrUser(),AcademyChoucairData.get(0).getStrPassword());

    }


    @When("^he search for the course (.*) on the Chourcair Academy platform$")
    public void heSearchForTheCourseRecursosAutomatiozacionBancolombiaOnTheChourcairAcademyPlatform() throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(String question) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }

}
