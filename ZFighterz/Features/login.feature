Feature: CRM Login Feature
  This login feature is for login functionality in CRM website

  @chrome @firefox
  Scenario Outline: Login with correct user id and password
    Given I navigated to CRM login page
    And I entered "<userid>" and "<password>"
    When I click on login
    Then I should be logged in

    Examples: 
      | userid     | password   |
      | zfighterz  | zf123zf    |
     
    
       @chrome @firefox
  Scenario Outline: Login with wrong user id and password
    Given I navigated to CRM login page
    And I entered "<userid>" and "<password>"
    When I click on login
    Then I should NOT be logged in

    Examples: 
      | userid     | password     |
      | abc        | abc          |
      