Feature: Admin Login
@scenariowithoutDatatable
   Scenario: Verify Login Functionolity
   When I open OrangeHRMS URL on chrome 
   And I enter Username in Username Field and enter Password in password field
   When I click Login Button
   Then I Should see welcome link on Home Page
   When I close the browser
   
   @scenariowithDatatable
   Scenario Outline: Login Functionality Validation
   When I open OrangeHRMS URL on "<Browser>"
   And I enter "<UserName>" in UsernameField
   And I enter "<Password>" in PasswordField
   When clicking Login Button
   Then I should dee Dashboard in URL
   When Closing Browser 
   Examples:
   |Browser|UserName|Password|
   |chrome|Admin|Qedge123!@#|
   |Firefox|Admin|Qedge123!@#|
   |chrome|Admin|Qedg123!@#|
   |Firefox|Admin|Qedge123!@#|
   |chrome|Admin|Qedge123!@#|
   |Firefox|Admin|Qege123!@#|
    