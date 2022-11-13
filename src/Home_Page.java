import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Home_Page {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\i.salem.ext\\Desktop\\ibrahim\\My chrom driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		String username="standard_user";
		String password="secret_sauce";
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		String actualTiltle=driver.getTitle();
		String expectedTitle="Swag Labs";
		
		Assert.assertEquals(actualTiltle, expectedTitle);
		

	}

}
