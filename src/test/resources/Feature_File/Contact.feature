Feature: Contact Form Submission
  To ensure users can submit the contact form successfully.

  @ContactTest
  Scenario: Submit the contact form with valid details
    Given I am on the contact page
    When I enter my first name as "John"
    And I enter my last name as "Doe"
    And I enter my email as "john.doe@example.com"
    And I enter the subject as "Inquiry about products"
    And I enter the message as "I would like to know more about your products and services. Please provide detailed information regarding product availability, pricing, and specifications."
    And I click the submit button
    Then I should see a success message indicating that my message was sent successfully and I will be contacted shortly.

  @ContactTest
  Scenario: Submit the contact form with missing required fields
    Given I am on the contact page
    When I enter my first name as "John"
    And I enter my last name as "Doe"
    And I leave the email field empty
    And I enter the subject as "Inquiry about products"
    And I enter the message as "I would like to know more about your products but did not provide my email address, as I am unsure if it is required."
    And I click the submit button
    Then I should see an error message indicating that the email field is mandatory and must be filled in before submission.
