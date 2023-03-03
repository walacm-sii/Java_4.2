package pages;

import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToPage(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
