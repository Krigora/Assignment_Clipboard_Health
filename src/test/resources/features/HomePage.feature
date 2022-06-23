Feature:  home page
  As I user, I should be able to home page
@Amazon
  Scenario: Go to on the Home page
   Given I am on the HOME page
   When I click on All button
   And I click on TV link
   And I click on Televisions link
   And I put flag Samsung
  And i click on SortBy dropDown button
  And I click on HightToLow button
  And I click to second HightPrise iteam
  And should be display "About this item"
