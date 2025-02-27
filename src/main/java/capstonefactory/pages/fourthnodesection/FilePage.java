package capstonefactory.pages.fourthnodesection;

import capstonefactory.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FilePage extends BasePage {

    public FilePage() {
        super();
    }

    public FilePage clickDownloadExcelBtn() {
        click.waitAndClick(By.id("xls"));
        return this;
    }

    public FilePage uploadSampleFile() {
        WebElement upload = driver.findElement(By.xpath("//input[@type='file']"));
        String filePath = System.getProperty("user.home") + "/Downloads/sample.xlsx";
        System.out.println("Uploading " + filePath);
        upload.sendKeys(filePath);
        return this;
    }

    public FilePage clickDownloadPdfBtn() {
        click.waitAndClick(By.id("pdf"));
        return this;
    }

    public FilePage uploadSamplePdf() {
        WebElement upload = driver.findElement(By.xpath("//input[@type='file']"));
        String filePath = System.getProperty("user.home") + "/Downloads/sample.pdf";
        System.out.println("Uploading " + filePath);
        upload.sendKeys(filePath);
        return this;
    }

    public FilePage clickDownloadTextBtn() {
        click.waitAndClick(By.id("txt"));
        return this;
    }

    public void uploadSampleText() {
        WebElement upload = driver.findElement(By.xpath("//input[@type='file']"));
        String filePath = System.getProperty("user.home") + "/Downloads/sample.txt";
        System.out.println("Uploading " + filePath);
        upload.sendKeys(filePath);
    }



}
