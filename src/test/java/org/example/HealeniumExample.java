package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HealeniumExample {
    WebDriver driver;
    @BeforeMethod
    void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println("Chrome driver set-up is done");
    }
    @AfterMethod
    void quite(){
        driver.quit();
        System.out.println("Closing driver");
    }
    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.facebook.com");
        System.out.println("test is completed");
        Thread.sleep(3000);
    }
}
