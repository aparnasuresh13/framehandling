package framehandlingpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		//driver.switchTo().frame(0); // switching by index
		//driver.switchTo().frame("login_page");// switching by frame name
		WebElement obj = driver.findElement(By.name("login_page"));
		driver.switchTo().frame(obj); // switching by web element
		driver.findElement(By.name("fldLoginUserId")).sendKeys("1234");

	}

}
