package com.gowresh.aiagent.components;

import com.gowresh.aiagent.browser.BrowserManager;

public class RadioButton {
    private final BrowserManager browser;

    public RadioButton(BrowserManager browser) {
        this.browser = browser;
    }

    public void select(String locator) {
        browser.click(locator);
    }
}
