package testcases;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@RunWith(SerenityRunner.class)
public class SerenityGmailTest extends PageObject {
    @FindBy(name="q")
    WebElement googleSearch;
    @Managed(driver = "chrome")
    WebDriver driver;
    @Title("Executing Login Test")
    @Test
    public void doLogin() throws InterruptedException {
        //Lession 10
        //driver.get("https://google.com");
        open();
       find(By.id("identifierId")).sendKeys("giangthaonexle@gmail.com");
       find(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
       find(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("password Gmail");
       Thread.sleep(3000);

    }
}
