package PageOne;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPageOne extends BaseTest {


    @Test
    public void testCanFindJava(){
        driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
        //driver.findElements(By.xpath("//input[@id='email_create']"));
        driver.findElement(By.id("email_create")).sendKeys("test+1@gmail.com");
        driver.findElement(By.xpath("//span[normalize-space()='Create an account']")).click();


    }
}
