package configuration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    private static WebDriver webDriver;

    public static WebDriver createDriverByParameter() {
        System.setProperty("webdriver.chrome.driver", "/Users/ednaldo.santos/Documents/pocautomation/chromedriver");

        webDriver = new ChromeDriver();

        webDriver.get("http://localhost:4200/login");

        return webDriver;
    }

    public static WebDriver getDriver() {
        return webDriver;
    }

    public static void quitDriver() {
        webDriver.close();
    }


}
