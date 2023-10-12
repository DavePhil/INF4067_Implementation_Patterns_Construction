package monteur;

// classe concrète qui dit comment construire en implémentant les méthodes de la classe abstraite
// Ici, elle dit comment construire la pizza reine
public class MonteurPizzaReine extends MonteurPizza{
    @Override
    public Pizza getPizza() {
        creerPizza();
        monterSauce();
        monterPate();
        monterGarniture();
        return pizza;
    }
    @Override
    public void monterPate() {
        pizza.setPate("croisee");
    }

    @Override
    public void monterSauce() {
        pizza.setSauce("douce");
    }

    @Override
    public void monterGarniture() {
        pizza.setGarniture("jambon+champignon");
    }
}
