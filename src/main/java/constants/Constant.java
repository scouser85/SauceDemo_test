// Конфигурационный файл, с настройками времени ожидания, URL страницы логина, переменными для ввода логина и пароля
// для того чтобы переиспользовать их в любом кол-ве тестов, а не создавать каждый раз
package constants;

import java.time.Duration;


public class Constant {
    // Переменные, связанные с временем ожидания
    public static class TimeoutVariable {
        // Время неявного ожидания (в секундах) — сколько секунд Selenium будет ждать элементы на странице
        public static final int IMPLICIT_WAIT = 7;

        // Время явного ожидания — можно использовать в WebDriverWait
        public static final Duration EXPLICIT_WAIT = Duration.ofSeconds(10);
    }

    // URL-адрес страницы, с которой происходит логин
    public static class Urls {

        public static final String SAUCEDEMO_LOGIN_PAGE = "https://www.saucedemo.com/";
    }


    public static class Credentials {
        // Переменные логин и пароль, для того чтобы в тестах был динамический ввод, а не статический (hardcoded)
        public static String Login = "";
        public static String Password = "";
    }


}