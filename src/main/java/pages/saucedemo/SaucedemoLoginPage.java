package pages.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import static constants.Constant.Credentials.Login;
import static constants.Constant.Credentials.Password;



// Страница логина. Здесь мы описываем действия: ввести логин, пароль и нажать кнопку Login
public class SaucedemoLoginPage extends BasePage {



    // Конструктор передаёт драйвер в базовый класс
    public SaucedemoLoginPage(WebDriver driver) {
        super(driver);
    }

    // Локаторы — «указатели», позволяющие найти нужные элементы на странице

    private final By loginInput = By.xpath("//input[@placeholder='Username']");
    private final By passwordInput = By.xpath("//input[@placeholder='Password']");
    private final By loginButton = By.xpath("//input[@type='submit']");
    private final By loginErrorMessage = By.xpath("//div[@class='error-message-container error']");


    // Метод для авторизации: ввод логина и пароля + клик по кнопке
    public SaucedemoLoginPage loggingIn() {
        driver.findElement(loginInput).sendKeys(Login);
        driver.findElement(passwordInput).sendKeys(Password);
        driver.findElement(loginButton).click();
        return this;
    }

    // Метод для не успешной авторизации: ввод логина и пароля + клик по кнопке + проверка появления сообщения об ошибке логина
    public SaucedemoLoginPage failedAuthorizationLogin() {
        driver.findElement(loginInput).sendKeys(Login);
        driver.findElement(passwordInput).sendKeys(Password);
        driver.findElement(loginButton).click();
        driver.findElement(loginErrorMessage).isDisplayed();
        return this;
    }
}