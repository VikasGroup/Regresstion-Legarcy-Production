Feature:  Regression testing - WP Legacy Production - Validate Login Page

@Reg
Scenario Outline: Test case 
Given user direct to the site
When user click on Login or Register button
And user enter a valid ID or email "<ID>"
And user enter a password "<password>"
Then user click on login button
And validate the landing page "<page _link>"

Examples:
    |ID      |password|page _link                                                         |
    |HG321003|testpw  |https://portal.qnet.net/VirtualOffice4/OnlineEStore/PopupsLoad.aspx|
