package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class TechProStepDefinitions {
    String title;
    @Given("techpro anasayfasina gidilir")
    public void techpro_anasayfasina_gidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("techpro_url"));
    }
    @When("sayfa basligi yazdirilir")
    public void sayfa_basligi_yazdirilir() {
      title = Driver.getDriver().getTitle();
    }
    @Then("sayfa basliginda Bootcamp yazisi oldugu test edilir")
    public void sayfa_basliginda_bootcamp_yazisi_oldugu_test_edilir() {
       assertTrue(title.contains("Bootcamp"));
    }
    @Then("sayfa kapatilir")
    public void sayfa_kapatilir() {
      Driver.closeDriver();
    }
}
