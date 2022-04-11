package testcases;

import static java.time.temporal.ChronoUnit.SECONDS;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

@RunWith(SerenityRunner.class)
public class SerenityGmailTest extends PageObject {
    @FindBy(name="q")
    WebElement googleSearch;
    @Managed(driver = "edge")
    WebDriver driver;
    @Title("Executing Login Test")
    @Test
    public void doLogin() throws InterruptedException {
        //Lession 10
        //driver.get("https://google.com");
        open();
       find(By.id("identifierId")).type("giangthaonexle@gmail.com");
       find(By.xpath("//button[@type='button']//div[@class='VfPpkd-RLmnJb']")).click();
       find(By.xpath("//input[@type='password']")).sendKeys("password Gmail");
       Thread.sleep(3000);

    }
}
