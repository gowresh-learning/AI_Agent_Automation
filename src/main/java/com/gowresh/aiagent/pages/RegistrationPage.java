package com.gowresh.aiagent.pages;

import com.gowresh.aiagent.browser.BrowserManager;

public class RegistrationPage {
    private final BrowserManager browser;

    public RegistrationPage(BrowserManager browser) {
        this.browser = browser;
    }

    public void enterName(String name) {
        browser.fill("#name", name);
    }

    public void enterEmail(String email) {
        browser.fill("#email", email);
    }

    public void enterPhone(String phone) {
        browser.fill("#phone", phone);
    }

    public void enterAddress(String address) {
        browser.fill("#textarea", address);
    }

    public void selectMale() {
        browser.check("#male");
    }

    public void selectFemale() {
        browser.check("#female");
    }

    public void selectCountry(String country) {
        browser.selectOption("#country", country);
    }
}
