package com.abc.magento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login 
{
   WebDriver driver;

public Login(WebDriver driver) {
	//super();
	this.driver = driver;
}
   By email=By.xpath("  //input[@id='email']  ");
   By pass=By.xpath(" //input[@id='pass']  ");
   By login=By.xpath(" //button[@id='send2'] ");
   public void typeEmail(String un)
   {
	   driver.findElement(email).sendKeys(un);
	  
   }
   public void typePassword(String pwd)
   {
	   driver.findElement(pass).sendKeys(pwd);
   }
   public void clickOnLogin()
   {
	   driver.findElement(login).click();
   }
}
