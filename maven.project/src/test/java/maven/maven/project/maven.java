package maven.maven.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maven {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\AmalaWS\\AmalaSDET\\CommonJarFies\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");

	}

}
