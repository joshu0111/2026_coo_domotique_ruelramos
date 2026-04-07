import java.util.ArrayList;
import java.util.Iterator;

/**
 * La classe telecommande est une classe qui permet de stocker une liste de telemcommande
 */

public class Telecommande {

    /** Attributs */
    ArrayList<Lampe> lampes;
    ArrayList<Hifi> hifis;

    /**
     * Constructeur de la classe
     */
    public Telecommande(){
        lampes = new ArrayList<>();
    }


    /**
     * Methode ajouterLampe qui permet d'ajouter la lampe qui est fourni en parametre aux telecommandes
     * @param l est un objet Lampe
     */
    public void ajouterLampe(Lampe l){
        lampes.add(l);
    }


    /**
     * Methode qui active une lampe a parir de son indice
     * @param indiceLampe entier qui correspond a l'indice de la lampe
     */
    public void activerLampe(int indiceLampe){
        lampes.get(indiceLampe).allumer();
    }


    /**
     * Methode qui desactive une lampe a parir de son indice
     * @param indiceLampe entier qui correspond a l'indice de la lampe
     */
    public void desactiverLampe(int indiceLampe){
        lampes.get(indiceLampe).eteindre();
    }


    /**
     * Methode act lampe qui permet d'ajouter une lampe a partir de son indice dans la liste des telecommades
     */
    public void activerToutLampe(){
        Iterator<Lampe> i = lampes.iterator();
        while (i.hasNext()) i.next().allumer();
    }


    /**
     * Methode qui permet d'activer une chaine hi-fi a partir de son indice dans la liste des chaines hi-fi
     * @param indiceHifi
     */
    public void activerHifi(int indiceHifi){
        hifis.get(indiceHifi).allumer();
    }

    /**
     * Methode qui permet de desactiver une chaine hi-fi
     * @param indiceHifi
     */
    public void desactiverHifi(int indiceHifi){
        hifis.get(indiceHifi).eteindre();
    }


    /**
     * Methode qui permet d'activer toutes les chaines hi-fi
     */
    public void activerToutHifi(){
        Iterator<Hifi> i = hifis.iterator();
        while (i.hasNext()) i.next().allumer();
    }


    /**
     * Methode toString qui renvoie l'affichage de la classe
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Telecommande{" +
                "hifis=" + hifis +
                ", lampes=" + lampes +
                '}';
    }
}
