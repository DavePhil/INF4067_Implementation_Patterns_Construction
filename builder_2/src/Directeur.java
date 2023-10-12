import monteur.MonteurPizza;
import monteur.Pizza;


// Classe qui construit l'objet en utilisant le monteur qui lui connait construire
public class Directeur {
    private MonteurPizza monteurPizza;

    public void setMonteurPizza(MonteurPizza monteurPizza) {
        this.monteurPizza = monteurPizza;
    }

    public void construire(){
        Pizza pizza = monteurPizza.getPizza();
        pizza.print();
    }
}
