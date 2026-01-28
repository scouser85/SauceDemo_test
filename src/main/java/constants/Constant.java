package constants;

import java.time.Duration;


public class Constant {
    // Переменные, связанные с таймингами ожидания
    public static class TimeoutVariable {
        // Время неявного ожидания (в секундах) — Selenium будет ждать элементы на странице
        public static final int IMPLICIT_WAIT = 7;

        // Время явного ожидания — можно использовать в WebDriverWait
        public static final Duration EXPLICIT_WAIT = Duration.ofSeconds(10);
    }

    // URL-адрес страницы, с которой работают тесты
    public static class Urls {
        // Страница логина сайта, который мы тестируем
        public static final String SAUCEDEMO_LOGIN_PAGE = "https://www.saucedemo.com/";
    }

    // Переменные логин и пароль, для того чтобы в тестах был динамический ввод, а не статический (hardcoded)
    public static class Credentials {

        public static String Login = "";
        public static String Password = "";
    }


}