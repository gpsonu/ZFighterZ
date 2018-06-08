Feature: CRM Sign Up Feature
	This feature tests SIGN UP functionality

	@chrome
	Scenario Outline: Test the various text fields in the sign up page
    	Given I am on the CRM "Sign Up" page
    	And I slected the "<edition>" by value
    	And I entered the correct "<firstname>" and "<lastname>" and "<email>" and "<confirmemail>" and "<userid>" and "<password>" and "<confirmpassword>"
    	And I click on checkbox
    	When I click on signup button
    	Then I should be signed up if the correct data was entered
	
    	Examples: 
			| edition | firstname | lastname | email       | confirmemail | userid     | password | confirmpassword |
      		| 1       | Greatest  | Ever     | abc@abc.com | abc@abc.com  | zfighterz  | zf123zf  | zf123zf         |
      		
    
    @chrome	
	Scenario Outline: Negative Test the various text fields in the sign up page
    	Given I am on the CRM "Sign Up" page
    	And I slected the "<edition>" by value or leave it unselected
    	And I entered incorrect variations "<firstname>" and "<lastname>" and "<email>" and "<confirmemail>" and "<userid>" and "<password>" and "<confirmpassword>"
    	And I click on checkbox
    	When I click on signup button
    	Then I should not be able to sign up and stay on the register page
    	
    	Examples: 
			| edition | firstname | lastname | email       | confirmemail | userid     | password | confirmpassword |
      		| 5       | Greatest  | Ever     | abc         | abc@abc.com  | zfighterz  | zf123zf  | zf123zf         |
      		| 5       | Greatest  | Ever     | abc@abc.com | abc@abc.com  | zfig       | zf123zf  | zf12            |
      		| 1       | Greatest  | Ever     | abc@abc.com | abc@abc.com  | zfighterz  | zf12     | zf123zf         |
      		| 5       | Greatest  | Ever     | abc@abc.com | abc          | zfighterz  | zf123zf  | zf123zf         |
      		| 1       | Greatest  | Ever     | abc@abc.com | abc@abc.com  | zfighterz  | zf123zf  | zf12            |
      		|         | Greatest  | Ever     | abc@abc.com | abc@abc.com  | zfighterz  | zf123zf  | zf123zf         |
      		
      		
    	
    @firefox
	Scenario Outline: Test the various text fields in the sign up page
    	Given I am on the CRM "Sign Up" page
    	And I slected the "<edition>" by value
    	And I entered the correct "<firstname>" and "<lastname>" and "<email>" and "<confirmemail>" and "<userid>" and "<password>" and "<confirmpassword>"
    	And I click on checkbox
    	When I click on signup button
    	Then I should be signed up if the correct data was entered
	
    	Examples: 
			| edition | firstname | lastname | email       | confirmemail | userid     | password | confirmpassword |
      		| 1       | Greatest  | Ever     | abc@abc.com | abc@abc.com  | zfighterz  | zf123zf  | zf123zf         |
      		
    
    @firefox	
	Scenario Outline: Negative Test the various text fields in the sign up page
    	Given I am on the CRM "Sign Up" page
    	And I slected the "<edition>" by value or leave it unselected
    	And I entered incorrect variations "<firstname>" and "<lastname>" and "<email>" and "<confirmemail>" and "<userid>" and "<password>" and "<confirmpassword>"
    	And I click on checkbox
    	When I click on signup button
    	Then I should not be able to sign up and stay on the register page
    	
    	Examples: 
			| edition | firstname | lastname | email       | confirmemail | userid     | password | confirmpassword |
      		| 5       | Greatest  | Ever     | abc         | abc@abc.com  | zfighterz  | zf123zf  | zf123zf         |
      		| 5       | Greatest  | Ever     | abc@abc.com | abc@abc.com  | zfig       | zf123zf  | zf12            |
      		| 1       | Greatest  | Ever     | abc@abc.com | abc@abc.com  | zfighterz  | zf12     | zf123zf         |
      		| 5       | Greatest  | Ever     | abc@abc.com | abc          | zfighterz  | zf123zf  | zf123zf         |
      		| 1       | Greatest  | Ever     | abc@abc.com | abc@abc.com  | zfighterz  | zf123zf  | zf12            |
      		|         | Greatest  | Ever     | abc@abc.com | abc@abc.com  | zfighterz  | zf123zf  | zf123zf         |
    	
    	