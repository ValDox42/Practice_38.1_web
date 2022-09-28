package tests;

import lib.Core;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class corporatePage extends Core {

    @Before
    public void cpTest() {
        webDriver.get("https://skillfactory.ru");
        webDriver.findElement(By.xpath("//*[@id=\"rec456746055\"]/div/div/div[42]/a")).click();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void offerWarningCheck() {
        webDriver.findElement(By.xpath("//*[@id=\"form425959013\"]/div[2]/div[6]/button")).click();
        final var warning = webDriver.findElement(By.xpath("//*[@id=\"tilda-popup-for-error\"]/div[1]/p")).getText();
        assertEquals("Пожалуйста, заполните все обязательные поля", warning);
    }

    @Test
    public void googleTables() {
        webDriver.findElement(By.xpath("//div[contains(text(), 'Мастер Google-таблиц')]")).click();
    }

    @Test
    public void maths() {
        webDriver.findElement(By.xpath("//div[contains(text(), 'Математика')]")).click();
    }

    @Test
    public void devOps() {
        webDriver.findElement(By.xpath("//div[contains(text(), 'DevOps-инженер')]")).click();
    }

    @Test
    public void return2main() {
        webDriver.findElement(By.className("t228__imgwrapper")).click();
    }

    @AfterClass
    public static void quit() {
        webDriver.quit();
    }
}
