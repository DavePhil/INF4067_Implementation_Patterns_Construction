package Factory;

import Produits.ProduitA;
import Produits.ProduitA1;

public class ProduitFactory1 extends ProduitFactory{
    @Override
    protected ProduitA createProduitA() {
        return new ProduitA1();
    }
}
