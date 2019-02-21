package EsercizioClopSemafori;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Christian Sipione
 *
 * @brief Gruppo2_Es1_b.java: classe main che si occupa di gestire i vari
 * thread.
 */
public class EsercizioClopSemafori {

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che si occupa di inizializzare i thread.
     *
     * Metodo che inizializza i thread th,th2,th3,th4,th5 che poi vengono
     * lanciati attraverso il metodo start().Il programma termina quando i
     * thread hanno simulato 50 clop, e sono stati visualizzati dal th6.
     */
    public static void main(String[] args) {
        try {
            Semaforo sem1 = new Semaforo(1);
            CcondividiDati c = new CcondividiDati();

            ThCavallo th = new ThCavallo(true, true, 1, c, sem1);
            ThCavallo th2 = new ThCavallo(true, true, 2, c, sem1);
            ThCavallo th3 = new ThCavallo(true, true, 3, c, sem1);
            ThCavallo th4 = new ThCavallo(true, true, 4, c, sem1);
            ThCavallo th5 = new ThCavallo(true, true, 5, c, sem1);
            ThVisualizza th6 = new ThVisualizza(c);
            th.start();
            th2.start();
            th3.start();
            th4.start();
            th5.start();
            th6.start();

            th.join();
            th2.join();
            th3.join();
            th4.join();
            th5.join();
            th6.interrupt();

            System.out.println("Programma terminato.");
        } catch (InterruptedException ex) {
            Logger.getLogger(EsercizioClopSemafori.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
