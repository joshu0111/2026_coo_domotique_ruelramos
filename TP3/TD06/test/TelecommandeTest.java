import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Classe de test pour la Telecommande
 * Structure imposée : préparation, exécution, vérification.
 */
public class TelecommandeTest {

    @Test
    void testAjoutLampeTelecommandeVide() {
        // 1. Bloc de préparation des données
        Telecommande telecommande = new Telecommande();
        Lampe lampe = new Lampe("Salon");

        // 2. Bloc exécutant la méthode de test
        telecommande.ajouterPeripherique(lampe);

        // 3. Bloc vérifiant les résultats obtenus
        // On vérifie que la lampe est présente dans le toString
        assertTrue(telecommande.toString().contains("Salon"), "La lampe devrait être ajoutée.");
    }

    @Test
    void testAjoutLampeTelecommandeUnElement() {
        // 1. Préparation
        Telecommande telecommande = new Telecommande();
        telecommande.ajouterPeripherique(new Lampe("Cuisine"));
        Lampe nouvelleLampe = new Lampe("Chambre");

        // 2. Exécution
        telecommande.ajouterPeripherique(nouvelleLampe);

        // 3. Vérification
        String rendu = telecommande.toString();
        assertTrue(rendu.contains("Chambre") && rendu.contains("Cuisine"));
    }

    @Test
    void testactiverPeripheriqueExistantePosition0() {
        // 1. Préparation
        Telecommande telecommande = new Telecommande();
        Lampe l = new Lampe("Salon");
        telecommande.ajouterPeripherique(l);

        // 2. Exécution
        telecommande.activerPeripherique(0);

        // 3. Vérification
        // On vérifie si le toString de la télécommande reflète l'état allumé
        // ou on vérifie directement l'objet lampe si on y a accès.
        assertTrue(telecommande.toString().contains("On"), "La lampe à l'indice 0 doit être allumée.");
    }

    @Test
    void testactiverPeripheriqueExistantePosition1() {
        // 1. Préparation
        Telecommande telecommande = new Telecommande();
        telecommande.ajouterPeripherique(new Lampe("Entrée"));
        telecommande.ajouterPeripherique(new Lampe("Bureau"));

        // 2. Exécution
        telecommande.activerPeripherique(1);

        // 3. Vérification
        assertTrue(telecommande.toString().contains("Entrée: Off") && telecommande.toString().contains("Bureau: On"));
    }

    @Test
    void testactiverPeripheriqueInexistante() {
        // 1. Préparation
        Telecommande telecommande = new Telecommande();
        telecommande.ajouterPeripherique(new Lampe("Garage"));

        // 2. & 3. Exécution et Vérification
        // Ici, on vérifie que l'appel avec un mauvais indice ne fait pas crash le programme
        // (selon la gestion d'erreur que tu implémenteras à la Question 8).
        assertDoesNotThrow(() -> {
            telecommande.activerPeripherique(99);
        }, "L'activation d'un indice inexistant ne devrait pas lever d'erreur fatale non gérée.");
    }

    @Test
    void testAjouterPeripheriqueChemineeAdapterPeripherique(){
        // 1. Preparation
        Telecommande t = new Telecommande();
        ChemineeAdapterPeripherique c = new ChemineeAdapterPeripherique();

        // 2. Execution
        t.ajouterPeripherique(c);

        // 3. Verification
        assertTrue(t.toString().contains("cheminee: 0"));
    }

    @Test
    void testActiverPer ipheriqueChemineeAdapterPeripherique(){
        // 1. Preparation
        Telecommande t = new Telecommande();
        t.ajouterPeripherique(new ChemineeAdapterPeripherique());

        // 2. Execution
        t.activerPeripherique(0);

        // 3. Verification
        assertTrue(t.toString().contains("cheminee: 10"));
    }

}