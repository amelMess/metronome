package Moteur;

import command.Command;


public interface Moteur {

    /**
     *Active la commande
     * @param cmd
     */
    void activeDelai(Command cmd);

    /**
     * appelle la méthode activerPeriodiquement de l'horloge
     * execute la commande battement apres delais
     * @param cmd la commande battement periodique
     */
    void activePeriode(Command cmd);

    /**
     * retourne la mesure
     * @return la mesure
     */
    int getBpp();

    /**
     * appelle la methode desactive de l'horloge
     * desactive les taches
     */
    void desactive();

    /**
     * decremente la mesure
     */
    void dec();

    /**
     * incremente la mesure
     */
    void inc();

    /**
     * met a jour le tempo
     * @param bpm le battement periodique (le tempo)
     */
    void setBpm(int bpm);

}
