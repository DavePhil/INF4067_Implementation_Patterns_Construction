/*
    Fait par CHEDJOUN KENGUEP DAVE Matricule 20U2757 Master 1 Spécialité Genie Logiciel
 */
public class Main {
    // Classe cliente qui demande l'instanciation des produits
    public static void main(String[] args) {
        ProduitFactory produitFactory = new ProduitFactory();
        ProduitA produitA = null;
        System.out.println("============ Debut ============");
        // Produit A1.
        produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA1);
        produitA.methodeA();
        // Aller à la ligne
        System.out.println("");
        // Produit A2
        produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA2);
        produitA.methodeA();
        // Aller à la ligne
        System.out.println("");
        // Produit A3
        produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA3);
        produitA.methodeA();

        System.out.println("============ Fin ==============");
    }
}