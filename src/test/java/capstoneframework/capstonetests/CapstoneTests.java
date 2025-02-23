package capstoneframework.capstonetests;

import capstonefactory.pages.CommonPage;
import capstonefactory.pages.HomePage;
import capstonefactory.pages.enums.NodeMenuEnums;
import capstonefactory.pages.firstnodesection.*;
import capstoneframework.basetest.BaseTests;
import org.testng.annotations.Test;

public class CapstoneTests extends BaseTests {

    @Test
    public void capstoneTest() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.openLetCodePage()
                .selectTestSection(NodeMenuEnums.EDIT);

        EditPage editPage = new EditPage();
        editPage.clickFullNameTextBox()
                .editApplication("Darryn Valentino", " at coding");
        Thread.sleep(3000);

        CommonPage.clickWorkSpaceBtn();

        homePage.selectTestSection(NodeMenuEnums.CLICK);

        ClickPage clickPage = new ClickPage();
        clickPage.getCoordinates()
                .getColor()
                .getSize()
                .isBtnDisabled()
                .clickAndHoldBtn();
        Thread.sleep(3000);

        CommonPage.clickWorkSpaceBtn();

        homePage.selectTestSection(NodeMenuEnums.SELECT);

        DropdownPage dropdownPage = new DropdownPage();
        dropdownPage.selectFruitByVisibleText()
                .selectMultipleSuperHeroes(new String[]{"Aquaman", "Batman", "Green Lantern"})
                .selectProgramLanguage()
                .getLanguageOptions()
                .selectCountryByValue();
        Thread.sleep(3000);

        CommonPage.clickWorkSpaceBtn();
    }

}
