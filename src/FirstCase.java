import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deves\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://youtube.com");
		System.out.println(driver.getTitle());
		driver.close();

	}

}
