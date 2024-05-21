package happyplace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.ui.Select;

public class sendmessagefromexcel {
	public static void main(String[] args) throws InterruptedException, IOException {
	System.out.println("Browser launch successful");
	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");	
	WebDriver driver = new FirefoxDriver();
	driver.get("https://happy-place.ispgnet.com/"); 
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	FileInputStream file=new FileInputStream("C:\\sendmessage.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("sheet1");
	int RowCount=sheet.getLastRowNum();
	System.out.println("Total No of Rows-"+RowCount);
	int colcount=sheet.getRow(0).getLastCellNum();
	System.out.println("Total No of Col-"+colcount);
	
	for(int i=0;i<RowCount;i++)
	{
	 XSSFRow currow=sheet.getRow(i);
	 String message=currow.getCell(0).getStringCellValue();
	 String reply=currow.getCell(1).getStringCellValue();
	 System.out.println(message);
	 System.out.println(reply);
	        driver.findElement(By.xpath("//*[@id=\"username\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("tomc@mailinator.com");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Amjath@123");
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div/form/button")).click();
			driver.manage().window().maximize();
			System.out.println("login successfuly");
			
			Thread.sleep(20000);
			
			driver.findElement(By.id("65fc1faa7923b0e22f6c5c0d")).click();
			driver.findElement(By.xpath("//*[@id=\"textarea\"]")).clear();
			
			driver.findElement(By.xpath("//*[@id=\"textarea\"]")).sendKeys(message);
			Thread.sleep(3000);
			driver.findElement(By.className("send")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"logout\"]")).click();
		    Thread.sleep(10000);
				driver.findElement(By.xpath("//*[@id=\"username\"]")).clear();
				driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("samc@mailinator.com");
				driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Amjath@123");
				driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div/form/button")).click();
				driver.manage().window().maximize();
				System.out.println("login successfuly");
				Thread.sleep(15000);
				driver.findElement(By.id("65fc1faa7923b0e22f6c5c0d")).click();
				driver.findElement(By.xpath("//*[@id=\"textarea\"]")).clear();
				
				driver.findElement(By.xpath("//*[@id=\"textarea\"]")).sendKeys(reply);
				Thread.sleep(3000);
				driver.findElement(By.className("send")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//*[@id=\"logout\"]")).click();
		
	}}}