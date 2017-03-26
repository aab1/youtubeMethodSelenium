Feature:Get car insurance quote from AXA
		In order to get my a quote 
		As a potential Axa insurance customer
		I want to be able to get the quote online 
		
Scenario:	Get the quote online
			Given I navigate to Axa website
			And Axa get quote section is displayed
			When I enter my name
			And I enter date of birth
			And i enter my gender
			And I enter email address
			And I enter my phone number
			And I select yes I know my eirocode 
			And I enter my eircode
			And I click find address
			And I click the checkbox
			And I select type of household
			And I select employment status
			And I select occupation
			And I click continue
			Then your car section is displayed
			