package tests;

import lib.Core;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;


import static org.junit.Assert.assertEquals;

public class partnership extends Core {

    @Before
    public void psPage() {
        webDriver.get("https://skillfactory.ru");
        webDriver.findElement(By.xpath("//a[contains(text(), 'Сотрудничество')]")).click();
    }

    @Test
    public void cpa() {
        webDriver.findElement(By.xpath("//*[@id=\"rec369304448\"]/div/div/div[11]/a")).click();
    }

    @Test
    public void bloggers() {
        webDriver.findElement(By.xpath("//*[@id=\"rec369304448\"]/div/div/div[17]/a")).click();
    }

    @Test
    public void corporate() {
        webDriver.findElement(By.xpath("//*[@id=\"rec369279258\"]/div/div/div[11]/a")).click();
    }

    @Test
    public void careerCenter() {
        webDriver.findElement(By.xpath("//*[@id=\"rec369296828\"]/div/div/div[23]/a")).click();
    }

    @Test
    public void myOption() {
        webDriver.findElement(By.xpath("//*[@id=\"rec369279258\"]/div/div/div[23]/a")).click();
        webDriver.findElement(By.xpath("//*[@id=\"form369001545\"]/div[2]/div[8]/button")).click();
        final var warning = webDriver.findElement(By.xpath("//*[@id=\"form369001545\"]/div[2]/div[7]/div/div/p[2]")).getText();
        assertEquals("Пожалуйста, заполните все обязательные поля", warning);
    }

    @AfterClass
    public static void quit() {
        webDriver.quit();
    }
}
