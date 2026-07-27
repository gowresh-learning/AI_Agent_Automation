package com.gowresh.aiagent.engine;

import com.gowresh.aiagent.browser.BrowserManager;
import com.gowresh.aiagent.models.RegistrationData;
import com.gowresh.aiagent.pages.RegistrationPage;

public class ExecutionEngine {

    private final BrowserManager browser;

    public ExecutionEngine(BrowserManager browser) {
        this.browser = browser;
    }

    public void registerUser(RegistrationData data) {

        RegistrationPage page =
                new RegistrationPage(browser);

        page.fillForm(data);

    }
}
