import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ThirdCase {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.edge.driver", "C:\\Users\\deves\\Documents\\Selenium\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("http://google.com");
	System.out.println(driver.getTitle());

	}

}
