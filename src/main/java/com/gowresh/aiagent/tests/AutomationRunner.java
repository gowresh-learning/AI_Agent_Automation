package com.gowresh.aiagent.tests;

import com.gowresh.aiagent.browser.BrowserManager;
import com.gowresh.aiagent.config.Config;
import com.gowresh.aiagent.models.RegistrationData;
import com.gowresh.aiagent.pages.RegistrationPage;

public class AutomationRunner {
    public void run() {

        BrowserManager browser = new BrowserManager();

        browser.launch();

        browser.navigate(Config.BASE_URL);

        RegistrationPage registration = new RegistrationPage(browser);

        RegistrationData data = new RegistrationData();

        data.setName("John Doe");
        data.setEmail("john@test.com");
        data.setPhone("9876543210");
        data.setAddress("New York");
        data.setGender("Male");
        data.setCountry("India");

        registration.fillForm(data);

        browser.waitFor(3000);

        browser.close();

    }
}
