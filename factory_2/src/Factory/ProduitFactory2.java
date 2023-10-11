package Factory;

import Produits.ProduitA;
import Produits.ProduitA2;

public class ProduitFactory2 extends ProduitFactory{
    @Override
    protected ProduitA createProduitA() {
        return new ProduitA2();
    }
}
