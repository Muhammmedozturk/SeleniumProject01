package day01driverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_NevigateMethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //amazon sayfasına gidelim
        driver.navigate().to("https://amazon.com");
        //hepsiburada sayfasına gidelim
        Thread.sleep(2000);//iki saniye bekletir
        driver.navigate().to("https://techproeducation.com");
        //tekrar amazon sayfasına dönelim
        Thread.sleep(2000);
        driver.navigate().back();
        //tekrar hepsiburada sayfasına gidelim
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        //son sayfada sayfayı yenileyelim
        driver.navigate().refresh();
        //sayfayı kapatalım
        driver.close();


    }
}
