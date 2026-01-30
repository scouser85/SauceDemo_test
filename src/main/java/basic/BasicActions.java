package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BasicActions {
    public static WebDriver createDriver() {
        // Указываем путь к ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");

        // запуск Chrome в режиме инкогнито
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");

        // Создание драйвера
        WebDriver driver = new ChromeDriver(chromeOptions);

        // Разворачиваем окно в полный экран и устанавливаем неявное время ожидания
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        return driver;
    }
}