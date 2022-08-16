
@Regression
  Feature: Techfios bank and cash New Account Functionality
  @CreateAccount
  Scenario Outline: User should be able to login with valid credentials 
	and open a new account
   Given User should be in login page  
    When user enters correct username "<username>"
    When user enters correct password "<password>"
    And user click the submit button
    Then user landed to the Dashboard page
    When User should click Bank&Cash
    And User should click New Account
    Then User should fill Account Title "<Account Title>"
    Then User should fill Description "<Description>"
    Then User should fill Inital Balance "<Initial_Balance>"
    Then User should fill Account Number "<Account_Number>"
    Then User should fill Contact Person "<Contact_Person>"
    Then User should fill Phone Number "<Phone>"
    Then User should fill Internet Banking Url "<Internet Banking Url>"
    And User should click Submit
    Then User land to the Accounts page
        
    Examples:
   |username          |password    |Account Title| Description| Initial_Balance|Account_Number|Contact_Person|Phone      |Internet Banking Url            | 
   |demo@techfios.com |abc123      | Fixed       | User       | $23344          |  233445      |Mark          |5667764    |https://www.citizensebank.com/  |
    
