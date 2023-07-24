package UtilsLayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import BaseLayer.BaseClass;

public class WindowHandle extends BaseClass {

	public static ArrayList<String> handleWindowMethod(Set<String> allwindow)
	{
		Iterator it = allwindow.iterator();
		
		ArrayList<String> arr = new ArrayList<String>();
		while(it.hasNext())
		{
			arr.add(it.next().toString());
		}
		return arr;
	}
}
