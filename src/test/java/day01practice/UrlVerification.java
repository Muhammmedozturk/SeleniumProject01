package day01practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlVerification {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.navigate().to("https://www.techproeducation.com");

        //verify if google homapage orl is "https://www.techproeducation.com"
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl ="https://techproeducation.com";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("PASSSS");
        }else {
            System.out.println("FAİLEDDD");
            System.out.println("Actual Url:"+actualUrl);
            System.out.println("Expected url :"+expectedUrl);
        }
    }
    /*
    WHAT İS APPROACH FOR AUTOMATİON?
    -I read the acceptance criterias carrefully
    -I than create my test cases
    -I do manual testing first
    -if all good then I start comlete automation script
    -If I find a bug than I talk to dev. Dev fixes the issue than I retest if all is good than complete my automation script
    -when the automation is complete T prepare report fot the user story. in fact my automation script generates html repots
    for us I upload those reports to the JIRA
    -for my manual est cases I manually take screenshouts and prepare reports and attach them to the JIRA

    WHAT DO YOU DO WHEN YOUR TEST CASE PASSED
    prepare report and upload to JIRA
     WHAT DO YOU DO WHEN YOUR TEST CASE FAIL
     -retest to make sure from the failure. it can be data issue typo documentation issue or is can be real bug
     -if that is a bug than talk to dev and let them fix the bug
     -after the fix we retest when test cases passes we uploat to JIRA

     WHAT DO YOU DU WHEN YOU FİND A BUG
     -RETEST TO MAKE SURE FROM THE FAİLURE it can be data issue typo documentation issue or is can be real bug
          -if that is a bug than talk to dev and let them fix the bug
           -after the fix we retest when test cases passes we uploat to JIRA

     */
}
