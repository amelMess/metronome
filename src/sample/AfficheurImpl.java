package sample;

import javafx.animation.FillTransition;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

import static java.lang.Thread.sleep;

/**
 * La classe qui implémente l'interface Afficheur qui correspond a une IHM
 */
public class AfficheurImpl implements Afficheur {

    IHM ihm;


    public AfficheurImpl(IHM vue) {
        this.ihm = vue;
    }

    /**
     * la méthode qui allume la led1 qui correspond au tempo
     * @param  led qui correspond au cercle de la led1 dans l'ihm
     * @return void
     */
    @Override
    public void allumerLED1(Circle led)  {
       // this.vue.getLed1().setFill(Color.RED);
        System.out.println("allumerLED");
        FillTransition trans = new FillTransition(Duration.millis(100), led,
                Color.WHITE,Color.RED);
        trans.setCycleCount(2);
        trans.setAutoReverse(true);

        trans.play();


    }

    /**la méthode qui allume la led2 qui correspond a la mesure
     * @param led
     * @return void
     */
    @Override
    public void allumerLED2(Circle led)  {
        // this.vue.getLed1().setFill(Color.RED);
        System.out.println("allumerLED");
        FillTransition trans = new FillTransition(Duration.millis(100), led,
                Color.WHITE,Color.GREEN);
        trans.setCycleCount(2);
        trans.setAutoReverse(true);

        trans.play();


    }

    /**
     *
     *la méthode qui permet d'eteindre les leds donné en parametres
     * @param led1
     * @return void
     */
    @Override
    public void eteindreLED( Circle led1) {

        //this.vue.getLed1().setFill(Color.WHITE);
        System.out.println("eteindreLED");
        FillTransition trans = new FillTransition(Duration.millis(100), led1,
                Color.RED,Color.WHITE);
        trans.setCycleCount(10);
        trans.setAutoReverse(true);

        trans.play();

    }

    /**
     * la méthode qui Affiche un entier sur l’afficheur externe du métronome
     * @param valeurTempo
     * @return void
     */
    @Override
    public void afficherTempo(int valeurTempo) {
        ihm.getTempo();
    }
}
