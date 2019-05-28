package com.qualityworkscg.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WeightWatchersHomePage extends Page{

    String url = "https://www.weightwatchers.com/us/";
    private By findStudioButton = By.xpath("//a[@id='ela-menu-visitor-desktop-supplementa_find-a-studio']//span[@class='menu-link__inner-wrapper'][contains(text(),'Find a Studio')]");

    public void navigateToWw() {
        getDriver().navigate().to(url);
    }

    public boolean wwTitle() {
        String title = getDriver().getTitle();
        if (title.contains("Weight Loss")) {
            return true;
        }
        return false;
    }

    public void clickFindStudioButton() {
        getDriver().findElement(findStudioButton).click();
    }

    public boolean findStudioTitle() {
        clickFindStudioButton();
        String title = getDriver().getTitle();
        if (title.contains("Meetings Near You")){
            return true;
        }
        return false;
    }
}
