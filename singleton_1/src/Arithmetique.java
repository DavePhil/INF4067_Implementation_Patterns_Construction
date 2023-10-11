public final class Arithmetique {
    private static Arithmetique instance;

    private int x;
    private int y;

    // constructeur sans paramètre
    private Arithmetique(){
        // la présence d'un constructeur privé, supprime le constructeur par défaut
        super();
    }

    // Constructeur avec paramètres
    private Arithmetique(int x, int y){
        this.x = x;
        this.y = y;
    }

    // Methode de récupération de l'instance sans paramètre
    public static Arithmetique getInstance() {
        if (instance==null) instance = new Arithmetique();
        return instance;
    }

    //Methode de récupération de l'instance avec paramètres
    public static Arithmetique getInstance(int x, int y){
        if (instance==null) instance = new Arithmetique(x,y);
        return instance;
    }

    // Methode Somme
    public int somme(int x, int y){
        return x+y;
    }

    // Methode Moyenne
    public float moyenne(int x, int y){
        return somme(x, y)/2;
    }

    // Methode Affiche
    public void affiche(){
        System.out.println("\n Je suis une instance mes valeurs sont: x= " +  this.x +" et y= " + this.y);
    }





}
