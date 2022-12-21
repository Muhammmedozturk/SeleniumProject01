package day04_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TekrarSoru {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");
        //arama kutusunu locate ediniz
        WebElement aramaKutusu=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        //arama kutusunun tagName'inin input olduğunu test ediniz
        String actualTagName=aramaKutusu.getTagName();
        String expectedTagName="input";
        if (actualTagName.equals(expectedTagName)){
            System.out.println("Tag name testi passed"+ actualTagName);
        }else {
            System.out.println("tag name testi başarısız");
        }
        //arama kutusunun name attributunun değerinin field keywords olduğunu test ediniz
        String actualAttributeName=aramaKutusu.getAttribute("name");
        String expectedAttributeName="field-keywords";
        if (actualAttributeName.equals(expectedAttributeName)){
            System.out.println("Attribute testi passed"+ actualTagName);
        }else {
            System.out.println("Attribute testi başarısız");
        }
        driver.close();

    }
}
