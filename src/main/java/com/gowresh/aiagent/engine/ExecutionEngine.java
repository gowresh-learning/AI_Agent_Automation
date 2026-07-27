package com.gowresh.aiagent.engine;

import com.gowresh.aiagent.browser.BrowserManager;
import com.gowresh.aiagent.commands.Command;
import com.gowresh.aiagent.commands.RegisterUserCommand;
import com.gowresh.aiagent.models.RegistrationData;
import com.gowresh.aiagent.pages.RegistrationPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExecutionEngine {

    private final BrowserManager browser;
    private static final Logger log =
            LoggerFactory.getLogger(ExecutionEngine.class);

    public ExecutionEngine(BrowserManager browser) {
        this.browser = browser;
    }

    public void registerUser(RegistrationData data) {

        RegistrationPage page =
                new RegistrationPage(browser);
        log.info("Starting registration for user '{}'", data.getName());
        page.fillForm(data);
        log.info("Registration completed for user '{}'", data.getName());

    }

    public void execute(String action, RegistrationData data) {

        switch (action) {

            case "RegisterUser":
                RegistrationPage page =
                        new RegistrationPage(browser);
                Command command =
                        new RegisterUserCommand(page, data);
                command.execute();
                break;

            default:
                throw new IllegalArgumentException(
                        "Unknown action: " + action);
        }
    }
}
