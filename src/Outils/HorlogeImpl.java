package Outils;

import command.Command;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class HorlogeImpl implements Horloge {

    private Timer timer = new Timer();
    private TimerTask task1;
    private TimerTask task2;

    /**
     * Appel périodique de l’opération execute() de cmd,
     * toutes les périodeEnSecondes secondes,
     * avec une précision d’une milliseconde
     * @param cmd correspond a la commande du battement periodique
     * @param periodeEnSecondes le tempo
     */
    @Override
    public void activerPeriodiquement(Command cmd, float periodeEnSecondes) {
          task1 = new TimerTask()
          {
            public void run() {
                cmd.execute();
            }
        };
        timer.schedule(task1, new Date(), (long) periodeEnSecondes);
    }

    /**
     *  Appel de l’opération execute() de cmd,
     *  après un délai de délaiEnSecondes secondes,
     *   avec une précision d’une milliseconde.
     * @param cmd correspond a la commande battement aprés delai
     * @param delaiEnSecondes la mesure
     */
    @Override
    public void activerApresDelai(Command cmd, float delaiEnSecondes) {
        task2 = new TimerTask()
        {
            public void run() {
                cmd.execute();
            }
        };
        timer.schedule(task2, new Date(), (long) delaiEnSecondes);
    }

    /**
     * Met fin aux tâches du timer
     */
    @Override
    public void desactiver() {
        task1.cancel();
        task2.cancel();
    }
}
