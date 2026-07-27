package com.gowresh.aiagent.workflow;

import com.gowresh.aiagent.commands.Command;
import com.gowresh.aiagent.commands.RegisterUserCommand;

import java.util.ArrayList;
import java.util.List;

public class ExecutionPlan {
    private final List<Command> commands = new ArrayList<>();

    public void add(Command command) {
        commands.add(command);
    }

    public List<Command> getCommands() {
        return commands;
    }

    public boolean isEmpty() {
        return commands.isEmpty();
    }

}
