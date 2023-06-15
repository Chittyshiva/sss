package com.hrms.lib;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class General extends Global {
//TO provide all re-usable fun:/methods related to whole application 
public void openApplication() {
driver.navigate().to(url);
System.out.println("Application Opened");

}
public void closeApplication() {
driver.close();
System.out.println("Application closed");
}
public void login()
{
driver.findElement(By.name(txt_loginname)).sendKeys(un);
driver.findElement(By.name(txt_password)).sendKeys(pw);
driver.findElement(By.name("Submit")).click();
System.out.println("Login completed");
}

public void logout() {
driver.findElement(By.linkText("rightMenu")).click();
System.out.println("Logout completed");
}
public void enterFrame() {
driver.switchTo().frame("EmpInf_frame");
System.out.println("Enter into frame");
}


public void exitFrame() {
driver.switchTo().defaultContent();
System.out.println("exit from frame");
}
public void addNewEmp() {
driver.findElement(By.xpath(btn_Add)).click();
driver.findElement(By.name(txt_EFN)).sendKeys(FN);
driver.findElement(By.name(txt_ELN)).sendKeys(LN);
driver.findElement(By.id(btn_Save)).click();
System.out.println("NewEmpAdded");
}
}


	 