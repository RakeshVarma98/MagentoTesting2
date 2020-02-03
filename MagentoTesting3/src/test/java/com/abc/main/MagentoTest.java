package com.abc.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.abc.magento.Home;
import com.abc.magento.Login;
import com.abc.magento.Welcome;

public class MagentoTest {

	@Test
	public static void test1()
	{
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://www.magento.com");
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   Welcome w=new Welcome(driver);
	   w.clickOnMyAccount();
	   Login l=new Login(driver);
	   l.typeEmail("rakhiswaero99@gmail.com");
	   l.typePassword("Nani@999");
	   l.clickOnLogin();
	   Home h=new Home(driver);
	   h.clickOnLogout();
	   driver.quit();
	}

}
