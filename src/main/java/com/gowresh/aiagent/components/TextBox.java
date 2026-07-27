package com.gowresh.aiagent.components;

import com.gowresh.aiagent.browser.BrowserManager;
import com.gowresh.aiagent.exceptions.FrameworkException;

public class TextBox {
    private final BrowserManager browser;

    public TextBox(BrowserManager browser) {
        this.browser = browser;
    }

    public void enterText(String locator, String value) {
        try {

            browser.fill(locator, value);

        } catch (Exception e) {

            throw new FrameworkException(
                    "Failed to enter text '" + value +
                            "' into locator: " + locator,
                    e);

        }
    }
}
