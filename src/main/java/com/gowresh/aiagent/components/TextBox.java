package com.gowresh.aiagent.components;

import com.gowresh.aiagent.browser.BrowserManager;

public class TextBox {
    private final BrowserManager browser;

    public TextBox(BrowserManager browser) {
        this.browser = browser;
    }

    public void enterText(String locator, String value) {
        browser.fill(locator, value);
    }
}
