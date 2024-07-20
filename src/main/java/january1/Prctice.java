package january1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prctice 
{
	
public static void main(String[] args) throws Exception 
{
	


System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\Automation Support\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.co.in/");
Thread.sleep(3000);
/*	
	Actions act=new Actions(driver);
	
	act.moveToElement(driver.findElementByXPath("abcvfdd")).build().perform();
	
	WebElement z=driver.findElementById("oeoeoe");
	
	z.sendKeys(Keys.ESCAPE);
	
	act.contextClick().build().perform();
	act.doubleClick().build().perform();
	
	Select sl=new Select(z);
	sl.selectByIndex(1);
	sl.selectByValue("new");
	sl.selectByVisibleText("newww");

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

WebDriverWait wait=new WebDriverWait(driver, 120);
wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("abc"))));

Alert as=driver.switchTo().alert();

as.accept();
as.dismiss();
*/

 File ss=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile(ss,new File("D:\\Software Testing\\Projects\\screhhot.png"));




















	
}
}