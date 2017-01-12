package sample;

import Controller.Controller;
import Controller.ControllerImpl;
import command.*;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * La classe implémentant l'interface IHM
 */
public class IHMImpl implements IHM, Initializable {

    @FXML
    private Button start;

    @FXML
    private Button stop;

    @FXML
    private Button inc;

    @FXML
    private Button dec;

    @FXML
    private Circle led1;

    @FXML
    private Circle led2;

    @FXML
    private Label text;

    @FXML
    private Slider slider;

    private Controller controller;

    private Afficheur afficheur;

    private EmetteurSonore emetteurSonore;


    /**
     * la méthode appellée au lancement du programme
     * instancie le controleur et l'afficheur de l'ihm
     * @param location
     * @param resources
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.controller = new ControllerImpl(this);
        this.afficheur = new AfficheurImpl(this);
        this.emetteurSonore = new EmetteurSonoreImpl();


        start();
        stop();

        slider.setMin(20);
        slider.setMax(180);
        slider.valueProperty().addListener((ov, oldVal, newVal) -> {
            slider.setValue(newVal.intValue());

            text.setText((int) newVal.doubleValue() + "");
            controller.setTempo((int)slider.getValue());

        });




    }

    public IHMImpl() {

    }

    /**
     * La méthode qui fait appel a l'afficheur pour allumer la led 1
     */
    @Override
    public void afficherLed1() {
        afficheur.allumerLED1(led1);
        emetteurSonore.emettreClic();
    }

    /**
     * La méthode qui fait appel a l'afficheur pour allumer la led 2
     */
    @Override
    public void afficherLed2() {
        afficheur.allumerLED2(led2);
        emetteurSonore.emettreClic();
    }

    /**
     * la méthode est appelée en cliquant sur le bouton start
     * crée et execute la commande Start
     */
    @Override
    public void start() {
        start.setOnAction(event -> new Start(controller).execute());
/*
        Command start = new Start(controller);
        start.execute();
       // System.out.println("start");*/
    }


    /**
     * la méthode est appelée en cliquant sur le bouton stop
     * crée et execute la commande Stop
     */
    @Override
    public void stop() {
        stop.setOnAction(event -> new Stop(controller).execute());

    }

    /**
     * la méthode est appelée en cliquant sur le bouton dec
     * crée et execute la commande dec
     */
    @Override
    public void Dec() {
        Command dec = new Dec(controller);
        dec.execute();
    }


    /**
     * la méthode est appelée en cliquant sur le bouton inc
     * crée et execute la commande inc
     */
    @Override
    public void Inc() {
        Command inc = new Inc(controller);
        inc.execute();
    }

    /**
     * récupere la valeur du slider
     * @return tempo
     */
    @Override
    public double getTempo() {
        return slider.getValue();
    }




}
