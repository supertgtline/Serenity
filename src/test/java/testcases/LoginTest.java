package testcases;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
@RunWith(SerenityRunner.class)
public class LoginTest extends PageObject {
    @Managed(driver = "chrome")
    WebDriver driver;
    @Title("Executing Login Test")
    @Test
    public void doLogin(){
        //Lession 10
        //driver.get("https://google.com");
        open();
        driver.findElement(By.name("q")).sendKeys("Hello Serenity !");
        find(By.xpath("//*[@name='q']")).clear();
        find(By.xpath("//*[@name='q']")).clear();
        find(By.xpath("//*[@name='q']")).sendKeys("Using Find Serenity!");
        typeInto($("//*[@name='q']"),"Hello Try into");
        System.out.println(getTitle());
    }
}
