package UtilsLayer;

import org.openqa.selenium.JavascriptExecutor;

import BaseLayer.BaseClass;

public class JS  extends BaseClass{

	public static void get(String url)
	{
		((JavascriptExecutor)driver).executeScript("window.location='" + url + "';");
	}
	public static void newTab(String url)
	{
		((JavascriptExecutor)driver).executeScript("window.open('" + url + "');");
	}
	public static void refresh()
	{
		((JavascriptExecutor)driver).executeScript("history.go(0);");
	}
	public static void back(String step)
	{
		((JavascriptExecutor)driver).executeScript("history.go(-" + step + ")");
	}
	public static void forword(String step)
	{
		((JavascriptExecutor)driver).executeScript("history.go(+" + step + ")");
	}
}
