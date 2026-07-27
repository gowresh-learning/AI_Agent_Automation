package com.gowresh.aiagent.assertions;

import com.gowresh.aiagent.browser.BrowserManager;

public class PageAssertions {
    private final BrowserManager browser;

    public PageAssertions(BrowserManager browser) {
        this.browser = browser;
    }

    public void verifyTitle(String expectedTitle) {

        String actualTitle = browser.getTitle();

        if (!actualTitle.equals(expectedTitle)) {
            throw new AssertionError(
                    "Expected: " + expectedTitle +
                            " but found: " + actualTitle);
        }
    }
}
