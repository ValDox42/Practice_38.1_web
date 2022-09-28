package lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Core {
    public static final WebDriver webDriver;
    static {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\valdo\\Practice_38.1_web\\src\\test\\chromedriver.exe");
    webDriver = new ChromeDriver();
    webDriver.manage().window().maximize();
    webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
