package pages;

import configuration.DriverFactory;
import helper.ElementHelper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.core.StringContains.containsString;


public class LoginPage extends BasePage{

    @FindBy(name = "usuario")
    private WebElement user;

    @FindBy(name = "senha")
    private WebElement password;

    @FindBy(name = "login")
    private WebElement btnLogin;

    public LoginPage fillEmail(String email) {

        user.click();
        user.sendKeys(email);
        return this;

    }

    public LoginPage fillpassword(String pass) {

        password.click();
        password.sendKeys(pass);
        return this;

    }

    public LoginPage login() {
       ElementHelper.waitForElementToLoad(btnLogin, 15).click();
        return this;

    }

    public LoginPage loginSuccess() {
        ElementHelper.waitForPageToLoad(By.cssSelector("h1"), "Dashboard", 30);
        Assert.assertThat(DriverFactory.getDriver().findElement(By.cssSelector("h1")).getText(), containsString("Dashboard"));
        return this;

    }
}
