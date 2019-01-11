package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EBayTestingApp {
    public static final String SERCHFIELD = "gh-ac";

    public static void main(String[] args){
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.ebay.com/");

        WebElement searchField = driver.findElement(By.id(SERCHFIELD));
        searchField.sendKeys("laptop");
        searchField.submit();
    }
}
