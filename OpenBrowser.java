package com.open.browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
	
	static WebDriver dr=null;
	static String basePath=System.getProperty("user.dir");
	public static void main(String[] args) throws InterruptedException {
		System.out.println("\n open FACEBOOK on chrome browser with the help of \n    SELENIUM WEBDRIVER and close the browser ");
		Thread.sleep(10000);
		System.out.println("\n        opening the chrome browser \n         ");
		OpenBrowser.getBrowserForWindows("chrome");
		Thread.sleep(10000);
		System.out.println(" \n              opening FACEBOOK                 ");
		Thread.sleep(7000);
		dr.get("https://www.facebook.com/");
		System.out.println("\n             maximize the WINDOW            ");
		Thread.sleep(7000);
		dr.manage().window().maximize();
		Thread.sleep(7000);
		System.out.println("\n              CLOSING THE BROWSER             ");
		Thread.sleep(5000);
		dr.close();
	}
	

	public static void getBrowserForWindows(String browser) {
		if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", basePath+"\\drivers\\windows\\geckodriver.exe");
			 dr=new FirefoxDriver();
		}else if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", basePath+"\\NewDriveres\\chromedriver.exe");
			 dr= new ChromeDriver();
			 dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}else {

			System.setProperty("webdriver.gecko.driver", basePath+"\\src\\test\\resources\\drivers\\windows\\geckodriver.exe");
			 dr=new FirefoxDriver();
		
			System.out.println("You have entered "+ browser+" that does not exist. Please either chrome or firefox");
		}

}


}
