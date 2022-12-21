package day03Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Excercise01 {
    public static void main(String[] args) {
//        Test Case 1: Register User
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        1. Launch browser
//        2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
//        3. Verify that home page is visible successfully
        String homePage=driver.getCurrentUrl();
        if (homePage.equals("http://automationexercise.com")){
            System.out.println("Anasayfadasınız test başarılı");
        }else {
            System.out.println("anasayfadda değilsiniz test başarısız");
        }

//        4. Click on 'Signup / Login' button
        driver.findElement(By.cssSelector("a[href='/login']")).click();
//        5. Verify 'New User Signup!' is visible
        WebElement newUser=driver.findElement(By.xpath("//*[h2='New User Signup!'] "));
        if (newUser.isDisplayed()){
            System.out.println("New User Signup! is visible");
        }else {
            System.out.println("is not visible");
        }
//        6. Enter name and email address
WebElement name=driver.findElement(By.name("name"));
        name.sendKeys("muhammed");
        WebElement email=driver.findElement(By.cssSelector("input[data-qa='signup-email']"));
        email.sendKeys("muhammmedozturk@gmail.com");
//        7. Click 'Signup' button
        driver.findElement(By.cssSelector("button[data-qa='signup-button']")).click();
//        8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement enterAccountVisible=driver.findElement(By.xpath("//*[b='Enter Account Information']"));
        if (enterAccountVisible.isDisplayed()){
            System.out.println("enter account yazısı başarılı");
        }else {
            System.out.println("enter account yazısına ulaşılamadı");
        }
//        9. Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.id("id_gender1")).click();
        WebElement pasword=driver.findElement(By.cssSelector("input[type='password']"));
        pasword.sendKeys("123456");
        WebElement day=driver.findElement(By.cssSelector("select[data-qa='days']"));
        Select selectday=new Select(day);
        selectday.selectByIndex(18);
        WebElement month=driver.findElement(By.cssSelector("select[data-qa='months']"));
        Select selectm=new Select(month);
        selectm.selectByIndex(5);

//        10. Select checkbox 'Sign up for our newsletter!'
//        11. Select checkbox 'Receive special offers from our partners!'
//        12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
//        13. Click 'Create Account button'
//        14. Verify that 'ACCOUNT CREATED!' is visible
//        15. Click 'Continue' button
//        16. Verify that 'Logged in as username' is visible
//        17. Click 'Delete Account' button
//        18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
    }
}
