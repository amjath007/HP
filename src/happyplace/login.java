package happyplace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class login {
public static void main(String[] args) throws InterruptedException {

	        System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");	
			WebDriver driver = new FirefoxDriver();
			driver.get("https://happy-place.ispgnet.com/"); 
			driver.manage().window().maximize();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id=\"username\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("benstokes@mailinator.com");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Amjath@123");
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div/form/button")).click();
			driver.close();
	}}
