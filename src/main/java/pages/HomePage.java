package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By commScopeSearchInput = By.className("search-bar");
    By commScopeSearchButton = By.className("search-submit-btn");
    By alertCloseButton = By.cssSelector("button[class= 'onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button onetrust-lg ot-close-icon']");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void searchText(String text){
        driver.findElement(commScopeSearchInput).sendKeys(text);
    }

    public void clickSearch(){
        driver.findElement(commScopeSearchButton).click();
    }

    public void removeAlert(){
        driver.findElement(alertCloseButton).click();
    }
}
