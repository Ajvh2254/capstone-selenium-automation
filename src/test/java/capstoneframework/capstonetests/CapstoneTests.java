package capstoneframework.capstonetests;

import capstonefactory.pages.CommonPage;
import capstonefactory.pages.HomePage;
import capstonefactory.pages.enums.NodeMenuEnums;
import capstonefactory.pages.firstnodesection.*;
import capstonefactory.pages.secondnodesection.*;
import capstonefactory.pages.thirdnodesection.*;
import capstonefactory.utilities.utils.Waits;
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
        Waits.sleep();

        CommonPage.clickWorkSpaceBtn();

        homePage.selectTestSection(NodeMenuEnums.CLICK);

        ClickPage clickPage = new ClickPage();
        clickPage.getCoordinates()
                .getColor()
                .getSize()
                .isBtnDisabled()
                .clickAndHoldBtn();
        Waits.sleep();

        CommonPage.clickWorkSpaceBtn();

        homePage.selectTestSection(NodeMenuEnums.SELECT);

        DropdownPage dropdownPage = new DropdownPage();
        dropdownPage.selectFruitByVisibleText()
                .selectMultipleSuperHeroes(new String[]{"Aquaman", "Batman", "Green Lantern"})
                .selectProgramLanguage()
                .getLanguageOptions()
                .selectCountryByValue();
        Waits.sleep();

        CommonPage.clickWorkSpaceBtn();

        homePage.selectTestSection(NodeMenuEnums.ALERT);

        DialogPage dialogPage = new DialogPage();
        dialogPage.clickSimpleAlertBtn()
                .acceptSimpleAlertBtn()
                .clickConfirmAlertBtn()
                .dismissConfirmAlertBtn()
                .clickPromptAlertBtn()
                .fillOutPromptAlert()
                .acceptPromptAlert()
                .clickModernAlertBtn()
                .dismissModernAlert();
        Waits.sleep();

        CommonPage.clickWorkSpaceBtn();

        homePage.selectTestSection(NodeMenuEnums.RADIO);

        TogglePage togglePage = new TogglePage();
        togglePage.clickCheckboxOption()
                .isCheckboxSelected()
                .isCheckboxBtnDisabled();
        Waits.sleep();

        CommonPage.clickWorkSpaceBtn();

        homePage.selectTestSection(NodeMenuEnums.WINDOW);

        TabsPage tabsPage = new TabsPage();
        tabsPage.clickHomeBtn()
                .printTitleNewTab()
                .switchToChildWindow()
                .closeChildWindow()
                .clickMultipleWindowsBtn()
                .printWindowTitle()
                .switchToDropdownPage()
                .closeDropdownPage()
                .closeAlertPage();
        Waits.sleep();

        CommonPage.clickWorkSpaceBtn();

        homePage.selectTestSection(NodeMenuEnums.ELEMENTS);

        ElementsPage elementsPage = new ElementsPage();
        elementsPage.clickSearchBar()
                .sendKeysToSearchbar("Ajvh2254")
                .isImageDisplayed()
                .printSearchInfo();
        Waits.sleep();

        CommonPage.clickWorkSpaceBtn();

        homePage.selectTestSection(NodeMenuEnums.DRAG);

        DragPage dragPage = new DragPage();
        dragPage.dragAndDropBox();
        Waits.sleep();

        CommonPage.clickWorkSpaceBtn();

        homePage.selectTestSection(NodeMenuEnums.DROP);

        DropPage dropPage = new DropPage();
        dropPage.dropAtTargetLocation();
        Waits.sleep();

        CommonPage.clickWorkSpaceBtn();

        homePage.selectTestSection(NodeMenuEnums.SORT);

        SortPage sortPage = new SortPage();
        sortPage.moveTODOElementsToDone();
        Waits.sleep();

        CommonPage.clickWorkSpaceBtn();
    }

}
