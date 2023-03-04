package Steps;

import Driver.Driver;
import Elements.Bottom_Elements;
import io.cucumber.java.en.*;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;


public class BirBank {

    private static AndroidDriver ad;

    @Given("Open BB")
    public static void open_BB() throws MalformedURLException {
        ad = Driver.getDriver();
    }

    Bottom_Elements b_elem = new Bottom_Elements(ad);

    @When("Log In")
    public void login() throws InterruptedException {
        Thread.sleep(7000);
    }

    @Then("Press Search")
    public void press_search() {
        b_elem.press_search();
    }

    @And("Fill search field with {string}")
    public void fillSearchFieldWith(String arg0) throws InterruptedException {
        b_elem.type_search(arg0);
        Thread.sleep(5000);
    }
//Or
    @Then("Press Market")
    public void pressMarket() {
        b_elem.press_market();
    }

    @Then("Press Easy Transfer")
    public void pressEasyTransfer() {
        b_elem.press_easy_t();
    }

    @And("Press Close")
    public void pressClose() throws InterruptedException {
        b_elem.press_close();
    }

    @Then("Press Favorite")
    public void pressFavorite() {
        b_elem.press_favorite();
    }

    @Then("Press Payments")
    public void pressPayments() {
        b_elem.press_payments();
    }

    @And("Press Home")
    public void pressHome() {
        b_elem.press_home();
    }
}