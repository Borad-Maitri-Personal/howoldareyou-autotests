package com.howoldareyou.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.howoldareyou.core.page.AbstractPage;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AbstractPage {

    @FindBy(css = "#submitButton")
    private SelenideElement submitButton;

    @FindBy(css = "#inputName")
    private SelenideElement usernameInput;

    @FindBy(css = "#inputBirthday")
    private SelenideElement birthdayInput;

    @FindBy(css = "#resultAge")
    private SelenideElement resultAge;
    @FindBy(css = "#help_name")
    private SelenideElement errorMessage;

    @FindBy(css = "#help_birthday")
    private SelenideElement dateMessage;

    @FindBy(css = ".logo.cursive")
    private SelenideElement heading;

    @FindBy(css = "#resultName")
    private SelenideElement resultName;

    public void typeUsername(String username) {
        usernameInput.setValue(username);
    }

    public void typeBirthday(String birthday) {
        birthdayInput.setValue(birthday);
    }

    public void clickSubmitButton() {
        submitButton.isEnabled();
        submitButton.click();
    }

    public int getResultAgeText() {
        return Integer.parseInt(resultAge.should(Condition.visible).getText());
    }

    public String getResultName(){
        return resultName.should(Condition.visible).getText();
    }

    public String getErrorMessage(){
        return errorMessage.should(Condition.visible).getText();
    }
    public String getDateErrorMessage(){
        return dateMessage.should(Condition.visible).getText();
    }
    public String getHeading(){
        return heading.should(Condition.visible).getText();
    }
}
