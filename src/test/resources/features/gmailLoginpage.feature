Feature: validate Flipkart Login page

  Background: validate the login in page
    Given open "chrome" browser
    When launch a site 
    Then Login Text is displayed

  Scenario Outline: validate the Gmail login page with valid credentials
    When enter valid user name "<username>" in user name field
    Then click on emailnext button
    When enter valid password "<password>" in password field
    Then click on passwordnext button

    Examples: 
      | username                         | password   |
      | padmavathipathella0324@gmail.com | 9032042174 |

  Scenario Outline: validate the Gmail login page with invalid user name
    When enter invalid user name "<username>" in user name field
    And click on emailnext button
    Then check the user name error message displayed or not

    Examples: 
      | username                     |
      | padmavathipathella@gmail.com |

  Scenario Outline: validate the Gmail login page empty  user name
    When enter empty user name "<username>" in user name field
    And click on emailnext button
    Then check the empty user error message displayed or not

    Examples: 
      | username |
      |          |

  Scenario Outline: validate the Gmail login page valid  user name with invalid password
    When enter valid user name "<username>" in user name field
    And click on emailnext button
    When enter invalid password "<password>" in password field
    Then click on passwordnext button
    And check the password error message

    Examples: 
      | username                         | password   |
      | padmavathipathella0324@gmail.com | 9032042158 |

  Scenario Outline: validate the Gmail login page valid  user name with empty password
    When enter valid user name "<username>" in user name field
    And click on emailnext button
    When enter empty password "<password>" in password field
    Then click on passwordnext button
    And check the empty password error message

    Examples: 
      | username                         | password |
      | padmavathipathella0324@gmail.com |          |

  Scenario Outline: validate the Gmail login page  user name all are in capital letters
    When enter valid user name "<username>" in user name field
    And click on emailnext button
    And check password page dislpayed or not 
    
    Examples: 
      | username                         | 
      | PADMAVATHIPATHELLA0324@GMAIL.COM |

  Scenario Outline: validate the Gmail login page  user name some are in capital some are small letters
     When enter valid user name "<username>" in user name field
    And click on emailnext button
    And check password page dislpayed or not
    
    Examples: 
      | username                         | 
      | PADMAVATHIpathella0324@GMAIL.COM |

  
