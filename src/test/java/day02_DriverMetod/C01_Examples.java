package day02_DriverMetod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Examples {
    /*
    ilk önce browseri maximize yapalım sonra tüm sayfa için max bekleme süresi olarak 15 sn belirtelim
    sırasıyla amazon facebook ve youtube sayfasına gidelim amazon sayfasına tekrar dönelim.
    amazon sayfasının url inin https www.amazon.com adresine eşit olduğunu test edelim
    sayfanın konumunu ve size sini yazdıralım ve sayfayı kapatalım
    sayfanın konum ve size sini istediğim sekilde ayarlayalım ve test edelim sayfayı kapatalım
     */
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        driver.get("https://www.facebook.com");
        driver.get("https://www.youtube.com");
        driver.navigate().back();
        driver.navigate().back();//iki sayfa geri gitmek için iki defa back kullandık

        String actualUl =driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com";
        if (actualUl.equals(expectedUrl)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }

        System.out.println("sayfanın size si :"+driver.manage().window().getSize());
        System.out.println("sayfanın konumu :"+driver.manage().window().getPosition());

        driver.manage().window().setSize(new Dimension(600,600));
        driver.manage().window().setPosition(new Point(50,50));

        Dimension actualYeniSize=driver.manage().window().getSize();
        if (actualYeniSize.getWidth()==600 && actualYeniSize.getHeight()==600){
            System.out.println("size testi passed");
        }else {
            System.out.println("Size testi failed");
        }

        Point actualYeniKonum=driver.manage().window().getPosition();
        if (actualYeniKonum.getX()==50 && actualYeniKonum.getY()==50){
            System.out.println("size testi passed");
        }else {
            System.out.println("Size testi failed");
    }
        driver.close();
    }
}
