package monteur;

public class MonteurPizzaLocale extends MonteurPizza {
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
        pizza.setPate("Feuille de Macabo");
    }

    @Override
    public void monterSauce() {
        pizza.setPate("Sauce Jaune");
    }

    @Override
    public void monterGarniture() {
        pizza.setGarniture("Escargot");
    }
}
