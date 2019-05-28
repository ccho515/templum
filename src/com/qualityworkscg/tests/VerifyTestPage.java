package com.qualityworkscg.tests;

import com.qualityworkscg.pages.WeightWatchersHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTestPage {
    WeightWatchersHomePage weightWatchersHomePage = new WeightWatchersHomePage();

    @Test
    public void verifyWwTitle(){
        weightWatchersHomePage.navigateToWw();
        Assert.assertTrue(weightWatchersHomePage.wwTitle());
    }

    @Test
    public void verifyFindStudioTitle() {
        weightWatchersHomePage.clickFindStudioButton();
        Assert.assertTrue(weightWatchersHomePage.findStudioTitle());
    }

}
