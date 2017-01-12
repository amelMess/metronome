package Controller;

import javafx.scene.control.TextField;

/**
 * Interface du controller
 */
public interface Controller {
    /**
     *Méthode appellée par la commande Start
     * Créer les deux commandes battement par minute et par mesure
     * appelle les méthodes du moteur activerPeriode et activeDelais
     */
    void start();

    /**
     * Appelle la méthode desactive() du moteur
     */
     void stop();

    /**
     * demande à l'ihm d'allumer la led
     * @param num reprensente le numéro de la led a affiché (1 ou 2)
     */
     void afficheLed(int num);

    /**
     * fait appelle a la méthode dec du moteur
     * Dec decremente la mesure
     */
    void dec();

    /**
     * fait appelle a la méthode inc du moteur
     * Inc incremente la mesure
     */
    void inc();

    /**
     * met a jour le tempo dans le moteur
     * @param value  valeur du tempo
     */
    void setTempo(int value);
}
