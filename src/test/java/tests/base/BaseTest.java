package tests.base;

import basic.BasicActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.base.BasePage;
import pages.cart.CartPage;
import pages.saucedemo.SaucedemoLoginPage;
import pages.showcase.SaucedemoShowcasePage;

import static basic.Config.CLEAR_COOKIES_AND_STORAGE;
import static basic.Config.HOLD_BROWSER_OPEN;

// Базовый класс тестов — от него наследуются логин-тест, тест корзины и др.
public class BaseTest {

    protected WebDriver driver = BasicActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected SaucedemoLoginPage saucedemoLoginPage = new SaucedemoLoginPage(driver);
    protected SaucedemoShowcasePage saucedemoShowcasePage = new SaucedemoShowcasePage(driver);
    protected CartPage cartPage = new CartPage(driver);

    // После каждого теста — очистка cookies и sessionStorage
    @AfterTest
    public void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKIES_AND_STORAGE) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            js.executeScript("window.sessionStorage.clear()");
        }
    }


   // После всех тестов — закрытие браузера
   @AfterSuite
   public void clear() {
       if (!HOLD_BROWSER_OPEN) {
         driver.quit();
       }
    }
}