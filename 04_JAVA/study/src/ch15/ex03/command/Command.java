package ch15.ex03.command;

import ch15.ex03.Message;

public interface Command {
    void execute(Message message);
}
