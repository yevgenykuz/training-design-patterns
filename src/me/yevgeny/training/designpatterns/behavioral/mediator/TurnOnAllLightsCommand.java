package me.yevgeny.training.designpatterns.behavioral.mediator;

/**
 * This is a concrete command. It holds a mediator reference and uses it to perform actions on lights.
 * <p>
 * There is no reference to the lights themselves.
 *
 * @author Yevgeny Kuznetsov
 */
public class TurnOnAllLightsCommand implements Command {

    private final Mediator mediator;

    public TurnOnAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOnAllLights();
    }
}
