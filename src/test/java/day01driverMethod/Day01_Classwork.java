package day01driverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_Classwork {


public static void main(String[] args) {
    //Yeni bir package olusturalim : day01
   // Yeni bir class olusturalim : C03_GetMethods
   // Amazon sayfasina gidelim. https://www.amazon.com/
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.com");
   // Sayfa basligini(title) yazdirin
    System.out.println("sayfa başlığı:"+driver.getTitle());
   // Sayfa basliginin “Amazon” icerdigini test edin
    String actualTitle=driver.getTitle();
    if (actualTitle.contains("Amazon")){
        System.out.println("Title testi PASSED");
    }else {
        System.out.println("Title testi failed");
    }
   // Sayfa adresini(url) yazdirin
    System.out.println("Sayfa url si"+driver.getCurrentUrl());
    // Sayfa url’inin “amazon” icerdigini test edin.
    String actualsayfaUrl= driver.getCurrentUrl();
    if (actualsayfaUrl.contains("amazon")){
        System.out.println("url testi passed");
    }else {
        System.out.println("url testi failed");
    }
   // Sayfa handle degerini yazdirin
    System.out.println("window handle değeri:"+driver.getWindowHandle());
    // Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
    String sayfaKodlari=driver.getPageSource();
    if (sayfaKodlari.contains("Getway")){
        System.out.println("Source kodları passed");
    }else {
        System.out.println("Source kodları failed");
    }
   // Sayfayi kapatin.
    driver.close();//sayfayı kapatmak için close()metodu kullanılır





    }


}
