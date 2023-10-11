/*
Fait par CHEDJOUN KENGUEP Dave Master1 spécialité Genie Logiciel
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("************************ Debut ************************");
        Arithmetique arithmetique = Arithmetique.getInstance(5,7, "Math");
        int somme = Arithmetique.getInstance().somme(5, 4);
        int multiplication = arithmetique.multiplication(2,3);
        int soustraction = arithmetique.soustraction(5,2);
        float moyenne = arithmetique.moyenne(5,4);
        System.out.println("La somme est: "+ somme);
        System.out.println("La multiplication est: "+ multiplication);
        System.out.println("la soustraction est: "+ soustraction);
        System.out.println("La moyenne est: "+ moyenne);
        Arithmetique a1 = Arithmetique.getInstance(9,3);
        a1.affiche();
        Arithmetique a2 = Arithmetique.getInstance(1,2);
        a2.affiche();
        System.out.println("************************* Fin *************************");
    }
}