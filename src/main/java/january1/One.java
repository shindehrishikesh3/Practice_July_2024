package january1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class One extends Xpathh
{


	
public static void main(String[] args) throws Exception 
{

	
	System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\Automation Support\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	//EdgeDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
    String title=driver.getTitle();
	
	String actual="Google";
	if(title.equalsIgnoreCase(actual))
	{
		System.out.println("PASS");
	}else
	{
		System.out.println("FAIL");
	}
	/*
	driver.navigate().refresh();

	WebElement signinn=driver.findElementByXPath(signIn);
	signinn.click();
   
	Thread.sleep(3000);
	WebElement privacyy=driver.findElementByXPath(privacy);
	privacyy.click();
	
	Set<String> win=driver.getWindowHandles();
	Iterator<String> itr=win.iterator();
	itr.next();
	String win1=itr.next();
	driver.switchTo().window(win1);
	Thread.sleep(3000);
	String winText=driver.getTitle();
	System.out.println(winText);
	
driver.findElementByXPath("(//*[@class='MyGDhe '])[2]").click();
	
	*/
	Thread.sleep(3000);
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
}	
}
