package WebsiteTests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageObjects.Homepage;


public class Registration {
    public static WebDriver driver = DriverFactory. getDriver();
    private Homepage homepage;

    public Registration() {
        this.homepage = new Homepage(driver);
    }
    @Test
    public void goHomepage(){
        homepage.goTo();
    }


}




