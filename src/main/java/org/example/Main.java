package org.example;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Main {
    public static void main(String[] args) {
        System.setProperty("\"C:\\Program Files\\Eclipse Adoptium\\chromedriver.exe\"", "webdriver.chrome.driver");

        // Iniciar el WebDriver
        WebDriver driver = new ChromeDriver();

        // Añadir URL de la página
        driver.get("https://www.carrefour.es/electrodomesticos/lavadoras/cat4165460/c");

        // Encontrar los productos de la pagina
        WebElement productList = driver.findElement(By.className("media__link"));

        // Contar el número de lavadoras en la página
        int actualProductCount = productList.findElements(By.className("media__link")).size();

        System.out.println(actualProductCount); //No recoge nada en la página

        // Test, Coincidir con el número de productos que hemos contado en la página
        int expectedProductCount = 24; // Replace with the expected count
        if (actualProductCount == expectedProductCount) {
            System.out.println("Test correcto: Mismo número de Lavadoras."); //assert
        } else {
            System.out.println("Test Incorrecto: distinto número de Lavadoras."); //assert
        }

        // Cerrar el Webdriver
        driver.quit();
    }
}
