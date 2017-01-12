package command;

import Controller.Controller;

/**
 * la commande Start implémentant l'interface Command
 */
public class Start implements Command{

    private Controller controller;

    public Start(Controller controller) {
        this.controller=controller;
    }

    /**
     * Appelle la méthode start du controller
     */
    @Override
    public void execute() {
        controller.start();
        System.out.println("-----start command------");
        //appelle la méthode start de controller
        //initialise


    }
}
