@API
  Feature: Get Weather API Feature

    Scenario: Get Weather For Certain Cities Scenario
      Given that I will get the weather for 16 days for Bari
      Then I will get the weather for 120 hours for Florence
      Then I will get the current weather for Rome
      Then I will get one hour minutely forecast for Cefalu
      Then I will get severe weather alerts for Dublin
      Then I will get 5 days forecast for Birmingham