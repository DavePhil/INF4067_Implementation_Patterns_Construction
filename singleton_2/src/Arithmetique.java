
// Implémentation de la classe Singleton
public final class Arithmetique {
    private static Arithmetique instance;

    private int x;
    private int y;
    private String name;

    // constructeur sans paramètre
    private Arithmetique(){
        // la présence d'un constructeur privé, supprime le constructeur par défaut
        super();
    }

    // Constructeur avec 2 paramètres
    private Arithmetique(int x, int y){
        this.x = x;
        this.y = y;
    }
    // Constructeur avec 3 paramètres
    private Arithmetique(int x, int y, String name){
        this.x = x;
        this.y =y;
        this.name = name;
    }

    // Methode de récupération de l'instance sans paramètre
    public static Arithmetique getInstance() {
        if (instance==null) instance = new Arithmetique();
        return instance;
    }

    //Methode de récupération de l'instance avec 2 paramètres
    public static Arithmetique getInstance(int x, int y){
        if (instance==null) instance = new Arithmetique(x,y);
        return instance;
    }

    //Methode de récupération de l'instance avec 3 paramètres
    public static Arithmetique getInstance(int x, int y, String name){
        if (instance==null) instance = new Arithmetique(x,y,name);
        return instance;
    }

    // Methode Somme
    public int somme(int x, int y){
        return x+y;
    }

    // Methode Moyenne
    public float moyenne(int x, int y){
        return somme(x,y)/2;
    }

    //Methode soustraction
    public int soustraction(int x, int y){
        return x-y;
    }

    // Methode multiplication
    public int multiplication(int x, int y){
        return x*y;
    }

    // Methode Affiche
    public void affiche(){
        System.out.println("\n Je suis une instance mes valeurs sont: x= " +  this.x +", y= " + this.y+ " et name: "+name);
    }





}
