package com.adactin.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver getBrowser(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"D:\\Program Files\\AV\\AutomationPractice\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			} else {
				System.out.println("Invalid browsername");

			}

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;

	}

	public static void waitforElementVisibility(WebElement element) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 90);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void inputValuestoElement(WebElement element, String value) {
		waitforElementVisibility(element);
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void clickonElement(WebElement element) {
		waitforElementVisibility(element);
		try {
			element.click();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void selectDropDown(WebElement element, String value, String option) {
		Select s = new Select(element);
		if (option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (option.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		} else if (option.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(value);
		}

	}

	public static void movetoElement(WebElement element) {
		waitforElementVisibility(element);
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void robotActionclass(WebElement element) {
		waitforElementVisibility(element);
		try {
			Actions ac = new Actions(driver);
			ac.contextClick(element).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void robotKey(WebElement element, String condition) {
		waitforElementVisibility(element);
		try {
			Robot r = new Robot();
			if (condition.equalsIgnoreCase("press")) {
				r.keyPress(KeyEvent.VK_DOWN);
			} else if (condition.equalsIgnoreCase("release")) {
				r.keyRelease(KeyEvent.VK_DOWN);
			}
		} catch (AWTException e) {
			e.printStackTrace();
		}

	}

	public static void robotEnter(WebElement element, String condition) {
		waitforElementVisibility(element);

		try {
			Robot r = new Robot();
			if (condition.equalsIgnoreCase("Press")) {
				r.keyPress(KeyEvent.VK_ENTER);
			} else if (condition.equalsIgnoreCase("Release")) {
				r.keyRelease(KeyEvent.VK_ENTER);
			}
		} catch (AWTException e) {
			e.printStackTrace();
		}

	}

	public static void windowsHandling(WebElement element, String condition) {
		try {
			if (condition.equalsIgnoreCase("singlewindow")) {
				String pId = driver.getWindowHandle();
				System.out.println(pId);
				String parentTitle = driver.switchTo().window(pId).getTitle();
				System.out.println(parentTitle);
			} else if (condition.equalsIgnoreCase("allwindows")) {
				Set<String> allId = driver.getWindowHandles();
				for (String id : allId) {
					String allTitles = driver.switchTo().window(id).getTitle();
					System.out.println(allTitles);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void fluent() {

		Wait wait1 = new FluentWait(driver).withTimeout(5, TimeUnit.SECONDS).pollingEvery(6, TimeUnit.SECONDS)
				.ignoring(Exception.class);

	}

	public static void switchtoFrameUsingId(String option, int index) {
		try {
			{
				if (option.equalsIgnoreCase("id")) {
					driver.switchTo().frame(index);
				}
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void switchtoFrameUsingName(String option, String Framename) {

		try {
			if (option.equalsIgnoreCase("name")) {
				driver.switchTo().frame(Framename);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void switchtoFrameUsingElement(String option, WebElement element) {
		waitforElementVisibility(element);
		try {
			if (option.equalsIgnoreCase("element")) {
				driver.switchTo().frame(element);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void switchtoDefault() {
		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void closeWindow() {
		try {
			driver.close();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void quitWindow() {
		try {
			driver.quit();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void navigateTo(String url) {
		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void navigateBack() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void navigateForward() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void navigateRefresh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void simpleAlert(WebElement element) {
		waitforElementVisibility(element);
		try {
			Alert simpleAlert = driver.switchTo().alert();
			simpleAlert.accept();
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void confirmAlert(WebElement element, String condition) {
		waitforElementVisibility(element);
		try {
			Alert confirmAlert = driver.switchTo().alert();
			if (condition.equalsIgnoreCase("accept")) {
				confirmAlert.accept();
				driver.switchTo().defaultContent();
			} else if (condition.equalsIgnoreCase("dismiss")) {
				confirmAlert.dismiss();
				driver.switchTo().defaultContent();
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void promptAlert(WebElement element, String condition) {
		waitforElementVisibility(element);
		try {

			Alert promptAlert = driver.switchTo().alert();
			promptAlert.sendKeys("element");
			if (condition.equalsIgnoreCase("accept")) {
				promptAlert.accept();
			} else if (condition.equalsIgnoreCase("dismiss")) {
				promptAlert.dismiss();
				driver.switchTo().defaultContent();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void SelectRadioButton(WebElement element) {

		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getScreenshot(String filename) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File desfile = new File(System.getProperty("user.dir")+"\\Screenshot\\" +filename+ ".png");
		FileUtils.copyFile(srcfile, desfile);

	}
}
