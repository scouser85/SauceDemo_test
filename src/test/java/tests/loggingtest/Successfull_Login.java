package tests.loggingtest;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.SAUCEDEMO_LOGIN_PAGE;
import static constants.Constant.Credentials.Login;
import static constants.Constant.Credentials.Password;



public class Successfull_Login extends BaseTest {

    @Test
    public void loginTest() {
        // Открываем страницу логина
        basePage.open(SAUCEDEMO_LOGIN_PAGE);

        // Присваиваваем значения логина и пароля
        Login = "standard_user";
        Password = "secret_sauce";

        // Выполняем логин
        saucedemoLoginPage.loggingIn();

        // Проверяем, открылся ли после логина  нужный URL
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("inventory"), "Переход после логина не выполнен.");

    }
}