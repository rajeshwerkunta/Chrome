package com.sample;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class MavenClass {

	@BeforeTest(alwaysRun= true)
	public void sample() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chrome", "D:\\FrameWork\\MavenProject\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");

	}

}
