package com.gowresh.aiagent.pages;

import com.gowresh.aiagent.browser.BrowserManager;
import com.gowresh.aiagent.components.*;

public abstract class BasePage {

    protected final BrowserManager browser;
    protected final TextBox textBox;
    protected final Dropdown dropdown;
    protected final RadioButton radioButton;

    protected BasePage(BrowserManager browser) {
        this.browser = browser;
        this.textBox = new TextBox(browser);
        this.dropdown = new Dropdown(browser);
        this.radioButton = new RadioButton(browser);
    }
}
