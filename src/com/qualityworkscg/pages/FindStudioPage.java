package com.qualityworkscg.pages;

import org.openqa.selenium.By;

public class FindStudioPage extends Page{
    private By enterLocationField = By.id("meetingSearch");
    private By searchButton = By.xpath("//button[@class='btn spice-translated']");

    public void searchLocation() {
        getDriver().findElement(enterLocationField).sendKeys("10011");
        getDriver().findElement(searchButton).click();
    }
}
