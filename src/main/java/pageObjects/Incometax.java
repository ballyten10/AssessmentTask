package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Incometax extends Base {
    public  Incometax (WebDriver driver){ super(driver);}

    public void Incometax(){
        WebElement AmountPaid = this.driver.findElement(By.id("amount"));
        AmountPaid.click();
        AmountPaid.sendKeys(new CharSequence[]{"1600",Keys.ENTER});
        WebElement Paid = this.driver.findElement(By.id("period"));
        Paid.click();
        Paid.sendKeys(new CharSequence[]{"Hourly",Keys.ENTER});
        WebElement Continue = this.driver.findElement(By.id("button-continue"));
        Continue.click();
        WebElement Hours= this.driver.findElement(By.id("how-many-a-week"));
        Hours.click();
        Hours.sendKeys(new CharSequence[]{"48",Keys.ENTER});
        WebElement ContinueButton = this.driver.findElement(By.id("button-continue"));
        ContinueButton.click();
        WebElement State= this.driver.findElement(By.id("overStatePensionAge-2"));
        State.click();
        State.sendKeys(new CharSequence[]{"No",Keys.ENTER});
        WebElement ContinueB = this.driver.findElement(By.id("button-continue"));
        ContinueB.click();
        WebElement TaxCode = this.driver.findElement(By.id("taxCode"));
        TaxCode.sendKeys(new CharSequence[]{"1250L",Keys.ENTER});
        WebElement ContinueBBB = this.driver.findElement(By.id("button-continue"));
        ContinueBBB.click();
        WebElement ScottishTax = this.driver.findElement(By.id("payScottishRate-2"));
        ScottishTax.sendKeys(new CharSequence[]{"No",Keys.ENTER});
        WebElement ContinueBBBB = this.driver.findElement(By.id("button-continue"));
        ContinueBBBB.click();
        WebElement GetResults = this.driver.findElement(By.id("button-get-results"));
        GetResults.click();



    }

}
