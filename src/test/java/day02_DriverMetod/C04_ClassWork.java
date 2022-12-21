package day02_DriverMetod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
/*
a.web sayfasına gidin. https://www.amazon.com/
Search(ara) “city bike”
Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
 */

public class C04_ClassWork {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();//tam ekran yap
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //web sayfasına gidin
        driver.get("https://www.amazon.com");
        //search ara "city bike"
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);
        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
    List<WebElement> aramaSonucYazısı=driver.findElements(By.className("sg-col-inner"));
        System.out.println("Arama Sonuc Yazısı"+aramaSonucYazısı.get(0).getText());

        //arama sonuç sayısını konsolda yazdırınız
        String [] sonucSayisi=aramaSonucYazısı.get(0).getText().split(" ");
        System.out.println("Sonuc sayısı :"+sonucSayisi[2]);

        //sonuc sayısını lambda ile yazdırınız
        Arrays.stream(aramaSonucYazısı.get(0).getText().split(" ")).limit(3).skip(2).forEach(System.out::println);

        //sonra karşımıza çıkan ilk sonucun resmine tıklayın
        List<WebElement>ilwebelement=driver.findElements(By.className("s-image"));
        ilwebelement.get(0).click();
    }
}
