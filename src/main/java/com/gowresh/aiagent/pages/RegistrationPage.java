package com.gowresh.aiagent.pages;

import com.gowresh.aiagent.browser.BrowserManager;
import com.gowresh.aiagent.locators.RegistrationPageLocators;

public class RegistrationPage {
    private final BrowserManager browser;

    public RegistrationPage(BrowserManager browser) {
        this.browser = browser;
    }

    public void enterName(String name) {
        browser.fill(RegistrationPageLocators.NAME, name);
    }

    public void enterEmail(String email) {
        browser.fill(RegistrationPageLocators.EMAIL, email);
    }

    public void enterPhone(String phone) {
        browser.fill(RegistrationPageLocators.PHONE, phone);
    }

    public void enterAddress(String address) {
        browser.fill(RegistrationPageLocators.ADDRESS, address);
    }

    public void selectMale() {
        browser.check(RegistrationPageLocators.MALE);
    }

    public void selectFemale() {
        browser.check(RegistrationPageLocators.FEMALE);
    }

    public void selectCountry(String country) {
        browser.selectOption(RegistrationPageLocators.COUNTRY, country);
    }
}
