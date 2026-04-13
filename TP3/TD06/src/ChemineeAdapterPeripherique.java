/**
 * Classe qui a pour but d'implementer les methodes de l'interface peripherique pour ne pas changer la classe Cheminee
 */
public class ChemineeAdapterPeripherique implements Peripherique{
    /**
     * Attributs
     */
    Cheminee ch;

    /**
     * Consturcteur de la classe
     * @param c
     */
    public ChemineeAdapterPeripherique(Cheminee c){
        this.ch = c;
    }

    /**
     * Methode allumer qui met l'intensite de la cheminee a 10
     */
    public void allumer(){
        this.ch.changerIntensite(10);
    }

    /**
     * Methode eteindre qui met l'intensite de la cheminee a 0
     */
    public void eteindre(){
        this.ch.changerIntensite(0);
    }
}
