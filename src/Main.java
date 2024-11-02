//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Adherent aderant = new Adherent("jak","jim","ausii@gmail.com","0777777777777",32,3);
         Auteur auteur =   new Auteur("adam","ad","hdj@g.com","0999999999",32,4);
         Livre livre =new Livre(11111111,"ville",auteur);
        System.out.println("Information de l'Adherent:");
         aderant.afficher();
        System.out.println("Information de livre:");
         livre.afficher();



    }
}