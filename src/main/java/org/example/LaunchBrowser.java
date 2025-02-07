package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

    public void launchBrowserChrome() throws InterruptedException {


        String userName = "r.alok52@gmail.com";
        String password = "HdfcHello123@@";

        System.setProperty("webdriver.chrome.driver","C:\\webid\\chromedriver-win64\\chromedriver.exe");
        WebDriver dr1 = new ChromeDriver();

        String baseurl = "https://www.shopify.com/in";
        dr1.manage().window().maximize();
        dr1.navigate().to(baseurl);

        WebElement loginButton = dr1.findElement(By.xpath("//a[text()='Log in']"));
        loginButton.click();

        WebElement emailField = dr1.findElement(By.xpath("//input[@type='email']"));
        emailField.sendKeys(userName);

        Thread.sleep(6000);

        WebElement countinueButton = dr1.findElement(By.xpath("//button[@type='submit']"));
        countinueButton.click();
        Thread.sleep(6000);

        WebElement passwordField = dr1.findElement(By.xpath("//input[@type='password']"));
        passwordField.sendKeys(password);
        Thread.sleep(6000);


        WebElement loginButton2 = dr1.findElement(By.xpath("//button[@type='submit']"));
        loginButton2.click();


    }

    public static void main(String[] args) throws InterruptedException {
        LaunchBrowser lb1 = new LaunchBrowser();
        lb1.launchBrowserChrome();

    }
}
