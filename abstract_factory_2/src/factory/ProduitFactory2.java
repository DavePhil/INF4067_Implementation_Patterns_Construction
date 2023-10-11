package factory;

import produits.produitA.ProduitA;
import produits.produitA.ProduitA2;
import produits.produitB.ProduitB;
import produits.produitB.ProduitB2;

public class ProduitFactory2 implements IProductFactory {
    @Override
    public ProduitA getProduitA() {
        return new ProduitA2();
    }

    @Override
    public ProduitB getProduitB() {
        return new ProduitB2();
    }
}
