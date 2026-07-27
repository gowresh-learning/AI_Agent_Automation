package com.gowresh.aiagent.tests;

import com.gowresh.aiagent.assertions.PageAssertions;
import com.gowresh.aiagent.browser.BrowserManager;
import com.gowresh.aiagent.config.Config;
import com.gowresh.aiagent.engine.ExecutionEngine;
import com.gowresh.aiagent.models.Gender;
import com.gowresh.aiagent.models.RegistrationData;

public class AutomationRunner {
    public void run() {


        BrowserManager browser = new BrowserManager();

        browser.launch();
        browser.navigate(Config.BASE_URL);

        ExecutionEngine engine = new ExecutionEngine(browser);

        RegistrationData data = new RegistrationData();
        PageAssertions assertions = new PageAssertions(browser);

        assertions.verifyTitle(
                "Automation Testing Practice");
        data.setName("John Doe");
        data.setEmail("john@test.com");
        data.setPhone("9876543210");
        data.setAddress("New York");
        data.setGender(Gender.MALE.name());
        data.setCountry("India");
        engine.registerUser(data);

        browser.waitFor(3000);
        browser.close();


    }
}
