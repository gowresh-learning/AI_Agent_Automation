package com.gowresh.aiagent.components;

import com.gowresh.aiagent.browser.BrowserManager;
import com.gowresh.aiagent.exceptions.FrameworkException;

public class Dropdown {
    private final BrowserManager browser;

    public Dropdown(BrowserManager browser) {
        this.browser = browser;
    }

    public void selectByVisibleText(String locator, String value) {

        try {

            browser.selectOption(locator, value);

        } catch (Exception e) {

            throw new FrameworkException(
                    "Failed to select '" + value +
                            "' from locator: " + locator,
                    e);

        }
    }
}
