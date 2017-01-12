package command;

import Controller.Controller;

/**
 * la commande Decremente mesure
 */
public class Dec implements Command {

    private Controller controller;

    public Dec(Controller controller) {
        this.controller=controller;
    }

    @Override
    public void execute() {
        System.out.print("-----command dec-----");
        controller.dec();
    }
}
