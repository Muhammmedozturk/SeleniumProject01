package day01driverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day01_topluOrnek {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //bu metod sayfadaki her bir web element için max bekleme süresini belirler
        //chromedriveri kullanarak facebook sayfasına gidin ve sayfa baslığının title "facebook"
        //olduğunu doğrulayın
        driver.get("https://www.facebook.com");
        String actualTitle=driver.getTitle();
        if (actualTitle.contains("facebook")){
            System.out.println("title testi PASSED");
        }else {
            System.out.println("title testi failed");
            System.out.println("Doğru baslık:" + actualTitle);
            //sayfa url sinin facebook kelimesi içerdiğini doğrulayın içermiyorsa actual url yazdır
            String actualUrl = driver.getCurrentUrl();
            if (actualUrl.contains("facebook")) {
                System.out.println("URL testi PASSED");
            } else {
                System.out.println("URL testi failed actual url:" + actualUrl);
                //walmart sayfasına gidin
                driver.get("https://www.walmart.com");
                //sayfa başlığının walmart.com içerdiğini dğrulayn
                String actualwalmartTitle = driver.getTitle();
                if (actualwalmartTitle.contains("walmart.com")) {
                    System.out.println("title testi passed");
                } else System.out.println("title testi failed");
                //tekrar facebook sayfasına dönün
                driver.navigate().back();
                //sayfayı yenileyin
                driver.navigate().refresh();
                //sayfayı kapat
                driver.close();


            }

        }}}