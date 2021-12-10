package downloadFile;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class filedownloadinginchrome {

    WebDriver driver;

    @Test

    void downloadfile(){

        driver.findElement(By.id("textbox")).sendKeys("Automation");
        driver.findElement(By.id("createTxt")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("link-to-download")).click();

    }


    @BeforeTest
    void openurl() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/FileDownload.html");

    }

    @AfterTest
    void closeBrowser() {

        System.out.println("File Download Successfully");
       // driver.quit();

    }
}
