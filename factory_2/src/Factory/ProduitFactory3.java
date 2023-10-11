package Factory;

import Produits.ProduitA;
import Produits.ProduitA3;

public class ProduitFactory3 extends ProduitFactory{
    @Override
    protected ProduitA createProduitA() {
        return new ProduitA3();
    }
}
