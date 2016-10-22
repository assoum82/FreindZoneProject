package test;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r = new Scanner(System.in);
		Amis a = new Amis();
		int i;
		
		String input;
		
		a.creerListeAmis();
		do{
			
			System.out.println("----Main Menu----");
			System.out.println("1)-Ajouter une Personne.");
			System.out.println("2)-Voir Liste des Personns.");
			System.out.println("3)-Voir Liste des Personnes Algériens.");
			System.out.println("4)-Voir Liste des Personnes étrangers.");
			System.out.println("5)-Quitter.");
			i = r.nextInt();

			if(i==1){
				Personne p1 = new Personne("","");
				do{
				System.out.print("Entrer le nom: ");
				input = r.nextLine();
				}while(input.equals(""));
				p1.nom=input;
				
				
				do{
					System.out.print("Entrer le nationalité: ");
					input = r.nextLine();
					p1.nationalité=input;
					}while(input.equals(""));
					
				a.ajouterAmis(p1);
				
			}
			
			if(i==2){
				System.out.println("----Liste D'amis----");
				if(a.nbAmis==-1){
					System.out.println("Liste vide...");
				}else{
					for (int j = 0; j <= a.nbAmis; j++) {
					System.out.println("Amis "+ (j+1) + ": "+ a.amis[j].nom + " | nationalité: "+ a.amis[j].nationalité);
					}
				}
			}
			if(i==3){
				a.amisAlgerien();
				if(a.nbAmis==-1){
					System.out.println("Liste vide...");
				}
			}
			if(i==4){
				a.amisEtranger();
				if(a.nbAmis==-1){
					System.out.println("Liste vide...");
				}
			}
			if(i==1){
				
			}
			
		}while(i!=5);
		
	}

}
