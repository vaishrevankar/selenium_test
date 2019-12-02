package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.FirstSeliniumTest;

public class PropertiesFile {
	
	static Properties prop= new Properties();
public static void main(String[] args) {
	readPropertiesFile();
	writePropertiesFile();
}

public  static void readPropertiesFile() {
	//Properties prop = new Properties();

	try {
		InputStream input = new FileInputStream("/Users/VI20094002/eclipse-workspace/SeleniumTest/src/config/config.properties");
		prop.load(input);
		System.out.println(prop.getProperty("browser"));
		FirstSeliniumTest.browser = prop.getProperty("browser");
	System.out.println(FirstSeliniumTest.browser);
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public static void writePropertiesFile()
{
	try {
		OutputStream output = new FileOutputStream("/Users/VI20094002/eclipse-workspace/SeleniumTest/src/config/config.properties");
	prop.setProperty("browser", "Chrome");
	prop.store(output, null);
	
	} catch (Exception e) {
	
		e.printStackTrace();
	}
}
}
