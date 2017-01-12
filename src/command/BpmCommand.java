package command;

import Controller.Controller;

/**
 * La commande representant Battement perdioque de la led 1
 */
public class BpmCommand implements Command {


    private Controller controller;

    public BpmCommand(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void execute() {
        controller.afficheLed(1);
        System.out.println("----- command Bpm -----");
    }
}
