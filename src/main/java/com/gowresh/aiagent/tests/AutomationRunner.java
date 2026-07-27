package com.gowresh.aiagent.tests;

import com.gowresh.aiagent.browser.BrowserManager;
import com.gowresh.aiagent.config.Config;
import com.gowresh.aiagent.pages.RegistrationPage;

public class AutomationRunner {
    public void run() {

        BrowserManager browser = new BrowserManager();

        browser.launch();

        browser.navigate(Config.BASE_URL);

        RegistrationPage registration = new RegistrationPage(browser);

        registration.enterName("John Doe");
        registration.enterEmail("john@test.com");
        registration.enterPhone("9876543210");
        registration.enterAddress("New York");

        browser.waitFor(3000);

        browser.close();

    }
}
