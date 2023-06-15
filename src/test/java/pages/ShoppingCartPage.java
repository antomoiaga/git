package pages;

import org.openqa.selenium.By;

public class ShoppingCartPage {

    public static By ShoppingCartTitle = By.xpath("/html/body/div[1]/main/div[1]/h1/span");


    public static By DeleteBtn = By.xpath("/html/body/div[1]/main/div[3]/div/div[2]/form/div[1]/table/tbody/tr[2]/td/div/a[2]");

    public static By NoItemsMessage = By.xpath("/html/body/div[1]/main/div[3]/div/div[2]/p[1]");

}
