package UtilsLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class Utils extends BaseClass {

	public static void click(WebElement wb)
	{
		if((wb.isDisplayed())&&(wb.isEnabled()))
		{
			wb.click();
		}
	}
	public static void sendKeys(WebElement wb, String value)
	{
		if((wb.isDisplayed())&&(wb.isEnabled()))
		{
			wb.sendKeys(value);
		}
	}
	
	public static void clickOnRadioButton(List<WebElement> ls, String name)
	{
		for(WebElement abc: ls)
		{
			if(abc.getAttribute("id").equals(name)) 
			{
				if(!abc.isSelected())
				{
					abc.click();
				}
			}
		}
	}
	
	public void clickOnCheckBox(List<WebElement> ls)
	{
		for(WebElement abc: ls)
		{
			abc.click();
		}
	}
	public static void explicitWait(By by, Long seconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
}
