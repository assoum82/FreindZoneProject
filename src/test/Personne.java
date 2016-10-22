package test;

public class Personne {
String nom;
String nationalité;


public Personne(String a, String b) {
	// TODO Auto-generated constructor stub
	nom = a ;
	nationalité = b;
}

}
/*import java.util.ArrayList;

/**
 * Created by fcmam5 on 10/10/15.
 */
/*public class Personne {
    private String nom;
    private String prenom;
    private String nationalite;
    private int age;
    private ArrayList<Personne>listAmis = new ArrayList<>();

    public Personne(String nom, String prenom, String nationalite, int age, ArrayList<Personne> listAmis) {
        this.nom = nom;
        this.prenom = prenom;
        this.nationalite = nationalite;
        this.age = age;
        this.listAmis = listAmis;
    }

    public Personne(String nom, String prenom, String nationalite, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.nationalite = nationalite;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "I'm " + nom + " " + prenom +"from " + nationalite +" and I'm "+ age ;
    }

    public void ajouterAmi(Personne personne){
        this.listAmis.add(personne);
    }

    public void retirerAmi(Personne personne){
        this.listAmis.remove(personne);
    }

    public void afficherMesAmis(){
        System.out.println("My friends are:");
        for (int i = 0; i < listAmis.size(); i++) {
            System.out.println(this.listAmis.get(i).getNom()+" "+this.listAmis.get(i).getPrenom()+" from "+this.listAmis.get(i).getNationalite());
        }
    }

    public void afficherAmisEtrange(){
        System.out.println("My foreign friends are:");
        for (int i = 0; i < this.listAmis.size(); i++) {
            if (!this.nationalite.equals(listAmis.get(i).getNationalite())) //A problem here
            System.out.println("Mr. "+this.listAmis.get(i).getNom()+" "+this.listAmis.get(i).getPrenom()+" from "+this.listAmis.get(i).getNationalite());
        }
    }
}
Contact GitHub API Training Shop Blog */
