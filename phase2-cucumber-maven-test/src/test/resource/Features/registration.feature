Feature: Registration

Scenario: Create a New User
    Given user should be on the registration page
    And user fills registration "email" with "xxxxx@gmail.com"
    And user fills registration "passsowrd" with "xxxxx"
    And user fills registration "cnf-passsowrd" with "xxxxx"
    And user clicks "Register" button
    Then User is created Successfully
    And user return back on registration page
     