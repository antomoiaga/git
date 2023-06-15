package pages;

import org.openqa.selenium.By;

public class TeesPage {

    public static By GwynEnduranceTeeImage = By.partialLinkText("Gwyn Endurance Tee");
    public static By GwynEnduranceTeeMSize = By.xpath("/html/body/div[1]/main/div[3]/div[1]/div[3]/ol/li[2]/div/div/div[3]/div[1]/div/div[3]");

    public static By GwynEnduranceTeeBlackColour = By.xpath("/html/body/div[1]/main/div[3]/div[1]/div[3]/ol/li[2]/div/div/div[3]/div[2]/div/div[1]");

    public static By GwynEnduranceTeeAddToCartBtn = By.xpath("/html/body/div[1]/main/div[3]/div[1]/div[3]/ol/li[2]/div/div/div[4]/div/div[1]/form/button/span");

    public static By RadiantTeeImage = By.partialLinkText("Radiant Tee");

    public static By RadiantTeeSizeL = By.xpath("/html/body/div[1]/main/div[3]/div[1]/div[3]/ol/li[3]/div/div/div[3]/div[1]/div/div[4]");

    public static By RadiantTeePurple = By.xpath("/html/body/div[1]/main/div[3]/div[1]/div[3]/ol/li[3]/div/div/div[3]/div[2]/div/div[3]");

    public static By RadiantTeeAddToCart = By.xpath("/html/body/div[1]/main/div[3]/div[1]/div[3]/ol/li[3]/div/div/div[4]/div/div[1]/form/button/span");

    public static By CartBtn = By.xpath("/html/body/div[1]/header/div[2]/div[1]/a");

    public static By QuantityField = By.xpath("/html/body/div[1]/header/div[2]/div[1]/div/div/div/div[2]/div[4]/ol/li/div/div/div[2]/div[2]/input");

    public static By UpdateQuantityBtn = By.xpath("/html/body/div[1]/header/div[2]/div[1]/div/div/div/div[2]/div[4]/ol/li/div/div/div[2]/div[2]/button");

    public static By ViewAndEditCartBtn = By.xpath("/html/body/div[1]/header/div[2]/div[1]/div/div/div/div[2]/div[5]/div/a/span");
}
