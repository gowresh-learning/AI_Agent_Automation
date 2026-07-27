package com.gowresh.aiagent.engine;

import com.gowresh.aiagent.browser.BrowserManager;
import com.gowresh.aiagent.commands.Command;
import com.gowresh.aiagent.commands.RegisterUserCommand;
import com.gowresh.aiagent.exceptions.FrameworkException;
import com.gowresh.aiagent.models.RegistrationData;
import com.gowresh.aiagent.pages.RegistrationPage;
import com.gowresh.aiagent.workflow.ExecutionPlan;
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

        ExecutionPlan plan = new ExecutionPlan();
        switch (action) {

            case "RegisterUser":
                RegistrationPage page = new RegistrationPage(browser);
                plan.add(new RegisterUserCommand(page, data));
                break;

            default:
                throw new FrameworkException("Unknown action: " + action);
        }
        execute(plan);
    }

    public void execute(ExecutionPlan plan)
    {
        if (plan.isEmpty()) {
            throw new FrameworkException("Execution plan is empty.");
        }

        for (Command command : plan.getCommands()) {
            command.execute();
        }
    }
}
