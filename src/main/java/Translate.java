import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Translate extends WebDriverSettings{
    //Закомментил, т.к. открывает переводчик, но текст не вводится. Оставил изначальную версию
//    @FindBy (xpath = "//*[@id=\"fakeArea\"]")
//    WebElement inputField;
//    public void text (String text) {
//        inputField.click();
//        inputField.sendKeys(text);
//        inputField.sendKeys(Keys.ENTER);
//    }
    //Проверка работы перевода введенного текста
    @Test
    public void test() {
        final Wait<WebDriver> wait = new WebDriverWait(driver, 15, 1);
        
        driver.get("https://translate.yandex.ru/");
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        
        WebElement element = driver.findElement(By.xpath("//*[@id=\"fakeArea\"]"));
        wait.until(ExpectedConditions.elementToBeClickable((element)));
        element.click();
        element.sendKeys("Hello");
        element.sendKeys(Keys.ENTER);

    }
//    @Test
//    public void test() {
//        driver.get("https://translate.yandex.ru/");
//        Translate transl = new Translate();
//        transl.text("Hello");
//    }
}
