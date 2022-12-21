package day04_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        //1https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        //)Sayfadaki Berlin web elementini relativelocator ile tıklayalım
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
        WebElement NYCwebElement=driver.findElement(By.xpath("//*[@id='pid3_thumb']"));
        WebElement BayAreaWEbelement=driver.findElement(By.cssSelector("img[id='pid8_thumb']"));
        //bir kaç element için ortak tag name kullanmalıyız(li)
        WebElement berlinWebElement=driver.findElement(with(By.tagName("li")).below(NYCwebElement).toLeftOf(BayAreaWEbelement));
        berlinWebElement.click();



    }
}
