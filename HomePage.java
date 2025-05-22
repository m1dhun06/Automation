package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickFirstProduct() {
        driver.findElement(By.cssSelector(".card-title a")).click();
    }
}
