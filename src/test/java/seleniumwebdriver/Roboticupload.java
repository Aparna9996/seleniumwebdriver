package seleniumwebdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Roboticupload {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		//It is for all the elements in the script
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//Click on File Upload button
		WebElement ele = driver.findElement(By.xpath("//input[@id='file-upload']"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).click().build().perform();
		
		//CTRL+C Operation
		String url = "C:\\Users\\Hi\\Pictures\\Scalar java certificate.png";
		StringSelection path = new StringSelection(url);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path,null);
		
		//CTRL+V
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		//Perform ENTER operation
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

		
		
	}



