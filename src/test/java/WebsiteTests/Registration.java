package WebsiteTests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageObjects.Homepage;
import pageObjects.Incometax;


public class Registration {
    public static WebDriver driver = DriverFactory. getDriver();
    private Homepage homepage;
    private Incometax incometax;


    public Registration() {
        this.homepage = new Homepage(driver);
        this.incometax = new Incometax(driver);
    }
    @Test
    public void goHomepage(){ homepage.goTo();
    }

    @Test
    public void tax(){
        homepage.goTo();
        this.incometax.Incometax();
    }

    @Test
    public void Paid(){
        homepage.goTo();
        this.incometax.Incometax();


    }




}






