package monteur;

public abstract class MonteurPizza {
    protected Pizza pizza;
    public Pizza getPizza(){
        creerPizza();
        monterSauce();
        monterPate();
        monterGarniture();
        return pizza;
    }
    public void creerPizza(){pizza = new Pizza();}
    public abstract void monterPate();
    public abstract void monterSauce();
    public abstract void monterGarniture();


}
