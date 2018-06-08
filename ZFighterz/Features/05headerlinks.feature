Feature: CRM Header Links 
	This feature tests HEADER LINKS functionality on the HOMEPAGE
	
	@chrome
	Scenario: Clicking on "Features" link takes user to "Features" page 
		Given I am on the CRM homepage 
		When I click on features link 
		Then I should be taken to the features page
	
	@chrome	
	Scenario: Clicking on "Sign Up" link takes user to "Sign Up" page 
		Given I am on the CRM homepage 
		When I click on sign up link 
		Then I should be taken to the sign up page
	
	@chrome	
	Scenario: Clicking on "Pricing" link takes user to "Pricing" page 
		Given I am on the CRM homepage 
		When I click on pricing link 
		Then I should be taken to the pricing page 
	
	@chrome
	Scenario: Clicking on "Customers" link takes user to "Customers" page 
		Given I am on the CRM homepage 
		When I click on customers link 
		Then I should be taken to the customers page 
	
	@chrome	
	Scenario: Clicking on "Contact" link takes user to "Contact" page 
		Given I am on the CRM homepage 
		When I click on contact link 
		Then I should be taken to the contact page
		
		
		
	@firefox
	Scenario: Clicking on "Features" link takes user to "Features" page 
		Given I am on the CRM homepage 
		When I click on features link 
		Then I should be taken to the features page
	
	@firefox	
	Scenario: Clicking on "Sign Up" link takes user to "Sign Up" page 
		Given I am on the CRM homepage 
		When I click on sign up link 
		Then I should be taken to the sign up page
	
	@firefox	
	Scenario: Clicking on "Pricing" link takes user to "Pricing" page 
		Given I am on the CRM homepage 
		When I click on pricing link 
		Then I should be taken to the pricing page 
	
	@firefox
	Scenario: Clicking on "Customers" link takes user to "Customers" page 
		Given I am on the CRM homepage 
		When I click on customers link 
		Then I should be taken to the customers page 
	
	@firefox	
	Scenario: Clicking on "Contact" link takes user to "Contact" page 
		Given I am on the CRM homepage 
		When I click on contact link 
		Then I should be taken to the contact page