#----------------------------------
# Navigation trough the windows of the application
#----------------------------------
    
Feature: Window Navigation

   Scenario: Tour trough the client fails for unauthorized user
      As a non authorized used I should not be able to navigate
      Given I write login credentials using user 'wrong' and password 'wrong'
      And I click Login with wrong credentials
      Then error prompt should appear

   Scenario: Tour trough the application should be possible for authorized user
      Given I write login credentials using user 'wrong' and password 'wrong'
      And I click the clear fields button
      Then Login window fields should be empty
      Given I write login credentials using user 'correct' and password 'correct'
      And I click Login with correct credentials
