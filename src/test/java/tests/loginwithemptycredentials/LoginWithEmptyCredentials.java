package tests.loginwithemptycredentials;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.SAUCEDEMO_LOGIN_PAGE;
import static constants.Constant.Credentials.Login;
import static constants.Constant.Credentials.Password;


public class LoginWithEmptyCredentials extends BaseTest {

    @Test
    public void loginWithEmptyCredentialsTest() {
        // Открываем страницу логина
        basePage.open(SAUCEDEMO_LOGIN_PAGE);

        // Присваиваем пустые значения для логина и пароля
        Login = "";
        Password = "";

        // Выполняем логин
        saucedemoLoginPage.failedAuthorizationLogin();

        // Также проверяем, что не произошёл переход на страницу корзины
        String currentUrl = driver.getCurrentUrl();
        Assert.assertFalse(currentUrl.contains("inventory"), "Произошел логин с неверным паролем!");



    }
}