package UtilsLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropdown extends BaseClass{

	public static void selectByVisibleText(WebElement wb, String value)
	{
//		Select sel = new Select(wb);
//		sel.selectByVisibleText(value);
		
		new Select(wb).selectByVisibleText(value);
	}
	
	public static void selectByIndex(WebElement wb, int index)
	{
		new Select(wb).selectByIndex(index);
	}
	
	public static void selectByValue(WebElement wb,String value)
	{
		new Select(wb).selectByValue(value);
	}
	public static String captureSelectedValue(WebElement wb)
	{
		return new Select(wb).getFirstSelectedOption().getText();
	}
	public static int getDropDownCount(WebElement wb)
	{
		return new Select(wb).getOptions().size();
	}
	public static void printAllValuesFromDropDown(WebElement wb )
	{
		List<WebElement> ls = new Select(wb).getOptions();
		
		for(WebElement abc: ls)
		{
			String a = abc.getText();
			System.out.println(a);
		}
	}
	public static boolean checkSpecificValue(WebElement wb, String value)
	{
		List<WebElement> ls = new Select(wb).getOptions();
		
		for(WebElement abc: ls)
		{
			if(abc.getText().equalsIgnoreCase(value))
			{
				return true;
			}
		}
		return false;
	}
}
