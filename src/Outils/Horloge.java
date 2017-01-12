package Outils;

import command.Command;


public interface Horloge {

        /**
         * Appel périodique de l’opération execute() de cmd,
         * toutes les périodeEnSecondes secondes,
         * avec une précision d’une milliseconde
         * @param cmd correspond a la commande du battement periodique
         * @param periodeEnSecondes le tempo
         */
        void activerPeriodiquement(Command cmd, float periodeEnSecondes) ;

        /**
         *  Appel de l’opération execute() de cmd,
         *  après un délai de délaiEnSecondes secondes,
         *   avec une précision d’une milliseconde.
         * @param cmd correspond a la commande battement aprés delai
         * @param delaiEnSecondes la mesure
         */
        void activerApresDelai(Command cmd, float delaiEnSecondes) ;

        /**
         * Met fin aux tâches du timer
         */
        void desactiver() ;
}
