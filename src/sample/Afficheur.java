package sample;

import javafx.scene.shape.Circle;

/**
 * L'interface qui gére l'affichage des changements sur l'interface, entre autre allumer et eteindre les Leds.
 *
 */
public interface Afficheur {

    /**
     * la méthode qui allume la led1 qui correspond au tempo
     * @param  led qui correspond au cercle de la led1 dans l'ihm
     * @return void
     */
    void allumerLED1(Circle led);

    /**
     * la méthode qui allume la led2 qui correspond a la mesure
     * @param led
     * @return void
     */
    void allumerLED2(Circle led);

    /**
     * la méthode qui permet d'eteindre les leds
     * @param led
     * @return void
     */
    void eteindreLED(Circle led) ;

    /**
     * la méthode qui Affiche un entier sur l’afficheur externe du métronome
     * @param valeurTempo
     * @return void
     */
    void afficherTempo(int valeurTempo) ;

}
