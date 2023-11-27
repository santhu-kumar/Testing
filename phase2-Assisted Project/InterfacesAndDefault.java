package com.app.junit;


public interface InterfacesAndDefault 
{
	public void day();
	
	public default void month()
	{
		System.out.println("It is July");
	}
}