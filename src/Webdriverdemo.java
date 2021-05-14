import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deves\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.findElement(By.xpath("//*[@id='content']/div/div/div/div[1]/h2")).getText());
		System.out.println(driver.getTitle());
		driver.close();
		 
	}

}
