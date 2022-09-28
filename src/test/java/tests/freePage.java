package tests;

import lib.Core;
import org.junit.*;
import org.openqa.selenium.By;



public class freePage extends Core {

    @Before
    public void pageSF() {
        webDriver.get("https://skillfactory.ru");
        webDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div[41]/a")).click();
    }

    @Test
    public void how2test() {
        webDriver.findElement(By.xpath("//*[@id=\"rec488579905\"]/div/div/div[18]/a")).click();
    }

    @Test
    public void dataAnalyst() {
        webDriver.findElement(By.xpath("//*[@id=\"rec488579905\"]/div/div/div[19]/a")).click();
    }

    @Test
    public void languageTest() {
        webDriver.findElement(By.xpath("//*[@id=\"rec487657377\"]/div/div/div[7]/a")).click();
    }

    @Test
    public void dataScience() {
        webDriver.findElement(By.xpath("//*[@id=\"rec488579905\"]/div/div/div[20]/a")).click();
    }

    @Test
    public void return2main() {
        webDriver.findElement(By.xpath("//*[@id=\"rec487651767\"]/div/div/div[8]")).click();
    }

    @AfterClass
    public static void quit() {
        webDriver.quit();
    }
}
