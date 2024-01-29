//package devaltetxtAutomation;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class editProject 
//{
//	static WebDriver driver;
//
//	public static void main(String[] args) throws InterruptedException 
//	{
//		WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver(); 
//        driver.get(" https://www.equalsense.ai/altadmin/Dashboard");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys("alttext@hurix.com");
//        driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).sendKeys("V!bgy0r@2o23");
//        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/button")).click();
//        Thread.sleep(2000);  
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div[3]/div[1]/div[3]/ul/li[2]/a/span")).click();
//		Thread.sleep(2000); 
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div[3]/div[2]/div[1]/div[6]/div[1]/div/div[1]/a/div/div[1]/button/i")).click();
//		driver.findElement(By.xpath("//*[@id=\"popover-user-34\"]/div[2]/ul/li[1]")).click();
//		//driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("edit ");
//		//add scroll for discription field
//		driver.switchTo().frame(1);
//		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/form/div[2]/div/button")).click();
//		//add toast message
//	}
//
//}
