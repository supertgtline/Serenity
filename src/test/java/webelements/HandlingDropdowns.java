package webelements;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

@RunWith(SerenityRunner.class)
public class HandlingDropdowns extends PageObject {
    @Managed()
    WebDriver driver;
    @Test
    public  void webElementTest(){
        open();
        //find(By.id("searchLanguage")).type("Dansk");
        find(By.id("searchLanguage")).selectByVisibleText("Eesti");
        find(By.id("searchLanguage")).selectByValue("hi");
        List<WebElementFacade> values = findAll(By.tagName("option"));
        System.out.println("Total values in dropdown are: "+values.size());
        System.out.println(values.get(7).getText());
        for(WebElementFacade value: values){
            System.out.println(value.getAttribute("lang"));

        }
        System.out.println();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
