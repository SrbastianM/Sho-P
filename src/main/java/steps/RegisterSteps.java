package steps;

import io.cucumber.java.DataTableType;
import model.RegisterModel;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.RegisterPage;

import java.time.Duration;
import java.util.Map;
import java.util.logging.Logger;

public class RegisterSteps {
    RegisterPage registerPage = new RegisterPage();
    WebDriverWait wait = new WebDriverWait(registerPage.getDriver(), Duration.ofSeconds(10));
    Logger logger = Logger.getLogger(getClass().getName());
    String notFound = "Element is not found or is not visible";


    @Step
    public void selectUserIcon() {
        WebElement userIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(registerPage.getUSER_ICON()));
        assert  userIcon.isDisplayed() : notFound ;
        userIcon.click();
    }

    @Step
    public void selectRegisterAnchor() {
        WebElement registerAnchor = wait.until(ExpectedConditions.visibilityOfElementLocated(registerPage.getREGISTER_ANCHOR()));
        assert registerAnchor.isDisplayed() : notFound;
        registerAnchor.click();
    }

    @Step
    public void canSeeCreateAccountPage() {
        WebElement titleCreateAccount = wait.until(ExpectedConditions.visibilityOfElementLocated(registerPage.getCREATE_ACCOUNT_TITLE()));
        assert titleCreateAccount.isDisplayed() : notFound;
    }

    @Step
    public void selectCustomerFromDropDown(String customer) {
        WebElement selectRoleDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(registerPage.getSELECT_ROLE()));
        Select select = new Select(selectRoleDropDown);
        select.selectByValue(customer);
    }

    @Step
    public void registerCredentials(String name, String lastName, String email, String password ) {
        WebElement registerName = wait.until(ExpectedConditions.visibilityOfElementLocated(registerPage.getINPUT_FIRST_NAME()));
        WebElement registerLastName = wait.until(ExpectedConditions.visibilityOfElementLocated(registerPage.getINPUT_LAST_NAME()));
        WebElement registerEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(registerPage.getINPUT_EMAIL()));
        WebElement registerPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(registerPage.getINPUT_PASSWORD()));

        registerName.sendKeys(name);
        registerLastName.sendKeys(lastName);
        registerEmail.sendKeys(email);
        registerPassword.sendKeys(password);
    }

    @Step
    public void selectRegisterButton() {
       WebElement registerButton = wait.until(ExpectedConditions.visibilityOfElementLocated(registerPage.getREGISTER_BUTTON()));
       registerButton.click();
    }

    @Step
    public void canSeeCreateAccountMessage() {
        WebElement registerAccountMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(registerPage.getREGISTER_MESSAGE()));
        assert registerAccountMessage.isDisplayed() : notFound;
    }

    @Step
    public void apiResponse() {

    }
}
