package tests.base;

import basic.BasicActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.base.BasePage;
import pages.saucedemo.SaucedemoLoginPage;


import static basic.Config.CLEAR_COOKIES_AND_STORAGE;
import static basic.Config.HOLD_BROWSER_OPEN;

// Базовый класс тестов — от него наследуются все остальные тесты
public class BaseTest {

    protected WebDriver driver = BasicActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected SaucedemoLoginPage saucedemoLoginPage = new SaucedemoLoginPage(driver);

    // очистка cookies и sessionStorage после выполнения теста
    @AfterTest
    public void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKIES_AND_STORAGE) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            js.executeScript("window.sessionStorage.clear()");
        }
    }


   // закрытие браузера после выполнения всех тестов
   @AfterSuite
   public void clear() {
       if (!HOLD_BROWSER_OPEN) {
         driver.quit();
       }
    }
}