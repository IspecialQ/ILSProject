import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidTest {
    WebDriver driver;
    private final static String BASE_URL = "http://u920152e.beget.tech/#";
    private final static String login = "Ivan@Pavlov";
    private final static String password = "pass";


    @BeforeEach
    void setupBrowser() {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
    }

    @Test
    void logInTest() {
        new LogInPage(driver).logIntoSystem(login, password);
    }

    @AfterEach
    void quitBrowser() {
        driver.quit();
    }

}
