/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EsercizioClopSemafori;

/**
 *
 * @author Christian
 */
public class CcondividiDati {

    /**
     * @author Christian Sipione
     *
     * @brief Attributo Int che rappresenta il numero di clop del primo cavallo.
     */
    private int c1;
    /**
     * @author Christian Sipione
     *
     * @brief Attributo Int che rappresenta il numero di clop del secondo
     * cavallo.
     */
    private int c2;
    /**
     * @author Christian Sipione
     *
     * @brief Attributo Int che rappresenta il numero di clop del terzo cavallo.
     */
    private int c3;
    /**
     * @author Christian Sipione
     *
     * @brief Attributo Int che rappresenta il numero di clop del quarto
     * cavallo.
     */
    private int c4;

    /**
     * @author Christian Sipione
     *
     * @brief Attributo Int che rappresenta il numero di clop del quinto
     * cavallo.
     */
    private int c5;

    /**
     * @author Christian Sipione
     *
     * @brief Metodo costruttore
     *
     * Metodo che inizializza le variabili c1,c2,c3,c4,c5 a 0.
     */
    public CcondividiDati() {
        this.c1 = 0;
        this.c2 = 0;
        this.c3 = 0;
        this.c4 = 0;
        this.c5 = 0;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che imposta il valore della variabile c1.
     *
     * Metodo che aumenta di 1 ogni volta che il cavallo compie un passo.
     */
    public void setC1() {
        c1++;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che imposta il valore della variabile c2.
     *
     * Metodo che aumenta di 1 ogni volta che il cavallo compie un passo.
     */
    public void setC2() {
        c2++;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che imposta il valore della variabile c3.
     *
     * Metodo che aumenta di 1 ogni volta che il cavallo compie un passo.
     */
    public void setC3() {
        c3++;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che imposta il valore della variabile c4.
     *
     * Metodo che aumenta di 1 ogni volta che il cavallo compie un passo.
     */
    public void setC4() {
        c4++;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che imposta il valore della variabile c5.
     *
     * Metodo che aumenta di 1 ogni volta che il cavallo compie un passo.
     */
    public void setC5() {
        c5++;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che ritorna il numero di passi del primo cavallo.
     *
     * @return Variabile che rappresenta il numero di passi del cavallo.
     */
    public int getC1() {
        return c1;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che ritorna il numero di passi del primo cavallo.
     *
     * @return Variabile che rappresenta il numero di passi del cavallo.
     */
    public int getC2() {
        return c2;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che ritorna il numero di passi del primo cavallo.
     *
     * @return Variabile che rappresenta il numero di passi del cavallo.
     */
    public int getC3() {
        return c3;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che ritorna il numero di passi del primo cavallo.
     *
     * @return Variabile che rappresenta il numero di passi del cavallo.
     */
    public int getC4() {
        return c4;
    }

    /**
     * @author Christian Sipione
     *
     * @brief Metodo che ritorna il numero di passi del primo cavallo.
     *
     * @return Variabile che rappresenta il numero di passi del cavallo.
     */
    public int getC5() {
        return c5;
    }

}
