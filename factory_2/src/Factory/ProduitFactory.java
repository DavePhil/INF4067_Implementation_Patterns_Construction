package Factory;

import Produits.ProduitA;

public abstract class ProduitFactory {
    // Implémentation de la fabrique abstraite avec la signature de la méthode abstraite

    public ProduitA getProduitA(){
        return createProduitA();
    }
    protected abstract ProduitA createProduitA();
}
