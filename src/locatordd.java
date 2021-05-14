import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class locatordd {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deves\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		driver.findElement(By.id("divpaxinfo")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
		WebElement dd = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select abc = new Select(dd);
		abc.selectByIndex(3);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.close();
	}

}
