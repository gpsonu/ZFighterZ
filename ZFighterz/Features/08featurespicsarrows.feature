Feature: Feature Pictures Arrows
	This tests fuctionality of the "FEATURES PICTURES ARROWS"
	
	Scenario:
		Given I am on the FEATURES page
		
		When I CLICK on the FIRST FEATURE PIC
		Then the FIRST FEATURE PIC should ENLARGE
		
		When I CLICK on the RIGHT ARROW of the FIRST FEATURE PIC
		Then the ENLARGED SECOND FEATURE PIC should APPEAR 
		
		When I CLICK on the RIGHT ARROW of the SECOND FEATURE PIC
		Then the ENLARGED THIRD FEATURE PIC should APPEAR
		
		When I CLICK on the LEFT ARROW of the THIRD FEATURE PIC
		Then the ENLARGED SECOND FEATURE PIC should APPEAR 
		
		When I CLICK on the LEFT ARROW of the SECOND FEATURE PIC
		Then the ENLARGED FIRST FEATURE PIC should APPEAR 