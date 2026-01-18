package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class LeaveListPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By leaveMenu = By.xpath("//span[text()='Leave']");
    private By leaveList = By.xpath("//a[text()='Leave List']");

    private By statusDropdown =
            By.xpath("//label[text()='Show Leave with Status']/following::div[1]");

    private By pendingApprovalOption =
            By.xpath("//span[text()='Pending Approval']");

    private By resetBtn =
            By.xpath("//button[.//text()='Reset']");

    private By statusChip =
            By.xpath("//span[contains(@class,'oxd-chip') and text()='Pending Approval']");

    private By actionCell =
            By.cssSelector(".oxd-table-cell-actions");

    public LeaveListPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void openLeaveList() {
        wait.until(ExpectedConditions.elementToBeClickable(leaveMenu)).click();
        wait.until(ExpectedConditions.elementToBeClickable(leaveList)).click();
    }

    public void selectPendingApprovalStatus() {
        wait.until(ExpectedConditions.elementToBeClickable(statusDropdown)).click();
        wait.until(ExpectedConditions.elementToBeClickable(pendingApprovalOption)).click();
    }

    public void clickReset() {
        wait.until(ExpectedConditions.elementToBeClickable(resetBtn)).click();
    }

    public boolean isPendingApprovalChipPresent() {
        return driver.findElements(statusChip).size() > 0;
    }

    public boolean isActionMenuPresent() {
        return driver.findElements(actionCell).size() > 0;
    }
}
