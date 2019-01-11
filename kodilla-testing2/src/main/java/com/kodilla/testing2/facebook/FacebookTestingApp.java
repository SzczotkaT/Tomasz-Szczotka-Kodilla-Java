package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_RELATIVE_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_RELATIVE_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_RELATIVE_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";


    public static void main(String[] args){

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_RELATIVE_DAY));
        Select selectBoard = new Select(selectCombo);
        selectBoard.selectByIndex(20);

        WebElement selectCombo2 = driver.findElement(By.xpath(XPATH_RELATIVE_MONTH));
        Select selectBoard2 = new Select(selectCombo2);
        selectBoard2.selectByIndex(5);

        WebElement selectCombo3 = driver.findElement(By.xpath(XPATH_RELATIVE_YEAR));
        Select selectBoard3 = new Select(selectCombo3);
        selectBoard3.selectByIndex(31);

    }
}
