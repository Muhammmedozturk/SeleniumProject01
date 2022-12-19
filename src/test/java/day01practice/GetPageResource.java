package day01practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageResource {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().fullscreen();
        //if aazon contains Registry on the homapage
        driver.get("https://www.amazon.com");
        String pageSource=driver.getPageSource();


        String expectedWord="Registry";
        if (pageSource.contains(expectedWord)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAİLED");
        }
        driver.close();
    }
}
