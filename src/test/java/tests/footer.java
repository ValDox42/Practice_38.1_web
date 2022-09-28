package tests;

import lib.Core;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class footer extends Core {

    @Before
    public void before() {
        webDriver.get("https://skillfactory.ru");
    }

    @Test
    public void main() {
        webDriver.findElement(By.xpath("//a[contains(text(), 'Все курсы')]")).click();
        webDriver.get("https://skillfactory.ru");
        webDriver.findElement(By.xpath("//*[@id=\"rec298827602\"]/div/div/div[56]/div/a")).click();
        webDriver.get("https://skillfactory.ru");
        webDriver.findElement(By.xpath("//a[contains(text(), 'Контакты')]")).click();
    }

    @Test
    public void free() {
        webDriver.findElement(By.xpath("//a[contains(text(), 'Бесплатно')]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"rec298827602\"]/div/div/div[23]/div/a")).click();
        webDriver.get("https://skillfactory.ru");
        webDriver.findElement(By.xpath("//a[contains(text(), 'Бесплатно')]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"rec298827602\"]/div/div/div[56]/div/a")).click();
        webDriver.get("https://skillfactory.ru");
        webDriver.findElement(By.xpath("//a[contains(text(), 'Бесплатно')]")).click();
        webDriver.findElement(By.xpath("//a[contains(text(), 'Контакты')]")).click();
    }

    @Test
    public void corporate() {
        webDriver.findElement(By.xpath("//a[contains(text(), 'Корпоративное обучение')]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"rec435367561\"]/div/div/div[20]/div/a")).click();
        webDriver.get("https://skillfactory.ru");
        webDriver.findElement(By.xpath("//a[contains(text(), 'Корпоративное обучение')]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"rec435367561\"]/div/div/div[41]/div/a")).click();
        webDriver.get("https://skillfactory.ru");
        webDriver.findElement(By.xpath("//a[contains(text(), 'Корпоративное обучение')]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"rec435367561\"]/div/div/div[10]/div/a")).click();
    }

    @Test
    public void partnership() {
        webDriver.findElement(By.xpath("//a[contains(text(), 'Сотрудничество')]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"rec435367561\"]/div/div/div[20]/div/a")).click();
        webDriver.get("https://skillfactory.ru");
        webDriver.findElement(By.xpath("//a[contains(text(), 'Сотрудничество')]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"rec435367561\"]/div/div/div[41]/div/a")).click();
        webDriver.get("https://skillfactory.ru");
        webDriver.findElement(By.xpath("//a[contains(text(), 'Сотрудничество')]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"rec435367561\"]/div/div/div[10]/div/a")).click();
    }

    @Test
    public void xRay() {
        webDriver.findElement(By.xpath("//*[@id=\"rec456746090\"]/div/div/div[10]/a")).click();
        webDriver.findElement(By.xpath("//*[@id=\"rec298827602\"]/div/div/div[23]/div/a")).click();
        webDriver.get("https://skillfactory.ru");
        webDriver.findElement(By.xpath("//*[@id=\"rec456746090\"]/div/div/div[10]/a")).click();
        webDriver.findElement(By.xpath("//*[@id=\"rec298827602\"]/div/div/div[56]/div/a")).click();
        webDriver.get("https://skillfactory.ru");
        webDriver.findElement(By.xpath("//*[@id=\"rec456746090\"]/div/div/div[10]/a")).click();
        webDriver.findElement(By.xpath("//*[@id=\"rec298827602\"]/div/div/div[8]/div/a")).click();
    }

    @AfterClass
    public static void quit() {
        webDriver.quit();
    }
}
