Feature: CRM Logo Link 
	This feature tests LOGO LINK functionality on ALL PAGES
		
	Scenario: Clicking on the "Logo" when on the "Homepage" refreshes the "Homepage" 
		Given I am on the Homepage 
		When I click on the Logo 
		Then I should be taken to the Homepage 
	
	
	Scenario: Clicking on the "Logo" when on the "Features page" takes user to the "Homepage" 
		Given I am on the Features page 
		When I click on the Logo 
		Then I should be taken to the Homepage 
		
		
	Scenario: Clicking on the "Logo" when on the "Sign Up page" takes user to the "Homepage" 
		Given I am on the Sign Up page 
		When I click on the Logo 
		Then I should be taken to the Homepage 
		
		
	Scenario: Clicking on the "Logo" when on the "Pricing page" takes user to the "Homepage" 
		Given I am on the Pricing page 
		When I click on the Logo 
		Then I should be taken to the Homepage 
		
		
	Scenario: Clicking on the "Logo" when on the "Customers page" takes user to the "Homepage" 
		Given I am on the Customers page 
		When I click on the Logo 
		Then I should be taken to the Homepage 
		
		
	Scenario: Clicking on the "Logo" when on the "Contact page" takes user to the "Homepage" 
		Given I am on the Contact page 
		When I click on the Logo 
		Then I should be taken to the Homepage