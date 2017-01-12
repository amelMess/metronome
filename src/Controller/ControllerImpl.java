package Controller;

import Moteur.Moteur;
import Moteur.MoteurImpl;
import command.BpmCommand;
import command.BppCommand;
import command.Command;
import sample.IHM;

public class ControllerImpl implements Controller{

    //appelle  les méthodes du moteur en cas de modifications
    private Moteur moteur;

    private IHM ihm;
    private boolean presse = false;

    public ControllerImpl(IHM ihm) {
        this.ihm = ihm;
        this.moteur = new MoteurImpl();
        //this.moteur.setBpp(4);

    }

    /**
     *Méthode appellée par la commande Start
     * Créer les deux commandes battement par minute et par mesure
     * appelle les méthodes du moteur activerPeriode et activeDelais
     */
    @Override
    public void start() {

        if(presse == false){
            Command bpmCmd = new BpmCommand(this);
            Command bppCmd = new BppCommand(this);
            //bpm.setController(this);
            //bpm.execute();
            moteur.activePeriode(bpmCmd);
            moteur.activeDelai(bppCmd);
            presse = true;
        }


    }

    /**
     * Appelle la méthode desactive() du moteur
     */
    @Override
    public void stop() {
       // ihm.eteindre();
        moteur.desactive();
        presse = false;
    }

    /**
     * demande à l'ihm d'allumer la led
     * @param num reprensente le numéro de la led a affiché (1 ou 2)
     */
    public void afficheLed(int num){

        //appelle signalLed1
       // ihm.afficherLed(num);
        if(num == 1)
            ihm.afficherLed1();
        else
            ihm.afficherLed2();
       // System.out.println("----afficheLed----");


    }


    /**
     * fait appelle a la méthode dec du moteur
     * Dec decremente la mesure
     */
    @Override
    public void dec() {
       // int bpp = moteur.getBpp();
        this.moteur.dec();
        System.out.println(moteur.getBpp());

    }

    /**
     * fait appelle a la méthode inc du moteur
     * Inc incremente la mesure
     */
    @Override
    public void inc() {
        this.moteur.inc();
        System.out.println(moteur.getBpp());
    }

    /**
     * met a jour le tempo dans le moteur
     * @param value  valeur du tempo
     */
    @Override
    public void setTempo(int value) {
        moteur.setBpm(value);
    }

}
