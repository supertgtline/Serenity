package webelements;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class HandlingResizable extends PageObject {
	
	
	@Managed()
	WebDriver driver;
	
	
	
	@Test
	public void slider() {
		//https://jqueryui.com/resources/demos/resizable/default.html
		open();
		
		withAction().dragAndDropBy($("//*[@id=\"resizable\"]/div[3]"), 400, 400).perform();
		
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
