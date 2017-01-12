package command;

import Controller.Controller;

/**
 * La commande representant Battement apres delai de la led 2
 */
public class BppCommand implements Command {

    private Controller controller;

    public BppCommand(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void execute() {
        controller.afficheLed(2);
        System.out.println("----- command Bpp -----");
    }
}
