package sample;

import Controller.Controller;
import javafx.scene.shape.Circle;


/**
 * represente le controlleur de l'interface du fichier Fxml .
 */
public interface IHM {
    /**
     * La méthode qui fait appel a l'afficheur pour allumer la led 1
     */
    void afficherLed1();

    /**
     * La méthode qui fait appel a l'afficheur pour allumer la led 2
     */
    void afficherLed2();

    /**
     * la méthode est appelée en cliquant sur le bouton start
     * crée et execute la commande Start
     */
    void start();

    /**
     * la méthode est appelée en cliquant sur le bouton stop
     * crée et execute la commande Stop
     */
    void stop();

    /**
     * la méthode est appelée en cliquant sur le bouton dec
     * crée et execute la commande dec
     */
    void Dec();

    /**
     * la méthode est appelée en cliquant sur le bouton inc
     * crée et execute la commande inc
     */
    void Inc();

    /**
     * récupere la valeur du slider
     * @return tempo
     */
    double getTempo();

}
