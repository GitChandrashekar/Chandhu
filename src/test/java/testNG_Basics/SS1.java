package testNG_Basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//requirement is here we need to launch chrome --> open google and 
//come back launch chrome -> open facebook// 
public class SS1
{
public static WebDriver driver;


//TC1
@Test 
public void LaunchChrome()
{
driver = new ChromeDriver();	
}

//TC2
@Test
public void opengoogle() throws Exception
{
	driver.get("https://www.google.com/");
	Thread.sleep(3000);
//	driver.quit();
}

//TC3
@Test
public void openFacebook() throws Exception
{
driver.get("https://www.facebook.com/");
Thread.sleep(3000);
//driver.quit();
}

}
