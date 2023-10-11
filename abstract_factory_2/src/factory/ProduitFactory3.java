package factory;

import produits.produitA.ProduitA;
import produits.produitA.ProduitA3;
import produits.produitB.ProduitB;
import produits.produitB.ProduitB3;

public class ProduitFactory3 implements IProductFactory {

    @Override
    public ProduitA getProduitA() {
        return new ProduitA3();
    }

    @Override
    public ProduitB getProduitB() {
        return new ProduitB3();
    }
}
