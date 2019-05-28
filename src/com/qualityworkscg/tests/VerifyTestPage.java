package com.qualityworkscg.tests;

import com.qualityworkscg.pages.FindStudioFirstSearchResultPage;
import com.qualityworkscg.pages.FindStudioPage;
import com.qualityworkscg.pages.WeightWatchersHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTestPage {
    WeightWatchersHomePage weightWatchersHomePage = new WeightWatchersHomePage();
    FindStudioPage findStudioPage = new FindStudioPage();
    FindStudioFirstSearchResultPage findStudioFirstSearchResultPage = new FindStudioFirstSearchResultPage();

    //Verifying loaded page title contains "weight loss"
    @Test
    public void verifyWwTitle(){
        weightWatchersHomePage.navigateToWw();
        Assert.assertTrue(weightWatchersHomePage.wwTitle());
    }

    //Verifying loaded page title contains "meetings near you"
    @Test
    public void verifyFindStudioTitle() {
        weightWatchersHomePage.navigateToWw();
        weightWatchersHomePage.clickFindStudioButton();
        Assert.assertTrue(weightWatchersHomePage.findStudioTitle());
    }

    //Printing the title of the first result and the distance
    @Test
    public void printFirstResult() {
        weightWatchersHomePage.navigateToWw();
        weightWatchersHomePage.clickFindStudioButton();
        findStudioPage.searchLocation();
        System.out.println(findStudioPage.firstName());
        System.out.println(findStudioPage.firstDistance());
    }

    //Verifying the name of the first search result matches name on the first search result when clicked
    @Test
    public void verifyNameMatch() {
        weightWatchersHomePage.navigateToWw();
        weightWatchersHomePage.clickFindStudioButton();
        findStudioPage.searchLocation();
        findStudioPage.clickOnFirstResult();

        Assert.assertEquals(findStudioPage.firstName(), findStudioFirstSearchResultPage.firstResultNameText());
    }

    //Printing today's hours of operation
    @Test
    public void printTodaysHoursOfOperation() {
        weightWatchersHomePage.navigateToWw();
        weightWatchersHomePage.clickFindStudioButton();
        findStudioPage.searchLocation();
        findStudioPage.clickOnFirstResult();

        System.out.println(findStudioFirstSearchResultPage.getHoursOfOperation());
    }

}
