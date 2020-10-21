package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage extends Base {

    public Homepage(WebDriver driver) { super(driver);
    }
    private static String URL = "https://www2.hm.com/en_gb/index.html";

    public void goTo(){
        driver.get(URL);
    }

}


