package day02_DriverMetod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebElements {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //amazona gidelim
        driver.get("https://www.amazon.com");
        //search bölümünü locate edelim
       // WebElement aramakutusu= driver.findElement(By.id("twotabsearchtextbox"));//id ile yaptık
        WebElement aramakutusu= driver.findElement(By.name("field-keywords"));//name ile yaptık
        //searche bölümünde iphone aratalım
        aramakutusu.sendKeys("iphone", Keys.ENTER);
        /*
        eğer bir webElementi (sayfadaki herbir buton ya da text yazı)konumunu belirlemek locate etmek istersek
        önce web sayfasında manuel olarak açıp sayfa üzerinde sağ click yapıp inceleye tıklarız.
        karşımıza çıkan html kodlarından locater (konum belirleyiciler) lardan eşsiz olanı seçeriz. genellikle
        id Attribute kullanılır seçtiğimiz attribute değerini finelement metodu içine findelement (by.id("attribute
        değeri") şeklinde yazarız.
         */
        //amazon sayfasındaki <input> ve <a> taglarının sayısını yazdırınız
        List<WebElement> inputTags=driver.findElements(By.tagName("input"));
        System.out.println("Input tag sayısı"+inputTags.size());

        List<WebElement> linklerlist=driver.findElements(By.tagName("a"));
        System.out.println("Link sayısı ="+linklerlist.size());
        for (WebElement w: linklerlist){
            System.out.println(w.getText());
        }
    }


}
