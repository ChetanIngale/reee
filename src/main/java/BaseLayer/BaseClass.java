package BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass()
	{
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir")+"C:\\Users\\Chetan\\Desktop\\data\\Cogmento\\src\\main\\java\\ConfigLayer\\config.properties");
				prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void initilization()
	{
		if(prop.getProperty("browser").equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		if(prop.getProperty("browser").equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		if(prop.getProperty("browser").equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
			
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}
}
