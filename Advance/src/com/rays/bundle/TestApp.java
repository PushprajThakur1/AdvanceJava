package com.rays.bundle;

import java.util.ResourceBundle;

public class TestApp {
	
	public static void main(String[] args) {
		
		ResourceBundle rb = ResourceBundle.getBundle("com.rays.bundle.app");
		
		
		System.out.println(rb.getString("Driver"));
		System.out.println(rb.getString("url"));
		System.out.println(rb.getString("user"));
		System.out.println(rb.getString("password"));
		System.out.println(rb.getString("initial"));
		System.out.println(rb.getString("increment"));
		System.out.println(rb.getString("max"));


	}

}
