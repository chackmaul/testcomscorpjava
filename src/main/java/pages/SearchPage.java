package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class SearchPage {
    WebDriver driver;

    By firstElement = By.cssSelector("a[class='title srch-link']");

    public SearchPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickFirstElement() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(firstElement).click();
    }

    public void closeBrowser(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.close();
    }
}
