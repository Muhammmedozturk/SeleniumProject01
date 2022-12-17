package day01driverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_DriverMethod {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();//boş bir browser açtık
        driver.get("https://www.amazon.com");//ilk olarak gitmek istediğimiz sayfayı belirttik
        System.out.println("sayfa başlığı:"+driver.getTitle());//sayfa başlığını getirdik
        System.out.println("sayfa url si:"+driver.getCurrentUrl());//sayfa url sini aldık
        //System.out.println(driver.getPageSource());//sayfanın kaynak kodlarını getirir
        System.out.println(driver.getWindowHandle());//Bize o windowa ait hash değerini verir
        //biz bu hash değerlerini bir string'e atayıp pencereler arası geçiş yapabiliriz
    }

}
