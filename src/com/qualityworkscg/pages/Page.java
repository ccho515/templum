package com.qualityworkscg.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Page {
  
  private WebDriver driver = new ChromeDriver();

  
  @BeforeClass
  public void beforeClass() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ccho5\\Desktop\\chromedriver.exe");
    driver = new ChromeDriver();
  }

  public WebDriver getDriver() {
    return driver;
  }

  @AfterClass
  public void afterClass() {
    driver.quit();

  }
}