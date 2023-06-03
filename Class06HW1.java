package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Class06HW1 extends CommonMethods {

    public static void main(String[] args) throws InterruptedException {

        String url = "http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(20));


        // click on start and print the text "welcome syntax technologies" on console

        WebElement startBtn = driver.findElement(By.xpath("//button [@id='startButton']"));
        startBtn.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement text = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        wait.until(ExpectedConditions.textToBePresentInElement(text, "Welcome Syntax Technologies"));
        System.out.println(text.getText());
        Thread.sleep(3000);
        driver.quit();
    }



    }

