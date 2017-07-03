Feature:Book a trip
		In order to book a trip  
		As a Delta airline client
		I want to be able to find flight online 
		

Scenario Outline:	Login and find flight for one passenger online
			Given I navigate to Delta website
			And Delta homepage is displayed
			When I click one way trip
			And I input travelling From "<From>" and To "<To>"
 			And I input departure date"<DptDate>"
			#And I input "<DptDate>" as departure and "<RetDate>" as return dates
			And I click find flight
			And I click on a price
			And I click continue button to proceed to passengers details page

Scenarios:
			|From	|To		|DptDate	|RetDate	|	
			|NYC	|DUB	|07/20/2017	|08/20/2017	|		
			

