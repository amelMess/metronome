package sample;

public interface Clavier {

    // Retourne true si le bouton i est enfoncé, false si il est relaché.
    // Le n°1 est start, le 2 est stop, le 3 est inc et le 4 est dec.
    boolean touchePressee(int i) ;
}
