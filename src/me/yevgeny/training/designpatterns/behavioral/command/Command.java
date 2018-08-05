package me.yevgeny.training.designpatterns.behavioral.command;

/**
 * This is the command that the client will request.
 * <p>
 * A concrete implantation of this command will perform an actual action. The client doesn't request an action
 * directly.
 * <p>
 * This allows a command to handle state, has an "undo()" functionality to a request, etc.
 *
 * @author Yevgeny Kuznetsov
 */
public interface Command {
    void execute();
}
