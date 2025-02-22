package capstoneframework.capstonetests;

import capstonefactory.pages.HomePage;
import capstonefactory.pages.enums.NodeMenuEnums;
import capstoneframework.basetest.BaseTests;
import org.testng.annotations.Test;

public class CapstoneTests extends BaseTests {

    @Test
    public void capstoneTest() {
        HomePage homePage = new HomePage();
        homePage.openLetCodePage()
                .selectTestSection(NodeMenuEnums.EDIT);
    }

}
