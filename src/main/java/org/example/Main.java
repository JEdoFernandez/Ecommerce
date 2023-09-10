package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Main {
    public static void main(String[] args) {

        // Iniciar el WebDriver
        WebDriver driver = new ChromeDriver();

        // Añadir URL de la página
        driver.get("https://www.elcorteingles.es/electrodomesticos/lavadoras/");

        // Encontrar los productos de la pagina
        WebElement productList = driver.findElement(By.className("js_preview_image")); // Adjust the selector as needed

        // Contar el número de lavadoras en la página
        int actualProductCount = productList.findElements(By.className("js_preview_image")).size();

        System.out.println(actualProductCount);

        // Coincidir con el número de productos que hemos contado en la página
        int expectedProductCount = 25; // Replace with the expected count
        if (actualProductCount == expectedProductCount) {
            System.out.println("Test correcto: Mismo número de Lavadoras.");
        } else {
            System.out.println("Test Incorrecto: distinto número de Lavadoras.");
        }

        // Cerrar el Webdriver
        driver.quit();
    }
}