public class ProduitFactory {
    // Implémentation de la factory Method
    // Initialisation des constantes permettant de distinguer le type
    public static final int TYPE_PRODUITA1 = 1;
    public static final int TYPE_PRODUITA2 = 2;

    // definition de la factory method
    public ProduitA getProduitA(int typeProduit){
        ProduitA produitA = null;
        switch (typeProduit){
            case TYPE_PRODUITA1 -> produitA = new ProduitA1();
            case TYPE_PRODUITA2 -> produitA = new ProduitA2();
            default -> throw new IllegalArgumentException("Type de produit Inconnu");
        }
        return produitA;
    }
}
