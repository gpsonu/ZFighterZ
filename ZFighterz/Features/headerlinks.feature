Feature: CRM Header Links
	This feature tests the header links

  Scenario: Clicking on correct link take user to appropriate page
    Given I navigate to CRM homepage
    When I click on customers link
    Then I should be taken to the customers page
