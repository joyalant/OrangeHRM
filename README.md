# OrangeHRM – Leave Management QA Automation

## Overview
This repository contains QA automation tests for the **Leave Management module** of the OrangeHRM application.  
The objective of this assignment is to demonstrate a practical QA automation approach by identifying meaningful scenarios, validating real workflows, and highlighting functional and logical issues observed in a real system.

The automation is intentionally **limited in scope** and focuses on **quality of approach rather than test coverage**, as requested.

---

## Application Under Test
- **Application**: OrangeHRM (Demo Instance)
- **URL**: https://fantac-osondemand.orangehrm.com
- **Module Covered**: Leave Management
- **User Role**: Admin

---

## Tools & Technologies Used
- **Java**
- **Selenium WebDriver**
- **TestNG**
- **Maven**
- **WebDriverManager**
- **Eclipse IDE**

---

## Automation Approach
- Page Object Model (POM) is used to separate test logic from UI interactions.
- Explicit waits are used for synchronization; no hard waits are used.
- Tests focus on **business behavior and state validation**, not UI appearance.
- Automation reflects **actual system behavior**, even when it exposes defects.
- Negative scenarios and edge cases are included where meaningful.

---

## Automated Test Scenarios

### 1. Leave Status Filter Reset Behavior
- Validates that the **Reset** button should clear selected leave status filters.
- Observed behavior: Selected status (e.g., *Pending Approval*) is not cleared after reset.

### 2. Cancelled Leave State Behavior
- Verifies that leave records in **Cancelled** status do not expose further actions.
- Confirms current system behavior where cancelled leaves appear to be in a terminal state.

### 3. Leave Data Consistency Observation
- Validates that leave data displayed in the Leave List is consistently shown across views.
- Used to document data quality issues observed in the system.

---

## Issues / Observations Identified

The following issues were observed during testing of the Leave Management module:

1. **Reset button does not clear selected Leave Status filters**
   - Reset action does not remove applied status chips.

2. **Leave Type accepts invalid special character values**
   - Leave Type values such as special symbols are accepted and persisted.
   - Invalid values appear across Leave List and Leave Details views.
   - Indicates missing server-side validation.

3. **Cancelled leave requests have no available actions**
   - No actions are available once a leave is cancelled.
   - The system does not indicate whether the cancelled state is final by design.

4. **Multiple cancelled leave records exist for the same employee**
   - Repeated cancelled entries remain visible, increasing noise in Leave List.
   - No consolidation or cleanup mechanism observed.

5. **Sub Unit filter shows “No Records Found”**
   - Appears to be a demo data or configuration limitation rather than a functional defect.

These observations are documented to reflect real system behavior and demonstrate QA analysis, not to imply complete system validation.

---

## Assumptions & Limitations
- The demo environment may contain incomplete or inconsistent data.
- Some behaviors may be configuration- or role-dependent.
- Automation is intentionally limited to the Leave Management module only.
- The focus is on approach, reasoning, and stability rather than exhaustive coverage.

---

## Project Structure

## Project Structure

```
orangehrm-leave-automation
├── pom.xml
├── testng.xml
├── README.md
└── src
    └── test
        └── java
            ├── base
            ├── pages
            └── tests


---

## How to Run the Tests

### Prerequisites
- Java 8 or higher
- Maven
- Google Chrome
- Internet connection

### Steps
1. Clone the repository:
2. Navigate to the project directory:
3. Run the tests:

---

## Notes
- This automation suite is intentionally minimal and focused.
- The goal is to demonstrate QA thinking, automation structure, and real-world analysis.
- The project reflects the current behavior of the demo application at the time of testing.

---

## Author
**Joyal Anto**

