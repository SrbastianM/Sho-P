package pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://sho-p-web.vercel.app/")
public class RegisterPage extends PageObject {
    // Select create account page
    By USER_ICON = By.xpath("//body/div[@id='app']/header/nav[@class='navbar']/ul[3]/li[1]");
    By REGISTER_ANCHOR = By.xpath("//a[contains(text(),'REGISTER HERE')]");

    // Put Credentials
    By CREATE_ACCOUNT_TITLE = By.xpath("//h2[@class='layout__title']");
    By SELECT_ROLE = By.xpath("//select[@class='register__select']");
    By INPUT_FIRST_NAME = By.xpath("//body/div[@id='app']/main[@class='layout__main']/article[@class='box']/form[@id='registerForm']/section[1]/input[1]");
    By INPUT_LAST_NAME = By.xpath("//body/div[@id='app']/main[@class='layout__main']/article[@class='box']/form[@id='registerForm']/section[1]/input[2]");
    By INPUT_EMAIL = By.xpath("//body/div[@id='app']/main[@class='layout__main']/article[@class='box']/form[@id='registerForm']/section[1]/input[3]");
    By INPUT_PASSWORD = By.xpath("//input[@type='password']");
    By REGISTER_BUTTON = By.xpath("//button[@type='submit'][contains(.,'REGISTER')]");
    By REGISTER_MESSAGE = By.xpath("//span[contains(@class,'message')]");

    public By getREGISTER_MESSAGE() {
        return REGISTER_MESSAGE;
    }

    public void setREGISTER_MESSAGE(By REGISTER_MESSAGE) {
        this.REGISTER_MESSAGE = REGISTER_MESSAGE;
    }

    public By getREGISTER_BUTTON() {
        return REGISTER_BUTTON;
    }

    public void setREGISTER_BUTTON(By REGISTER_BUTTON) {
        this.REGISTER_BUTTON = REGISTER_BUTTON;
    }

    public By getUSER_ICON() {
        return USER_ICON;
    }

    public void setUSER_ICON(By USER_ICON) {
        this.USER_ICON = USER_ICON;
    }

    public By getREGISTER_ANCHOR() {
        return REGISTER_ANCHOR;
    }

    public void setREGISTER_ANCHOR(By REGISTER_ANCHOR) {
        this.REGISTER_ANCHOR = REGISTER_ANCHOR;
    }

    public By getCREATE_ACCOUNT_TITLE() {
        return CREATE_ACCOUNT_TITLE;
    }

    public void setCREATE_ACCOUNT_TITLE(By CREATE_ACCOUNT_TITLE) {
        this.CREATE_ACCOUNT_TITLE = CREATE_ACCOUNT_TITLE;
    }

    public By getSELECT_ROLE() {
        return SELECT_ROLE;
    }

    public void setSELECT_ROLE(By SELECT_ROLE) {
        this.SELECT_ROLE = SELECT_ROLE;
    }

    public By getINPUT_FIRST_NAME() {
        return INPUT_FIRST_NAME;
    }

    public void setINPUT_FIRST_NAME(By INPUT_FIRST_NAME) {
        this.INPUT_FIRST_NAME = INPUT_FIRST_NAME;
    }

    public By getINPUT_LAST_NAME() {
        return INPUT_LAST_NAME;
    }

    public void setINPUT_LAST_NAME(By INPUT_LAST_NAME) {
        this.INPUT_LAST_NAME = INPUT_LAST_NAME;
    }

    public By getINPUT_EMAIL() {
        return INPUT_EMAIL;
    }

    public void setINPUT_EMAIL(By INPUT_EMAIL) {
        this.INPUT_EMAIL = INPUT_EMAIL;
    }

    public By getINPUT_PASSWORD() {
        return INPUT_PASSWORD;
    }

    public void setINPUT_PASSWORD(By INPUT_PASSWORD) {
        this.INPUT_PASSWORD = INPUT_PASSWORD;
    }
}