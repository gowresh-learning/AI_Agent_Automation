package com.gowresh.aiagent.components;

import com.gowresh.aiagent.browser.BrowserManager;

public class Dropdown {
    private final BrowserManager browser;

    public Dropdown(BrowserManager browser) {
        this.browser = browser;
    }

    public void selectByVisibleText(String locator, String value) {
        browser.selectOption(locator, value);
    }
}
