package com.gowresh.aiagent.pages;

import com.gowresh.aiagent.browser.BrowserManager;
import com.gowresh.aiagent.locators.RegistrationPageLocators;
import com.gowresh.aiagent.models.RegistrationData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RegistrationPage extends BasePage{

    private static final Logger log =
            LoggerFactory.getLogger(RegistrationPage.class);

    public RegistrationPage(BrowserManager browser) {
        super(browser);
    }

    public void enterName(String name) {
        log.info("Entering name: {}", name);
        textBox.enterText(RegistrationPageLocators.NAME, name);
    }

    public void enterEmail(String email) {
        log.info("Entering email: {}", email);
        textBox.enterText(RegistrationPageLocators.EMAIL, email);
    }

    public void enterPhone(String phone) {
        log.info("Entering phone: {}", phone);
        textBox.enterText(RegistrationPageLocators.PHONE, phone);
    }

    public void enterAddress(String address) {
        log.info("Entering address: {}", address);
        textBox.enterText(RegistrationPageLocators.ADDRESS, address);
    }

    public void selectMale() {
        radioButton.select(RegistrationPageLocators.MALE);
    }

    public void selectFemale() {
        radioButton.select(RegistrationPageLocators.FEMALE);
    }

    public void selectCountry(String country) {
        log.info("Selecting country: {}", country);
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
