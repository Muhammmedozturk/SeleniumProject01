package day01practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classwork {
    public static void main(String[] args) {
        //obje oluşturalım
        WebDriver driver=new ChromeDriver();
        //test için herzaman fulscreen yapılmalıdır
        driver.manage().window().fullscreen();
        //walmart sayfasını açar
        driver.get("https://www.walmart.com");
        //daha sonta amazon sayfasını açar
        driver.navigate().to("https://www.amazon.com");
        //bir önceki sayfaya gider
        driver.navigate().back();
        //sayfa başlığını alır
        System.out.println(driver.getTitle());
       //sayfa kaynağını yazdırır
        System.out.println(driver.getPageSource());

        //aktif driveri kapatır
        driver.close();


    }



}
