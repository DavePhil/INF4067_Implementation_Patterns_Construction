package factory;

import produits.produitA.ProduitA;
import produits.produitA.ProduitA1;
import produits.produitB.ProduitB;
import produits.produitB.ProduitB1;

public class ProductFactory1 implements IProductFactory {

    @Override
    public ProduitA getProduitA() {
        return new ProduitA1();
    }

    @Override
    public ProduitB getProduitB() {
        return new ProduitB1();
    }
}
