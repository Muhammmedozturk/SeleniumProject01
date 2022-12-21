package day02practice;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {

    //herhangi bir sayfaya kullanıcı adı ve şifre ile giriş yapma
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//15 seconds wait in case needed
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement username=driver.findElement(By.name("username"));
        username.sendKeys("admin");//admin kullanıcı adı girilir
        WebElement sifre=driver.findElement(By.name("password"));
        sifre.sendKeys("admin123");//şifre girişi
        WebElement butonClick=driver.findElement(By.tagName("button"));//butona tıklama
        butonClick.click();
        //giriş işleminin başarıyla gerçekleştiğini doğrulayalım
        //1 we can use default page url to do assertion
        //or we can locate a core element on the default page to assert i that element is displayed on the page
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
        Dimension actualYeniSize=driver.manage().window().getSize();
        if (actualYeniSize.getHeight()==600 && actualYeniSize.getWidth()==600) {
            System.out.println("Size testi PASSED");
        }else {
            System.out.println("size test failed");
        }
        Point actualpozition=driver.manage().window().getPosition();
        if (actualpozition.getX()==70 && actualpozition.getY()==80){
            System.out.println("PASSED");
        }else {
            System.out.println("FAİLED");
        }


    }
}
