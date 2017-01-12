package Moteur;

import Outils.Horloge;
import Outils.HorlogeImpl;
import command.BpmCommand;
import command.Command;

import java.util.ArrayList;


public class MoteurImpl implements Moteur{

    private boolean running = false;
    BpmCommand bpmCmd;

    private Horloge horloge;


    public static final int DEFAULT_BPM = 150;
    public static final int DEFAULT_BPP = 4;



    private int bpm ;


    private int bpp;

    public MoteurImpl() {
        super();
        this.horloge = new HorlogeImpl();
        this.bpm = DEFAULT_BPM;
        this.bpp = DEFAULT_BPP;
    }


    /**
     *Fait appel a l'horloge
     * demande a l'horloge d'executer la commande battement aprés délai
     * @param cmd la commande apres delai
     */
    @Override
    public void activeDelai(Command cmd) {
        horloge.activerApresDelai(cmd, bpm*bpp);
    }

    /**
     * appelle la méthode activerPeriodiquement de l'horloge
     * execute la commande battement apres delais
     * @param cmd la commande battement periodique
     */
    @Override
    public void activePeriode(Command cmd) {
        horloge.activerPeriodiquement(cmd,bpm);
    }

    /**
     * retourne la mesure
     * @return la mesure
     */
    @Override
    public int getBpp() {
        return bpp;
    }

    /**
     * appelle la methode desactive de l'horloge
     * desactive les taches
     */
    @Override
    public void desactive() {
        horloge.desactiver();
    }

    /**
     * decremente la mesure
     */
    @Override
    public void dec() {
        if(bpp > 2)
            this.bpp--;

    }

    /**
     * incremente la mesure
     */
    @Override
    public void inc() {
        if(bpp < 7)
            this.bpp++;
    }

    /**
     * met a jour le tempo
     * @param bpm le battement periodique (le tempo)
     */
    public void setBpm(int bpm) {
        this.bpm = bpm;
    }


}
