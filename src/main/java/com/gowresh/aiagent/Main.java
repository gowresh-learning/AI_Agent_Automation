package com.gowresh.aiagent;

import com.gowresh.aiagent.browser.BrowserManager;

public class Main {
    public static void main(String[] args) {

        BrowserManager browser = new BrowserManager();

        browser.launch();

        browser.navigate("https://testautomationpractice.blogspot.com/");

        System.out.println(browser.getTitle());

        browser.takeScreenshot();

        browser.close();
    }
}