package com.gowresh.aiagent;

import com.gowresh.aiagent.browser.BrowserManager;
import com.gowresh.aiagent.config.Config;

public class Main {
    public static void main(String[] args) {

        BrowserManager browser = new BrowserManager();

        browser.launch();

        browser.navigate(Config.BASE_URL);

        System.out.println(browser.getTitle());

        browser.takeScreenshot();

        browser.close();
    }
}