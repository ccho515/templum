package com.qualityworkscg.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class FindStudioFirstSearchResultPage extends Page{
    private By firstResultNameField = By.xpath("//div[@class='location__name']");
    private By sevenDayBoxes = By.xpath("//li[@class='hours-list-item']");


    public String firstResultNameText() {
        WebElement firstResultName = getDriver().findElement(firstResultNameField);
        return firstResultName.getText();
    }

    public String getHoursOfOperation() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEE");
        String dateDay = sdf.format(date);

        List<WebElement> eachBox = getDriver().findElements(sevenDayBoxes);

        for (WebElement element : eachBox) {
            if (element.getText().contains(dateDay)) {
                String finalHoursOfOperation = element.getText();
                return finalHoursOfOperation;
            }
        }
        return "No such day exists";
    }


}
