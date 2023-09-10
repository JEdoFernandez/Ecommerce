package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buscar {
        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Eclipse Adoptium\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            driver.get("https://www.carrefour.es/electrodomesticos/lavadoras/cat4165460/c");

            WebElement searchInput = driver.findElement(By.id("search-input"));


            searchInput.sendKeys("Ir a Carrefour.es" + Keys.ENTER);


            String pageTitle = driver.getTitle();

            if (pageTitle.contains("Ir a Carrefour.es")) {
                System.out.println("Test correcto");
            } else {
                System.out.println("Test incorrecto");
            }

            // Close the WebDriver
            driver.quit();
        }
    }
}
