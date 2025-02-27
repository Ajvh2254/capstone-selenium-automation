package capstoneframework.capstonetests;

import capstonefactory.pages.CommonPage;
import capstonefactory.pages.HomePage;
import capstonefactory.pages.enums.NodeMenuEnums;
import capstonefactory.pages.firstnodesection.*;
import capstonefactory.pages.fourthnodesection.*;
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
                .editApplication();
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
                .selectMultipleSuperHeroes()
                .getListOfSuperheroes()
                .selectProgramLanguage()
                .getProgramLanguageList()
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
                .sendKeysToSearchbar()
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

        homePage.selectTestSection(NodeMenuEnums.WAITS);

        WaitsPage waitsPage = new WaitsPage();
        waitsPage.clickSimpleAlert()
                .waitAndAcceptAlert();

        CommonPage.clickWorkSpaceBtn();

        homePage.selectTestSection(NodeMenuEnums.FORMS);

        FormsPage formsPage = new FormsPage();
        formsPage.fillOutForm();
        Waits.sleep();

        CommonPage.clickWorkSpaceBtn();

        homePage.selectTestSection(NodeMenuEnums.FILE);

        FilePage filePage = new FilePage();
        filePage.clickDownloadExcelBtn()
                .uploadSampleFile()
                .clickDownloadPdfBtn()
                .uploadSamplePdf()
                .clickDownloadTextBtn()
                .uploadSampleText();
        Waits.sleep();

        CommonPage.clickWorkSpaceBtn();
    }

}
