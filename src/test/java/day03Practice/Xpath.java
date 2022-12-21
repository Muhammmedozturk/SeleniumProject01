package day03Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Xpath {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

//        1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");
//        2. Signin buttonuna tiklayin
        driver.findElement(By.xpath("//*[@type='button']")).click();
//        3. Login alanine  "username" yazdirin
        WebElement userName=driver.findElement(By.name("user_login"));
        userName.sendKeys("username");
//        4. Password alanine "password" yazdirin
        WebElement sifre=driver.findElement(By.name("user_password"));
        sifre.sendKeys("password");
//        5. Sign in buttonuna tiklayin (hata mesaji icin back tusuna tiklayin)
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        driver.navigate().back();
//        6. Online Banking menusunden Pay Bills sayfasina gidin
        driver.findElement(By.cssSelector("li[id='onlineBankingMenu']")).click();
        driver.findElement(By.cssSelector("span[id='pay_bills_link']")).click();
//        7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        WebElement miktar=driver.findElement(By.name("amount"));
        miktar.sendKeys("10.000");
//        8. tarih kismina "2020-09-10" yazdirin
        WebElement tarih=driver.findElement(By.name("date"));
        tarih.sendKeys("2020-09-10");
//        9. Pay buttonuna tiklayin
        driver.findElement(By.cssSelector("input[value='Pay']")).click();
//        10. "The payment was successfully submitted." mesajinin ciktigini kontrol edin
        WebElement expectedMesaj=driver.findElement(By.cssSelector("span[title='$ 10.000 payed to payee sprint']"));
        if (expectedMesaj.isDisplayed()){
            System.out.println("Test başarılı");
        }
    }
}
