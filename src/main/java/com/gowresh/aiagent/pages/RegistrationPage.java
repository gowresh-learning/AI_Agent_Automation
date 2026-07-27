package com.gowresh.aiagent.pages;

import com.gowresh.aiagent.browser.BrowserManager;
import com.gowresh.aiagent.locators.RegistrationPageLocators;
import com.gowresh.aiagent.models.RegistrationData;
import com.gowresh.aiagent.components.*;

public class RegistrationPage extends BasePage{

    public RegistrationPage(BrowserManager browser) {
        super(browser);
    }

    public void enterName(String name) {
        textBox.enterText(RegistrationPageLocators.NAME, name);
    }

    public void enterEmail(String email) {
        textBox.enterText(RegistrationPageLocators.EMAIL, email);
    }

    public void enterPhone(String phone) {
        textBox.enterText(RegistrationPageLocators.PHONE, phone);
    }

    public void enterAddress(String address) {
        textBox.enterText(RegistrationPageLocators.ADDRESS, address);
    }

    public void selectMale() {
        radioButton.select(RegistrationPageLocators.MALE);
    }

    public void selectFemale() {
        radioButton.select(RegistrationPageLocators.FEMALE);
    }

    public void selectCountry(String country) {
        dropdown.selectByVisibleText(
                RegistrationPageLocators.COUNTRY,
                country
        );
    }

    public void fillForm(RegistrationData data) {

        enterName(data.getName());
        enterEmail(data.getEmail());
        enterPhone(data.getPhone());
        enterAddress(data.getAddress());

        if ("Male".equalsIgnoreCase(data.getGender())) {
            selectMale();
        } else {
            selectFemale();
        }

        selectCountry(data.getCountry());
    }
}
