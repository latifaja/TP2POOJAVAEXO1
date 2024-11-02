public class Livre {
    private int ISBN;
    Auteur auteur;
    String Titre;

    public Livre(int ISBN,  String titre , Auteur auteur) {
        this.ISBN = ISBN;
        this.auteur = auteur;
        Titre = titre;
    }

    public void afficher (){
        System.out.println("ISBN: " + ISBN);
        System.out.println("Titre: " + Titre);
        System.out.println("Auteur du livre :");
        auteur.afficher();

    }
}
