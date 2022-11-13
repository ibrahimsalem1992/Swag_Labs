import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Add_Cart {

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
		
	     Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
		
		int expectedITems=6;
		
		List<WebElement> myButtons=(List<WebElement>) driver.findElements(By.className("btn"));
		for(int i=0;i<myButtons.size();i++) {
			
			myButtons.get(i).click();
		}
		
		String actualItemsAdded=driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText();
		
		int theRealNumber=Integer.parseInt(actualItemsAdded);
		
		Assert.assertEquals(actualItemsAdded, actualItemsAdded);
	
		

	}

}
