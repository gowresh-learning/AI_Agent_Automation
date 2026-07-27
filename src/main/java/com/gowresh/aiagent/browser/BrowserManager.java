package com.gowresh.aiagent.browser;

import com.gowresh.aiagent.config.Config;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowserManager {
    private Playwright playwright;
    private Browser browser;
    private Page page;

    public void launch() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(Config.HEADLESS));
        page = browser.newPage();
    }

    public void navigate(String url) {
        page.navigate(url);
    }

    public String getTitle() {
        return page.title();
    }

    public void close() {
        browser.close();
        playwright.close();
    }

    public Page getPage() {
        return page;
    }

    public void takeScreenshot()
    {
        page.screenshot(new Page.ScreenshotOptions().setPath(java.nio.file.Paths.get(page.title())));
    }

    public void click(String locator) {
        page.locator(locator).click();
    }
    public void fill(String locator, String value) {
        page.locator(locator).fill(value);
    }

    public String getText(String locator) {
        return page.locator(locator).textContent();
    }

    public boolean isVisible(String locator) {
        return page.locator(locator).isVisible();
    }

    public void waitFor(int milliseconds) {
        page.waitForTimeout(milliseconds);
    }

    public void check(String locator) {
        page.locator(locator).check();
    }

    public void selectOption(String locator, String value) {
        page.locator(locator).selectOption(value);
    }


}
