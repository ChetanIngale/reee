package UtilsLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class HandleFrame extends BaseClass{

	public static void SwitchToChildByname(String value) 
	{
		driver.switchTo().frame(value);
	}
	public static void SwitchToChildByIndex(int index)
	{
		driver.switchTo().frame(index);
	}
	public static void SwitchToChildByWebElement(WebElement wb)
	{
		driver.switchTo().frame(wb);
	}
	public static void switchToParent()
	{
		driver.switchTo().parentFrame();
	}
	public static void switchToTopFrame()
	{
		driver.switchTo().defaultContent();
	}
}
