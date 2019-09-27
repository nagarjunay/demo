package com.test.automation.demo;

import java.io.FileInputStream;
import java.util.Properties;

public class config {

	public static void main(String[] args) throws Exception {

         Properties or = new Properties();
         FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\com\\test\\automation\\demo\\config.properties");
		 or.load(fis);
		 System.out.println(or.getProperty("url"));
	}

}
