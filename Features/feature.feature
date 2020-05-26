Feature: Loging
Background: 
Given nakuri home page
@Reg1
Scenario: Register nakuri
When Enter Details
Then submit

@Login
Scenario: Facebook Login
When Enter uname and pword
Then Login