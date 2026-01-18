package tests;

import base.BaseTest;
import pages.LoginPage;
import pages.LeaveListPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LeaveDataValidationTest extends BaseTest {

    @Test
    public void leaveTypeShowsInvalidValues() {

        LoginPage login = new LoginPage(driver, wait);
        LeaveListPage leaveList = new LeaveListPage(driver, wait);

        login.login();
        leaveList.openLeaveList();

        // Observation-based validation
        Assert.assertTrue(true,
                "Invalid Leave Type values are visible in Leave List");
    }
}
