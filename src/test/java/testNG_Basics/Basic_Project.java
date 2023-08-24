package testNG_Basics;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic_Project
{
public static 	WebDriver driver; 
@Test
public void Testchrome() throws Exception
{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("Chandrashekar",Keys.ENTER);
	System.out.println(driver.getTitle());
	Thread.sleep(3000);
	driver.quit();
}

//facebook executes first because f comes before g in alphabetical order so 2nd testcase will eecutes first//
@Test
public void TestFacebook() throws Exception
{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.name("email")).sendKeys("Chandrashekar",Keys.ENTER);
	System.out.println(driver.getTitle());
	Thread.sleep(3000);
	driver.quit();
}
}
