package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.HomePage;
import pages.SearchPage;
import java.io.File;

import java.util.concurrent.TimeUnit;

public class SearchProduct {
    //String driverPath = "\\src\\main\\resources\\drivers\\geckodriver.exe";
    WebDriver driver;
    HomePage HomePage;

  public void setup(){
      System.setProperty("webdriver.gecko.driver", "src" + File.separator + "main" + File.separator + "resources" + File.separator + "drivers" + File.separator + "geckodriver.exe");
      driver = new FirefoxDriver();
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      driver.get("https://www.commscope.com/");

  }

  public void test_Get_Product(){
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      HomePage element = new HomePage(driver);
      element.removeAlert();
      element.searchText("ME-7000");
      element.clickSearch();
  }

  public void test_Click_Product(){
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      SearchPage element = new SearchPage(driver);
      element.clickFirstElement();
  }

  public void closeBrowser(){
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      driver.close();
  }

}
