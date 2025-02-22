package capstoneframework.capstonetests;

import capstonefactory.pages.CommonPage;
import capstonefactory.pages.HomePage;
import capstonefactory.pages.enums.NodeMenuEnums;
import capstonefactory.pages.firstnodesection.*;
import capstoneframework.basetest.BaseTests;
import org.testng.annotations.Test;

public class CapstoneTests extends BaseTests {

    @Test
    public void capstoneTest() {
        HomePage homePage = new HomePage();
        homePage.openLetCodePage()
                .selectTestSection(NodeMenuEnums.EDIT);

        EditPage editPage = new EditPage();
        editPage.clickFullNameTextBox()
                .editApplication("Darryn Valentino", " at coding");

        CommonPage.clickWorkSpaceBtn();

        homePage.selectTestSection(NodeMenuEnums.CLICK);

        ClickPage clickPage = new ClickPage();
        clickPage.getCoordinates()
                .getColor()
                .getSize()
                .isBtnDisabled()
                .clickAndHoldBtn();

        CommonPage.clickWorkSpaceBtn();
    }

}
