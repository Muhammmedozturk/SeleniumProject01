package day02_DriverMetod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_LocatorGetMetodları {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //amazon sayfasına gidelim
        driver.get("https://www.amazon.com");
        //search bölümünü locate edip, iphone aratalım
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        //Arama sonuç yazısında iphone yazısını locate edip konsola yazdıralım
WebElement aramaSonucYazisi=driver.findElement(By.className("sg-col-inner"));
        System.out.println("Arama Sonuç Yazısı :"+aramaSonucYazisi.getText());
        //sayfayı kapatalım
    }


}
