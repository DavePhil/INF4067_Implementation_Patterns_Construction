import factory.IProductFactory;
import factory.ProductFactory1;
import factory.ProduitFactory2;
import factory.ProduitFactory3;
import produits.produitA.ProduitA;
import produits.produitB.ProduitB;
/*
    Fait par CHEDJOUN KENGUEP Dave Etudiant en Master 1 Genie Logiciel
 */

public class Main {
    public static void main(String[] args) {
        // Classe qui cliente qui appel la fabrique pour lui fournir les objets
        // Initialisation des fabriques pour chaque famille de produits
        IProductFactory productFactory1 = new ProductFactory1();
        IProductFactory productFactory2 = new ProduitFactory2();
        IProductFactory productFactory3 = new ProduitFactory3();
        // Initialisation des produits
        ProduitA produitA;
        ProduitB produitB;

        System.out.println("************** Debut **************");
        System.out.println("Utilisation de la premiere fabrique");
        produitA = productFactory1.getProduitA();
        produitB = productFactory1.getProduitB();
        produitA.methodeA();
        produitB.methodeB();
        // aller à la ligne
        System.out.println("");
        System.out.println("Utilisation de la seconde fabrique");
        produitA = productFactory2.getProduitA();
        produitB = productFactory2.getProduitB();
        produitA.methodeA();
        produitB.methodeB();
        System.out.println("");
        System.out.println("Utilisation de la troisieme fabrique");
        produitA = productFactory3.getProduitA();
        produitB = productFactory3.getProduitB();
        produitA.methodeA();
        produitB.methodeB();

        System.out.println("************** Fin **************");
    }
}