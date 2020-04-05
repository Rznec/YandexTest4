import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

public class WebDriverSettings {
    public static ChromeDriver driver;

    @BeforeAll
    static void setUp() {
        System.setProperty("webdriver.chrome.driver", "F:\\Tinkoff/chromedriver.exe");
        driver = new ChromeDriver();
        //System.out.println("Test start");
    }

    @AfterAll
    static void close() {
        System.out.println("Test close");
        driver.quit();
    }
}
