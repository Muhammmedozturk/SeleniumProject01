package day02_DriverMetod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
/*
a.web sayfasına gidin. https://www.amazon.com/
Search(ara) “city bike”
Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
 */

public class C04_ClassWork {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //web sayfasına gidin
        driver.get("https://www.amazon.com");
        //search ara "city bike"
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);
        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement aramaSonucYazisi=driver.findElement(By.className("sg-col-inner"));
        System.out.println(aramaSonucYazisi);
    }
}
