package monteur;

// classe concrète qui dit comment construire en implémentant les méthodes de la classe abstraite
// classe qui dit comment construire la pizza piquante
public class MonteurPizzaPiquante extends MonteurPizza {
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
        pizza.setPate("feuilletee");
    }

    @Override
    public void monterSauce() {
        pizza.setSauce("piquante");
    }

    @Override
    public void monterGarniture() {
        pizza.setGarniture("pepperoni+salami");
    }
}
