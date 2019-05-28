package com.qualityworkscg.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class FindStudioPage extends Page{
    private By enterLocationField = By.id("meetingSearch");
    private By searchButton = By.xpath("//button[@class='btn spice-translated']");
    private By nameSearchResults = By.xpath("//div[@class='location__name']");
    private By distanceSearchResults = By.xpath("//div[@class='location__distance']");
    private By searchBoxes = By.xpath("//div[@class='meeting-location']");

    public void searchLocation() {
        getDriver().findElement(enterLocationField).sendKeys("10011");
        getDriver().findElement(searchButton).click();
    }

    public String firstName() {
        List<WebElement> nameResults = getDriver().findElements(nameSearchResults);
        List<String> names = new ArrayList<>();

        for (int i = 0; i < nameResults.size(); i++) {
            names.add(nameResults.get(i).getText());
        }

        String firstName = names.get(0);
        return firstName;
    }

    public String firstDistance() {
        List<WebElement> distanceResults = getDriver().findElements(distanceSearchResults);
        List<String> distance = new ArrayList<>();

        for (int i = 0; i < distanceResults.size(); i++) {
            distance.add(distanceResults.get(i).getText());
        }

        String firstDistance = distance.get(0);
        return firstDistance;
    }

    public void clickOnFirstResult(){
        List<WebElement> allBoxes = getDriver().findElements(searchBoxes);

        allBoxes.get(0).click();

    }

}
