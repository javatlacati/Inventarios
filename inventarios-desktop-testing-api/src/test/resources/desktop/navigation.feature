#----------------------------------
# Navigation trough the windows of the application
#----------------------------------
    
Feature: Window Navigation

   Scenario: Tour trough the client fails for unauthorized user
      As a non authorized used I should not be able to navigate
      Given I write login credentials using user 'wrong' and password 'wrong'
      And I click Login with wrong credentials
      Then error prompt should appear
      And error prompt message should be 'Usuario wrong no encontrado'
      Then I click close button on prompt message

   Scenario: Tour trough the application should be possible for authorized user
      Given I write login credentials using user 'wrong' and password 'wrong'
      And I click the clear fields button
      Then Login window fields should be empty
      Given I write login credentials using user 'correct' and password 'correct'
      And I click Login with correct credentials
      And I click Inventory option in the Menu Window
      And I click on menu button in the Inventory Window
      And I click Billing option in the Menu Window
      And I click on menu button in the Billing Window
      And I click close button on The Menu Window
      Then Login window fields should be empty
