package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

public class Components {
    protected WebDriver webDriver;

    protected void launchApp() {
        String path = Paths.get("").toAbsolutePath().toString();
        System.out.println("Current path: " + path);
        System.setProperty("webdriver.chrome.driver", path.concat("\\libs\\chromedriver"));
        webDriver = new ChromeDriver();
        webDriver.get(TestData.url);
    }

    protected void searchProduct() {
        webDriver.findElement(By.cssSelector(PageObjects.searchBox)).sendKeys(TestData.searchEntity);
        webDriver.findElement(By.cssSelector(PageObjects.searchBtn)).click();
    }

    protected void closeApp() {
        webDriver.close();
    }
}
