Feature: Features Pictures
	This tests fuctionality of the "FEATURES PICTURES"
	
	@chrome
	Scenario:
		Given I am on the FEATURES page
		
		When I click on the FOURTH FEATURE PIC
		Then the FOURTH FEATURE PIC should ENLARGE
		When I click on the X for the FOURTH FEATURE PIC
		Then the FOURTH FEATURE PIC should MINIMIZE
		
		When I click on the FIFTH FEATURE PIC
		Then the FIFTH FEATURE PIC should ENLARGE
		When I click on the X for the FIFTH FEATURE PIC
		Then the FIFTH FEATURE PIC should MINIMIZE
		
		When I click on the THIRTEENTH FEATURE PIC
		Then the THIRTEENTH FEATURE PIC should ENLARGE
		When I click on the X for the THIRTEENTH FEATURE PIC
		Then the THIRTEENTH FEATURE PIC should MINIMIZE
		
		
		
	@firefox
	Scenario:
		Given I am on the FEATURES page
		
		When I click on the FOURTH FEATURE PIC
		Then the FOURTH FEATURE PIC should ENLARGE
		When I click on the X for the FOURTH FEATURE PIC
		Then the FOURTH FEATURE PIC should MINIMIZE
		
		When I click on the FIFTH FEATURE PIC
		Then the FIFTH FEATURE PIC should ENLARGE
		When I click on the X for the FIFTH FEATURE PIC
		Then the FIFTH FEATURE PIC should MINIMIZE
		
		When I click on the THIRTEENTH FEATURE PIC
		Then the THIRTEENTH FEATURE PIC should ENLARGE
		When I click on the X for the THIRTEENTH FEATURE PIC
		Then the THIRTEENTH FEATURE PIC should MINIMIZE