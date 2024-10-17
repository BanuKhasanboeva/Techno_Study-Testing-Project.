package US07;

import Utility.BaseDriverParameter;
import com.google.j2objc.annotations.Property;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class us07 extends BaseDriverParameter {


    @Test
    public void SDET(){
        // buttona kadar scroll yap
        js.executeScript("window.scrollBy(0, 2000);");

        // "Detaylı Bilgi" buttonuna tıklat
        WebElement detayliBilgiSdet= driver.findElement(By.xpath("(//a[text()='Detaylı bilgi'])[2]"));
        detayliBilgiSdet.click();

        // Sayfaya girince "Yazılım Test Uzmanı" yazısını görünceye kadar bekle ve doğrula
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1")));
        WebElement yazilimTestUzmani= driver.findElement(By.xpath("//h1"));
        Assert.assertTrue(yazilimTestUzmani.getText().contains("YAZILIM\n" +
                "TEST UZMANI"),"Yazılım Test Uzmanı sayfasına ulaşamadı");

        // Techno Study Logosu olduğunu doğrula
        WebElement logo= driver.findElement(By.xpath("//div[contains(@class,'_leftside')]//img"));
        Assert.assertTrue(logo.isDisplayed());


    }
    @Test
    public void android(){
        // SDET sayfasından geri çık
        driver.navigate().back();

        // "Detaylı Bilgi" buttonuna tıklat
        WebElement detayliBilgiAndroid= driver.findElement(By.xpath("(//a[text()='Detaylı bilgi'])[3]"));
        detayliBilgiAndroid.click();

        // "Detaylı Bilgi" buttonunun görünmesini bekle ve tıklat
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@data-elem-type='button'])[1]//a")));
        WebElement detayliBilgiAndroid1= driver.findElement(By.xpath("(//div[@data-elem-type='button'])[1]//a"));
        Actions actions= new Actions(driver);
        actions.click(detayliBilgiAndroid1).build().perform();

        // Sayfaya girince "Android Uygulama Geliştirme" yazısını görünceye kadar bekle ve doğrula
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[text()='Android Uygulama Geliştirme']")));
        WebElement android= driver.findElement(By.xpath("//strong[text()='Android Uygulama Geliştirme']"));
        Assert.assertTrue(android.getText().contains("Android Uygulama Geliştirme"),"Andorid uygulama geliştiricisi sayfasına ulaşamadı");

        // Techno Study Logosu olduğunu doğrula
        WebElement logo= driver.findElement(By.xpath("//div[contains(@class,'_leftside')]//img"));
        Assert.assertTrue(logo.isDisplayed());

    }
    @Test
    public void veriBilimi(){
        // 2 sayfa geriye git
        driver.navigate().back();
        driver.navigate().back();

        // "Detaylı Bilgi" buttonuna tıklat
        WebElement detayliBilgiAndroid= driver.findElement(By.xpath("(//a[text()='Detaylı bilgi'])[1]"));
        detayliBilgiAndroid.click();

        // "Detaylı Bilgi" buttonunun görünmesini bekle ve tıklat
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@data-elem-type='button'])[1]//a")));
        WebElement detayliBilgiAndroid1= driver.findElement(By.xpath("(//div[@data-elem-type='button'])[1]//a"));
        Actions actions= new Actions(driver);
        actions.click(detayliBilgiAndroid1).build().perform();

        // Sayfaya girince "Techno Study ile Veri Bilimci Olun" yazısını görünceye kadar bekle ve doğrula
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2)[1]")));
        WebElement veriBilimi= driver.findElement(By.xpath("(//h2)[1]"));
        Assert.assertTrue(veriBilimi.getText().contains("Techno Study ile Veri Bilimci Olun"),"Yazılım Test Uzmanı sayfasına ulaşamadı");

        // Techno Study Logosu olduğunu doğrula
        WebElement logo= driver.findElement(By.xpath("//div[contains(@class,'_leftside')]//img"));
        Assert.assertTrue(logo.isDisplayed());


    }
}
