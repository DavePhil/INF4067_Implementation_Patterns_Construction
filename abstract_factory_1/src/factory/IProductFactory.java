package factory;

import produits.produitA.ProduitA;
import produits.produitB.ProduitB;

public interface IProductFactory {
     ProduitA getProduitA();
     ProduitB getProduitB();
}
