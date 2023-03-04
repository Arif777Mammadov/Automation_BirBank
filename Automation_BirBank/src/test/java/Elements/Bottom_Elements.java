package Elements;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Bottom_Elements extends GeneralElements{
    public Bottom_Elements(AndroidDriver ad) {
        super(ad);
    }

    @FindBy(id = "az.kapitalbank.mbanking:id/tab_home")
    WebElement home;

    @FindBy(id = "az.kapitalbank.mbanking:id/tab_umico_market")
    WebElement market;

    @FindBy(id = "az.kapitalbank.mbanking:id/tab_payments_and_transfers")
    WebElement payments;
//Not yet
    @FindBy(id = "az.kapitalbank.mbanking:id/tab_more")
    WebElement more;

    public void press_market() {
        market.click();
    }

    public void press_payments() {
        payments.click();
    }

    public void press_home() {
        home.click();
    }
}
