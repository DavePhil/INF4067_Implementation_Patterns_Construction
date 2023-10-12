package monteur;

public abstract class MonteurPizza {
    protected Pizza pizza;
    public abstract Pizza getPizza();
    public void creerPizza(){pizza = new Pizza();}
    public abstract void monterPate();
    public abstract void monterSauce();
    public abstract void monterGarniture();


}
