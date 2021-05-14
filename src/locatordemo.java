import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class locatordemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\deves\\Documents\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.qaclickacademy.com");
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right']/li[5]/a")).click();
		WebElement selectdropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(selectdropdown);
		dropdown.selectByIndex(1);		
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("Option2");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("option1");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.close();
		
	}

}
