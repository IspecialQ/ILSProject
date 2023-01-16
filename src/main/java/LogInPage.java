import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage{

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name ="auth_email")
    private WebElement emailField;

    @FindBy(name = "auth_pass")
    private WebElement passwordField;

    @FindBy(xpath = "//button[text()='Войти']")
    private WebElement submitButton;

    public LogInPage logIntoSystem(String login, String password) {
        emailField.sendKeys(login);
        passwordField.sendKeys(password);
        submitButton.click();
        Assertions.assertNotEquals("http://u920152e.beget.tech/#", driver.getCurrentUrl());
        return new LogInPage(driver);
    }
}
