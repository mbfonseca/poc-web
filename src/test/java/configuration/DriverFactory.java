package configuration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
    private static WebDriver webDriver;

    public static WebDriver createDriverByParameter() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/maria.fonseca/Downloads/chromedriver.exe");
        String hostTotest = "http://algamoney-web.s3-website-sa-east-1.amazonaws.com/login";

                ChromeOptions chromeOptions = new ChromeOptions ();
                chromeOptions.addArguments(
                        "--headless");

                webDriver = new ChromeDriver(chromeOptions);
                webDriver.get(hostTotest);


        return webDriver;
    }

    public static WebDriver getDriver() {
        return webDriver;
    }

    public static void quitDriver() {
        webDriver.close();
    }


}
