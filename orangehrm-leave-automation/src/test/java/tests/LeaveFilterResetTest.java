package tests;

import base.BaseTest;
import pages.LoginPage;
import pages.LeaveListPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LeaveFilterResetTest extends BaseTest {

    @Test
    public void resetShouldClearLeaveStatus() {

        LoginPage login = new LoginPage(driver, wait);
        LeaveListPage leaveList = new LeaveListPage(driver, wait);

        login.login();
        leaveList.openLeaveList();

        // IMPORTANT: apply filter first
        leaveList.selectPendingApprovalStatus();

        // Then reset
        leaveList.clickReset();

        Assert.assertFalse(
                leaveList.isPendingApprovalChipPresent(),
                "Reset should clear the selected Leave Status filter"
        );
    }
}
