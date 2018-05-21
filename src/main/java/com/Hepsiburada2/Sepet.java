package com.Hepsiburada2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.By.id;


public class Sepet {

    WebDriver webDriver;
    //WebDriverWait webDriverWait;

    public Sepet(WebDriver webDriver) {

        this.webDriver = webDriver;
        //this.webDriverWait = new WebDriverWait(webDriver, 30, 150);



        }

    public void girisyap(String username, String password) {

        webDriver.get("https://www.hepsiburada.com/ayagina-gelsin/giris?ReturnUrl=%2f");
        webDriver.findElement(id("email")).sendKeys(username);
        webDriver.findElement(id("password")).sendKeys(password);
        webDriver.findElement(By.cssSelector(".btn.full.btn-login-submit")).click();
        webDriver.findElement(By.cssSelector(".insider-opt-in-notification-button.insider-opt-in-disallow-button")).click();
        WebElement searchAreaElement = webDriver.findElement(id("productSearch"));
        searchAreaElement.sendKeys("çeyrek altın");
        searchAreaElement.sendKeys(Keys.ENTER);
        webDriver.findElement(By.cssSelector(".hb-pl-cn")).click();
        webDriver.findElement(By.id("addToCart")).click();
        webDriver.findElement(By.cssSelector(".btn.btn-primary.full")).click();
        WebElement name = webDriver.findElement(By.id("first-name"));
        name.sendKeys("Gulsemin");
        WebElement surname = webDriver.findElement(By.id("last-name"));
        surname.sendKeys("Demir");
        List<WebElement> acılanmenu = webDriver.findElements(By.cssSelector(".btn.dropdown-toggle.selectpicker.btn-default"));
        acılanmenu.get(2).click();
        webDriver.findElement(By.xpath("//span[contains(@class,'text')]  [contains(text(),'BAHÇELİEVLER')]")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webDriver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys(Keys.PAGE_DOWN);
        WebElement adres = webDriver.findElement(By.id("address"));
        adres.sendKeys("x SOKAK y  Apartmanı no 010101");
        WebElement adresadı = webDriver.findElement(By.id("address-name"));
        adresadı.sendKeys("iş adresi");
        WebElement telefon = webDriver.findElement(By.id("phone"));
        telefon.sendKeys("5101011101");
        WebElement kimlikno = webDriver.findElement(By.id("citizen-id"));
        kimlikno.sendKeys("12345678901");

        //driver.findElement(By.cssSelector(".btn.btn-primary.full")).click();



    }

}