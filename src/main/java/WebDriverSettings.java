import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

public class WebDriverSettings {
    public static ChromeDriver driver;
    public static final Logger logger= Logger.getLogger(WebDriverSettings.class.getName());

    @BeforeAll
    static void setUp() {
        System.setProperty("webdriver.chrome.driver", "F:\\Tinkoff/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("");
        logger.info("\nTest start");
    }

    @AfterAll
    static void close() {
        logger.info("\nTest start");
        driver.quit();
    }
}
