Feature: CRM Login Feature 
	This feature tests login functionality

	@chrome 
	Scenario Outline: Login with correct user id and password 
		Given I am on the CRM homepage 
		And I entered correct "<userid>" and "<password>" 
		When I click on login 
		Then I should be logged in 
	
		Examples: 
			| userid	| password	|
			| zfighterz	| zf123zf   |
		
	@chrome	
	Scenario Outline: Login with incorrect user id and/or password 
		Given I am on the CRM homepage 
		And I entered incorrect "<userid>" and/or "<password>" 
		When I click on login 
		Then The homepage should refresh and I should NOT be logged in 
	
		Examples: 
			| userid    | password	|
			| abc		| abc       |
			| zfighterz	| abc       |
			| abc       | zf123zf 	|
			|        	|        	|
			
			
			
	@firefox		
	Scenario Outline: Login with correct user id and password 
		Given I am on the CRM homepage 
		And I entered correct "<userid>" and "<password>" 
		When I click on login 
		Then I should be logged in 
	
		Examples: 
			| userid	| password	|
			| zfighterz	| zf123zf   |
		
	@firefox	
	Scenario Outline: Login with incorrect user id and/or password 
		Given I am on the CRM homepage 
		And I entered incorrect "<userid>" and/or "<password>" 
		When I click on login 
		Then The homepage should refresh and I should NOT be logged in 
	
		Examples: 
			| userid    | password	|
			| abc		| abc       |
			| zfighterz	| abc       |
			| abc       | zf123zf 	|
			|        	|        	|