package com.gowresh.aiagent.tests;

import com.gowresh.aiagent.assertions.PageAssertions;
import com.gowresh.aiagent.browser.BrowserManager;
import com.gowresh.aiagent.config.Config;
import com.gowresh.aiagent.engine.ExecutionEngine;
import com.gowresh.aiagent.models.Gender;
import com.gowresh.aiagent.models.RegistrationData;
import com.gowresh.aiagent.utils.JsonReader;

public class AutomationRunner {
    public void run() {


        BrowserManager browser = new BrowserManager();

        browser.launch();
        browser.navigate(Config.BASE_URL);

        ExecutionEngine engine = new ExecutionEngine(browser);
        PageAssertions assertions = new PageAssertions(browser);
        assertions.verifyTitle(
                "Automation Testing Practice");
        RegistrationData data =
                JsonReader.read(
                        "registration.json",
                        RegistrationData.class
                );
        //engine.registerUser(data);
        engine.execute("RegisterUser", data);
        browser.waitFor(3000);
        browser.close();

    }
}
