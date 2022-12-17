package day01driverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_DriverManageMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanın konumu :"+driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutları"+driver.manage().window().getSize());
        //Sayfayi simge durumuna getirin
        driver.manage().window().minimize();
        //simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Sayfa maximize iken Sayfanın konumu :"+driver.manage().window().getPosition());
        System.out.println("Sayfa maximize iken Sayfanın boyutları"+driver.manage().window().getSize());
        //Sayfayi fullscreen yapin
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        //Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Sayfa fullscreen iken Sayfanın konumu :"+driver.manage().window().getPosition());
        System.out.println("Sayfa fullscreen iken Sayfanın boyutları"+driver.manage().window().getSize());
        //Sayfayi kapatin
        driver.close();
    }
}
