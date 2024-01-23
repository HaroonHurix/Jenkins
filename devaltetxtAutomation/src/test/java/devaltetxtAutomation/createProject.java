package devaltetxtAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createProject 
{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(); 
        driver.get(" https://www.equalsense.ai/altadmin/Dashboard");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys("alttext@hurix.com");
        driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).sendKeys("V!bgy0r@2o23");
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/button")).click();
        Thread.sleep(2000);  
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div[3]/div[1]/div[3]/ul/li[2]/a/span")).click();
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//div[@id='root']/div[2]/main/div[3]/div[2]/div/div/button/i")).click();
		driver.findElement(By.id("projectName")).sendKeys("testauto1");
		  driver.findElement(By.id("description")).sendKeys("test auto one discription");
		  driver.findElement(By.xpath("//div[@id='selectOption']/div/div/div[2]")).click(); 
		  driver.findElement(By.id("react-select-2-option-4")).click();
		 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Enter user name'])[1]/following::div[1]")).click(); 
		 driver.findElement(By.xpath("//div[@id='react-select-3-option-1']/div/div/span/div/span[2]")).click();
		 driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::button[1]")).click();
		 driver.findElement(By.xpath("//div[@id='toast-id-create-project']/button")).click();
		 //click on toast message valid invalid 
		 
		 
		 

	}

}
