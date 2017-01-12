package command;

import Controller.Controller;

/**
 * la commande Incremente mesure
 */
public class Inc implements Command {

    private Controller controller;

    public Inc(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void execute() {
        System.out.print("-----command inc-----");
        controller.inc();
    }
}
