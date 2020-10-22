package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage extends Base {

    public Homepage(WebDriver driver) { super(driver);
    }
    private static String URL = "https://www.tax.service.gov.uk/estimate-paye-take-home-pay/your-pay";
    private static final By START_NOW_BUTTON = By.id("get-started");

    public void goTo(){
        driver.get(URL);
    }


    public void navigateToIncomeTax(){
        waitAndClick(START_NOW_BUTTON);
    }

}


