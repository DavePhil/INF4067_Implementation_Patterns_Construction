import Factory.ProduitFactory;
import Factory.ProduitFactory1;
import Factory.ProduitFactory2;
import Produits.ProduitA;

/*
    Fait par CHEDJOUN KENGUEP DAVE Matricule 20U2757 Master 1 Spécialité Genie Logiciel
 */
public class Main {
    // Classe cliente qui demande l'instanciation des produits
    public static void main(String[] args) {
        // Initialisation des fabriques concrètes
        ProduitFactory produitFactory1 = new ProduitFactory1();
        ProduitFactory produitFactory2 = new ProduitFactory2();

        ProduitA produitA;
        System.out.println("============ Debut ============");
        // Produit A1
        System.out.println("Utilisation de la premiere fabrique");
        produitA = produitFactory1.getProduitA();
        produitA.methodeA();
        // Aller à la ligne
        System.out.println("");
        // Produit A2
        System.out.println("Utilisation de la seconde fabrique");
        produitA = produitFactory2.getProduitA();
        produitA.methodeA();
        System.out.println("============ Fin ==============");

    }
}