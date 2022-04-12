package webelements;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.components.HtmlTable;

@RunWith(SerenityRunner.class)
public class HandlingWebTables extends PageObject {
	
	
	@Managed()
	WebDriver driver;
	
	
	
	@Test
	public void webtable() {
		//https://money.rediff.com/gainers/bsc/darily/goupa
		open();
		/*
		 * WebElementFacade table = $("//*[@id=\"leftcontainer\"]/table/tbody");
		 * List<WebElementFacade> rows = table.thenFindAll(By.tagName("tr"));
		 * 
		 * System.out.println(rows.size());
		 * 
		 * for(WebElementFacade row:rows) {
		 * 
		 * System.out.println(row.getText()); }
		 * 
		 * WebElementFacade row1 = $("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]");
		 * List<WebElementFacade> cols= row1.thenFindAll(By.tagName("td"));
		 * 
		 * System.out.println("Total cols are: "+cols.size());
		 */
		
		HtmlTable table = new HtmlTable($("//*[@id=\"leftcontainer\"]/table"));
		
		List<String> headers = table.getHeadings();
		
		for(String header: headers) {
			
			System.out.println(header);
		}
		
		List<WebElement> rows = table.getRowElements();
		
		for(WebElement row:rows) {
			evaluateJavascript("arguments[0].style.border='3px solid red'",$(row));
			System.out.println(row.getText());
			
		}
		
		
		System.out.println("Total rows are : "+rows.size());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	

}
