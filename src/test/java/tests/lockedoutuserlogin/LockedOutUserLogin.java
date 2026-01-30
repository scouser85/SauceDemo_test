package tests.lockedoutuserlogin;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.SAUCEDEMO_LOGIN_PAGE;
import static constants.Constant.Credentials.Login;
import static constants.Constant.Credentials.Password;


public class LockedOutUserLogin extends BaseTest {

    @Test
    public void lockedOutUserLoginTest() {
        // Открываем страницу логина
        basePage.open(SAUCEDEMO_LOGIN_PAGE);

        // Присваиваваем значения логина и некорректного пароля
        Login = "locked_out_user";
        Password = "secret_sauce";

        // Выполняем логин для заблокированного пользователя и проверяем появление сообщения об ошибке
        saucedemoLoginPage.failedAuthorizationLogin();

        // Также проверяем, что не произошёл переход на страницу корзины
        String currentUrl = driver.getCurrentUrl();
        Assert.assertFalse(currentUrl.contains("inventory"), "Произошел логин с неверным паролем!");

        driver.close();



    }
}