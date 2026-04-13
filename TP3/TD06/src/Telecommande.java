import java.util.ArrayList;
import java.util.Iterator;

/**
 * La classe telecommande est une classe qui permet de stocker une liste de telemcommande
 */

public class Telecommande {

    /** Attributs */
    ArrayList<Peripherique> peripheriques;

    /**
     * Constructeur de la classe
     */
    public Telecommande(){
        peripheriques = new ArrayList<>();
    }


    /**
     * Methode ajouterPeripherique qui permet d'ajouter un peripherique qui est fourni en parametre aux telecommandes
     * @param p est un objet qui implement l'interface Peripherique
     */
    public void ajouterPeripherique(Peripherique p){
        peripheriques.add(p);
    }


    /**
     * Methode qui active un peripherique a parir de son indice
     * @param indicePeripherique entier qui correspond a l'indice du peripherique
     */
    public void activerPeripherique
    (int indicePeripherique){
        try {
            peripheriques.get(indicePeripherique).allumer();
        }
        catch (Exception e){
            System.out.println("Il y a un probleme avec le peripherique que vous tentez d'activer");
        }
    }


    /**
     * Methode qui desactive un peripherique a parir de son indice
     * @param indicePeripherique entier qui correspond a l'indice du peripherique
     */
    public void desactiverPeripherique(int indicePeripherique){
        peripheriques.get(indicePeripherique).eteindre();
    }


    /**
     * Methode activerTout qui permet d'ajouter un peripherique a partir de son indice dans la liste des telecommades
     */
    public void activerTout(){
        Iterator<Peripherique> i = peripheriques.iterator();
        while (i.hasNext()) i.next().allumer();
    }

    /**
     * Methode getNombre qui permet de recuperer le nombre de telecommande dans la liste de la telecommande
     * @return int
     */
    public int getNombre(){
        return this.peripheriques.size();
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Telecommande{" +
                "peripheriques=" + peripheriques +
                '}';
    }
}
