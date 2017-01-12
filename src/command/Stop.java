package command;

import Controller.Controller;

/**
 * la commande Stop implémentant l'interface Command
 */
public class Stop implements Command{

    private Controller controller;

    public Stop(Controller controller) {
        this.controller=controller;
    }

    @Override
    public void execute() {
        controller.stop();
        System.out.println("-----stop command------");



    }
}