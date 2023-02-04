package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class ComputerPage extends Utility {

        By computerPageLink = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']");
        By computerText = By.className("page-title");
        By desktopText = By.xpath("//div[@class='page-title']");
        By desktopLink = By.xpath("//div[@class='master-wrapper-page']/div[3]/div[1]/div[2]/div[1]/div[2]/ul/li[1]/ul/li[1]/a");
        By notebookLink = By.xpath("//div[@class='master-wrapper-page']/div[3]/div[1]/div[2]/div[1]/div[2]/ul/li[1]/ul/li[2]/a");
        By softwareLink = By.xpath("//div[@class='master-wrapper-page']/div[3]/div[1]/div[2]/div[1]/div[2]/ul/li[1]/ul/li[3]/a");


        public void clickOncomputerPageLink() {
            Reporter.log("Clicking on Computer Page Link " + computerPageLink.toString());
            clickOnElement(computerPageLink);
        }

        public void clickOnDesktopLink() {
            Reporter.log("Clicking on Desktop Page Link " + desktopLink.toString());
            clickOnElement(desktopLink);
        }

        public void clickOnNotebookPageLink() {
            Reporter.log("Clicking on Notebook Page Link " + notebookLink.toString());
            clickOnElement(notebookLink);
        }

        public void clickOnSoftwarePageLink() {
            Reporter.log("Clicking on Software Page Link " + softwareLink.toString());
            clickOnElement(softwareLink);
        }

        public String getComputersText(){
            return getTextFromElement(computerText);
        }

        public String getDesktopText(){
            return getTextFromElement(desktopText);
        }
    }