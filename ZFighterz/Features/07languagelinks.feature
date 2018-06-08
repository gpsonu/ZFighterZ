Feature: CRM Languages
	This feature tests the LANGUAGE LINKS functionality

	Scenario: Clicking on the "English link" takes user to the English version of the site
		Given I am on the features page
		When I click on the English link
		Then I should be taken to the homepage of the English version of the site
		
	Scenario: Clicking on the "Spanish link" takes user to the Spanish version of the site
		Given I am on the features page
		When I click on the Spanish link
		Then I should be taken to the homepage of the Spanish version of the site
		
	Scenario: Clicking on the "Taiwanese link" takes user to the Taiwanese version of the site
		Given I am on the features page
		When I click on the Taiwanese link
		Then I should be taken to the homepage of the Taiwanese version of the site
		
	Scenario: Clicking on the "Arabic link" takes user to the Arabic version of the site
		Given I am on the features page
		When I click on the Arabic link
		Then I should be taken to the homepage of the Arabic version of the site
		
	Scenario: Clicking on the "Russian link" takes user to the Russian version of the site
		Given I am on the features page
		When I click on the Russian link
		Then I should be taken to the homepage of the Russian version of the site