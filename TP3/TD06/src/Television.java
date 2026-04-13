public class Television implements Peripherique{

    /** Attributs */
    boolean etat;

    /**
     * Methode qui allume la television
     */
    public void allumer(){
        this.etat = true;
    }

    /**
     * Methode qui eteit la television
     */
    public void eteindre(){
        this.etat = false;
    }

    /**
     * Methode qui permet d'obtenir l'etat de la tele
     */
    public boolean estAllume(){
        return etat;
    }

    /**
     * Methode toString qui permet d'afficher l'objet
     * @return String
     */
    @Override
    public String toString() {
        return "Television{" +
                "etat=" + etat +
                '}';
    }
}

