Feature: CRM Sign Up Feature
  This feature is to test the sign up functionality in CRM website

  @chrome @firefox
  Scenario Outline: Test the various text fields in the sign up page
    Given I navigated to CRM login page
    And I slected the Edition or leave it unselected
    And I entered "<firstname>" and "<lastname>" and "<email>" and "<confirmemail>" and <userid>" 
    And "<password>" and "<confirmpassword>"
    And I click on checkbox
    When I click on login
    Then I should be logged in if the correct data was entered

    Examples: 
      | firstname | lastname | email       | confirmemail | userid     | password   | confirmpassword |
      | Greatest  | Ever     | abc@abc.com | abc@abc.com  | zfighterz  | zf123zf    | zf123zf         |
      | Greatest  | Ever     | abc         | abc@abc.com  | zfighterz  | zf123zf    | zf123zf         |
      | Greatest  | Ever     | abc@abc.com | abc@abc.com  | zfig       | zf123zf    | zf12            |
      | Greatest  | Ever     | abc@abc.com | abc@abc.com  | zfighterz  | zf12       | zf123zf         |
      | Greatest  | Ever     | abc@abc.com | abc          | zfighterz  | zf123zf    | zf123zf         |
      | Greatest  | Ever     | abc@abc.com | abc@abc.com  | zfighterz  | zf123zf    | zf12            |
      
      