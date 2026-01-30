package basic;

public class Config {
    // Указываем операционную систему и браузер, которые будут использоваться в тестах
    // OS = Windows, Browser = Chrome

    public static final String OS_AND_BROWSER = "win-chrome";

    // перед каждым тестом будут очищаться cookies и локальное хранилище браузера
    public static final Boolean CLEAR_COOKIES_AND_STORAGE = true;

    // Если false — браузер будет закрываться после завершения теста
    // Если true — браузер останется открытым
    public static final Boolean HOLD_BROWSER_OPEN = false;
}