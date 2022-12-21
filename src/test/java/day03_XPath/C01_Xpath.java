package day03_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //        1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
//        2- Add Element butonuna basin
        WebElement addButtonT = driver.findElement(By.xpath("//*[text()='Add Element']"));
        addButtonT.click();
//        3- Delete butonu'nun gorunur oldugunu test edin
    Thread.sleep(3000);
    WebElement deleteButonu =driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));
    if (deleteButonu.isDisplayed()){
        System.out.println("Test PASSED");
    }else {
        System.out.println("Test FAILED");
    }
    //delete butonuna basınız
    Thread.sleep(3000);
    deleteButonu.click();//
//add/Remove Elements yazısının görünür olduğunu test ediniz
WebElement addRemoveYazısı=driver.findElement(By.xpath("//h3"));
        if (addRemoveYazısı.isDisplayed()){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
    }

}
