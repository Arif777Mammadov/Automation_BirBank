package Elements;

//import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralElements {
    //private TouchAction touchAction;
    public GeneralElements(AndroidDriver ad){
        PageFactory.initElements(ad, this);
        //this.touchAction = new TouchAction(ad);
    }

    @FindBy(id = "az.kapitalbank.mbanking:id/edit_text")
    WebElement search;

    @FindBy(id = "az.kapitalbank.mbanking:id/easy_transfer")
    WebElement easy_transfer;

    @FindBy(id = "az.kapitalbank.mbanking:id/item")
    WebElement what_item;

    @FindBy(id = "az.kapitalbank.mbanking:id/header_back")
    WebElement close_button;

    public void press_search() {
        search.click();
    }

    public void type_search(String arg0) {
        search.sendKeys(arg0);
    }

    public void press_easy_t() {
        easy_transfer.click();
    }

    public void press_favorite() {
        what_item.click();
    }

    public void press_close() throws InterruptedException {
        Thread.sleep(5000);
        close_button.click();
    }
}
