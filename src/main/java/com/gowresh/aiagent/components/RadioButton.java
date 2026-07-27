package com.gowresh.aiagent.components;

import com.gowresh.aiagent.browser.BrowserManager;
import com.gowresh.aiagent.exceptions.FrameworkException;

public class RadioButton {
    private final BrowserManager browser;

    public RadioButton(BrowserManager browser) {
        this.browser = browser;
    }

    public void select(String locator) {
        try {

            browser.check(locator);

        } catch (Exception e) {

            throw new FrameworkException(
                    "Failed to select radio button: " + locator,
                    e);

        }
    }
}
