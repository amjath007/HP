package happyplace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class creategroup {
	
		public static void main(String[] args) throws InterruptedException {
			System.out.println("launched");
			System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");	
			WebDriver driver = new FirefoxDriver();
			driver.get("https://happy-place.ispgnet.com/"); 
			Thread.sleep(3000);	
			driver.findElement(By.xpath("//*[@id=\"username\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("group@mailinator.com");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Amjath@123");
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div/form/button")).click();
			driver.manage().window().maximize();
			System.out.println("login successfuly");
			Thread.sleep(3000);
			System.out.println("start to create new group");
			Thread.sleep(10000);
			driver.findElement(By.id("create-new-group")).click();
			Thread.sleep(3000);			
			driver.findElement(By.xpath("//*[@id=\"chatGroup\"]/div[1]/div[2]/div/div[3]/div/ul/li[3]/div/div")).click();
			//Thread.sleep(3000);
			//driver.findElement(By.id("uploadgroupimageLabel")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("uploadgroupimage")).sendKeys("D:\\groupdp.jpeg");
			
			driver.findElement(By.xpath("//*[@id=\"Group Name\"]")).sendKeys("Auto test 1");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[@id=\"newgroup-inf\"]/div[2]/div[3]/div/div/div[1]/div[2]/input")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"newgroup-inf\"]/div[2]/div[3]/div/div/div[1]/div[2]/input")).sendKeys("chinnu cep");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"selectUser\"]/div/div[1]/div[2]")).click();
			Thread.sleep(3000);
//			Select addmember = new Select(driver.findElement(By.xpath("//*[@id=\"newgroup-inf\"]/div[2]/div[3]/div/div/div[1]/div[2]/input")));
//			addmember.selectByVisibleText("chinnu cep");
//			
			driver.findElement(By.xpath("//*[@id=\"newgroup-inf\"]/div[3]/button[2]")).click();
			Thread.sleep(4000);
//			driver.findElement(By.id("65f29cb87bc03f0317994628")).click();
//			driver.findElement(By.xpath("//*[@id=\"textarea\"]")).clear();
//			
//			driver.findElement(By.xpath("//*[@id=\"textarea\"]")).sendKeys("Hello ben");
//			Thread.sleep(10000);
//			driver.findElement(By.className("send")).click();
//			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"logout\"]")).clear();
			
			//driver.findElement(By.xpath("/html/body/div[2]/happy-place/theme-provider/happy-place-main-pane/div[2]/div[1]/div[2]/div/div/div/div[1]/div/div[2]/img")).click();
			//driver.findElement(By.xpath("/html/body/div[2]/happy-place/theme-provider/happy-place-main-pane/div[2]/div[1]/div[1]/div[1]/div[2]/div/div[3]/div/ul/li[3]/div/svg")).click();
	}}