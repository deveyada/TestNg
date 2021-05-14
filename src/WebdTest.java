import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deves\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		//driver.wait(3000000);
		//System.out.println(driver.getPageSource())	;
		driver.get("http://www.twitter.com");
		driver.navigate().back();
		//driver.close();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("email id");
		//driver.close();
		driver.findElement(By.name("pass")).sendKeys("password");
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.quit();
	}

}
