package com.gowresh.aiagent.commands;

import com.gowresh.aiagent.models.RegistrationData;
import com.gowresh.aiagent.pages.RegistrationPage;

public class RegisterUserCommand implements Command {

    private final RegistrationPage page;
    private final RegistrationData data;

    public RegisterUserCommand(
            RegistrationPage page,
            RegistrationData data) {

        this.page = page;
        this.data = data;
    }

    @Override
    public void execute() {
        page.fillForm(data);
    }
}