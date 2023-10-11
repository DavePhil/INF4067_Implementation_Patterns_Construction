/*
Fait par CHEDJOUN KENGUEP Dave Master1 spécialité Genie Logiciel
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("************************ Debut ************************");
        int somme = Arithmetique.getInstance().somme(5, 4);
        System.out.println("La somme est: "+ somme);
        Arithmetique a1 = Arithmetique.getInstance(9,3);
        a1.affiche();
        Arithmetique a2 = Arithmetique.getInstance(1,2);
        a2.affiche();
        System.out.println("************************* Fin *************************");
    }
}