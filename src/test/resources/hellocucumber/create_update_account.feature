Feature: create a account
  I want to create a account

  Scenario Outline: Creat a account
    Given I want to create a account with name "<name>" phone "<phone>" email "<email>"
    Then verify the account name "<name>" phone "<phone>" email "<email>"

    Examples: 
      | name | phone       | email             |
      | Tao  | 15827521823 | kttaonote@163.com |
      | Tao  | 15827521823 | kttaonote@163.com |

  Scenario Outline: update account
    Given I want to create a account with name "<name>" phone "<phone>" email "<email>"
    Then verify the account name "<name>" phone "<phone>" email "<email>"
    Given I want to update a account with name "<name>" phone "<phone>" email "<updatedEmail>"
    Then verify the account name "<name>" phone "<phone>" email "<email>"
    When update account with new instance
    Then verify the account should be null

    Examples: 
      | name | phone       | email               | updatedEmail         |
      | Tao  | 15827521823 | tao.kong@toyota.com | tao.kong@updated.com |
