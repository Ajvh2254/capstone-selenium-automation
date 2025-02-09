package capstonefactory.pages;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;

public class EditPage extends BasePage {

    public EditPage() {
        super();
    }

    public EditPage openEditPage() {
        driver.get("https://letcode.in/edit");
        return this;
    }

    public EditPage clickFullNameLink() {
        By fullName = By.id("fullName");
        return this;
    }

    public void fillOutApplication(String fullName) {

    }

}
