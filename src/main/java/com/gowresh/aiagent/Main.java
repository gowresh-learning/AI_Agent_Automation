package com.gowresh.aiagent;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Main {
    public static void main(String[] args) {

        try (Playwright playwright = Playwright.create()) {

            Browser browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions().setHeadless(false));

            Page page = browser.newPage();

            page.navigate("https://testautomationpractice.blogspot.com/");

            System.out.println(page.title());

            page.screenshot(new Page.ScreenshotOptions().setPath(java.nio.file.Paths.get("homepage.png")));

            browser.close();
        }
    }
}