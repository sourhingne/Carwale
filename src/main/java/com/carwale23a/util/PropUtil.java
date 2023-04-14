package com.carwale23a.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropUtil {
	
	public String getValue(String filepath, String key){
		String value = "";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filepath);
			Properties prop = new Properties();
				prop.load(fis);
				value=prop.getProperty(key);
			System.out.println("Returning locator:" +value);
		} catch (FileNotFoundException e) {
			System.err.println("File not found:" + filepath);
		} catch (IOException e) {
			System.err.println("unable to load properties file:" + filepath);
		}
		return value;
	}
	
	public String getLocater(String key)  {
		String baseDir=System.getProperty("user.dir");
	String locator	= getValue(baseDir+"/src/main/resources/OR.properties", key);
		return locator;
	}
}
	
	 