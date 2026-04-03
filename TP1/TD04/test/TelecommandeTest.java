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
        telecommande.ajouterLampe(lampe);

        // 3. Bloc vérifiant les résultats obtenus
        // On vérifie que la lampe est présente dans le toString
        assertTrue(telecommande.toString().contains("Salon"), "La lampe devrait être ajoutée.");
    }

    @Test
    void testAjoutLampeTelecommandeUnElement() {
        // 1. Préparation
        Telecommande telecommande = new Telecommande();
        telecommande.ajouterLampe(new Lampe("Cuisine"));
        Lampe nouvelleLampe = new Lampe("Chambre");

        // 2. Exécution
        telecommande.ajouterLampe(nouvelleLampe);

        // 3. Vérification
        String rendu = telecommande.toString();
        assertTrue(rendu.contains("0") && rendu.contains("Cuisine"));
        assertTrue(rendu.contains("1") && rendu.contains("Chambre"));
    }

    @Test
    void testActiverLampeExistantePosition0() {
        // 1. Préparation
        Telecommande telecommande = new Telecommande();
        Lampe l = new Lampe("Salon");
        telecommande.ajouterLampe(l);

        // 2. Exécution
        telecommande.activerLampe(0);

        // 3. Vérification
        // On vérifie si le toString de la télécommande reflète l'état allumé
        // ou on vérifie directement l'objet lampe si on y a accès.
        assertTrue(telecommande.toString().contains("allumé"), "La lampe à l'indice 0 doit être allumée.");
    }

    @Test
    void testActiverLampeExistantePosition1() {
        // 1. Préparation
        Telecommande telecommande = new Telecommande();
        telecommande.ajouterLampe(new Lampe("Entrée"));
        telecommande.ajouterLampe(new Lampe("Bureau"));

        // 2. Exécution
        telecommande.activerLampe(1);

        // 3. Vérification
        assertTrue(telecommande.toString().contains("Bureau") && telecommande.toString().contains("allumé"));
    }

    @Test
    void testActiverLampeInexistante() {
        // 1. Préparation
        Telecommande telecommande = new Telecommande();
        telecommande.ajouterLampe(new Lampe("Garage"));

        // 2. & 3. Exécution et Vérification
        // Ici, on vérifie que l'appel avec un mauvais indice ne fait pas crash le programme
        // (selon la gestion d'erreur que tu implémenteras à la Question 8).
        assertDoesNotThrow(() -> {
            telecommande.activerLampe(99);
        }, "L'activation d'un indice inexistant ne devrait pas lever d'erreur fatale non gérée.");
    }
}