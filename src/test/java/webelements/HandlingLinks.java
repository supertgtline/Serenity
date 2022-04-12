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
public class HandlingLinks extends PageObject {
    @Managed()
    WebDriver driver;
    @Test
    public  void webElementTest(){
        open();
        //find(By.id("searchLanguage")).type("Dansk");
        find(By.id("searchLanguage")).selectByVisibleText("Eesti");
        find(By.id("searchLanguage")).selectByValue("hi");
        List<WebElementFacade> links = findAll(By.tagName("a"));
        System.out.println("Total count of links are: "+links.size());
       // System.out.println(values.get(7).getText());
        for(WebElementFacade link: links){
            System.out.println("Link text is : "+link.getText() +"---Printing URL----- "
            +link.getAttribute("href"));

        }
        System.out.println();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
