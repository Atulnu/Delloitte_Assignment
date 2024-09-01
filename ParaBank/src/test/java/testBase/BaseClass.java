package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public WebDriver driver;
	public Properties p;
	public Logger logger;

	@BeforeClass
	public void setup() throws IOException {
		FileReader file = new FileReader(".//src//test//java//config//config.properties");
		p = new Properties();
		p.load(file);

		logger = LogManager.getLogger(this.getClass());
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("//input[@name='username']")).sendKeys("2810");

	}

	@AfterClass
	public void tearDown() {
		// driver.quit();
	}

//	//WebDriver driver;
//	public Properties prop;
//	public Properties dataProp;
//		
//	public BaseClass() {
//		
//		prop = new Properties();
//		File propFile = new File("C:\\Users\\atulnu\\git\\ParaBank\\src\\main\\java\\config\\config.properties");
//		
//		dataProp = new Properties();
//		File dataPropFile = new File("C:\\Users\\atulnu\\git\\ParaBank\\src\\main\\java\\testData\\testdata.properties");
//		
//		try {
//			FileInputStream dataFis = new FileInputStream(dataPropFile);
//			dataProp.load(dataFis);
//		}catch(Throwable e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			FileInputStream fis = new FileInputStream(propFile);
//			prop.load(fis);
//		}catch(Throwable e) {
//			e.printStackTrace();
//		}
//		
//	}

}
