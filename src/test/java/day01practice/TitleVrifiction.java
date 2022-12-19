package day01practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVrifiction {
    public static void main(String[] args) {
        //task: techpro education sayfasına git ve titlenin "Techpro Education | Online It Courses & Bootcamps"
        //içerip içermediğini doğrulayınız
        WebDriver driver =new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.navigate().to("https://www.techproeducation.com");
        String actualTitle=driver.getTitle();
        String expectedTitle="Techpro Education | Online It Courses & Bootcamps";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("PASSS");
        }else {
            System.out.println("FAİLEDDD");
            System.out.println("Actual Title :"+actualTitle);
            System.out.println("But expected title :"+expectedTitle);
        }
    }
}
