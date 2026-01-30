package tests.wrongpasswordlogin;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.SAUCEDEMO_LOGIN_PAGE;
import static constants.Constant.Credentials.Login;
import static constants.Constant.Credentials.Password;


public class LoginWithWrongPassword extends BaseTest {

    @Test
    public void loginWithWrongPasswordTest() {
        // Открываем страницу логина
        basePage.open(SAUCEDEMO_LOGIN_PAGE);

        // Присваиваваем значения логина и некорректного пароля
        Login = "standard_user";
        Password = "wrong_password";

        // Выполняем логин
        saucedemoLoginPage.failedAuthorizationLogin();

        // Также проверяем, что не произошёл переход на страницу корзины
        String currentUrl = driver.getCurrentUrl();
        Assert.assertFalse(currentUrl.contains("inventory"), "Произошел логин с неверным паролем!");

        driver.close();



    }
}