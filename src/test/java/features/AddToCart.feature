@regression @sanity
Feature: Add To Cart Feature

Background:
 Given that I will open the page




Scenario: Add to Cart Test Scenario
  Then I will click on Hoodies and Sweatshirts button from homepage
  Then I will click on the Circe hoodie from the Hoodies and Sweatshirts page
  And I will click on the M size of the Circe hoodie from the CirceHoodie page
  And I will click on the green colour of the Circe hoodie from the CirceHoodie page
  Then I will click on the Add to Cart button from the CirceHoodie page

  Then I will click on the Tees page from the CirceHoodie page
  Then I will hover over the Gwyn Endurance Tee Image from the Tees page
  And I will click on the M size of the Gwyn Endurance Tee from the Tees page
  And I will click on the black colour of the Gwyn Endurance Tee from the Tees page
  Then I will click on the Add to Cart button of the Gwyn Endurance Tee

  Then I will hover over the Radiant Tee image from the Tees page
  And I will click on the L size of the Radiant Tee from the Tees page
  And I will click on the purple colour of the Radiant Tee from the Tees page
  Then I will click on the Add to cart button of the Radiant Tee from the Tees page