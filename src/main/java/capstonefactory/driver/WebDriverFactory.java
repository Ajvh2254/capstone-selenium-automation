package capstonefactory.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {

    public static void main(String[] args) {
        initializeDriver();
    }

    public static void initializeDriver() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/test");
    }

}
