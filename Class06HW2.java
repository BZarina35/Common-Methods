package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Class06HW2 extends CommonMethods {

    public static void main(String[] args) {

        String url = "http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // click on get new user, print the firstname of user

        WebElement getNewUser = driver.findElement(By.xpath("//button[@id='save']"));
        getNewUser.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement firstName = driver.findElement(By.xpath("//p[contains(text(), 'First Name')]"));
        System.out.println(firstName.getText());
        driver.close();


    }
}
