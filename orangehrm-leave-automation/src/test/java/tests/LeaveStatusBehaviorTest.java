package tests;

import base.BaseTest;
import pages.LoginPage;
import pages.LeaveListPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LeaveStatusBehaviorTest extends BaseTest {

    @Test
    public void cancelledLeaveHasNoActions() {

        LoginPage login = new LoginPage(driver, wait);
        LeaveListPage leaveList = new LeaveListPage(driver, wait);

        login.login();
        leaveList.openLeaveList();

        Assert.assertFalse(
                leaveList.isActionMenuPresent(),
                "Cancelled leave should not expose any actions"
        );
    }
}
