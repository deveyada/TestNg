import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\deves\\Documents\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
