package tp3;
import java.util.Scanner;
public class Test {
	public static Liste creationListe(Liste L) {
		Scanner s = new Scanner(System.in);
		System.out.println("Entrer le nombre d'elements de la Liste: ");
		int nb = s.nextInt();
		for(int i=0;i<nb;i++) {
			System.out.println("Entrer la valeur de l'element n "+i);
			Element e = new Element(s.nextInt());
			L = L.inserer(L,i,e);
			
		}
		return L;
	}
	
	public static void affichageListe(Liste L) {
		for(int ind =0;ind<L.getLongueur_list();ind++) {
			System.out.println(L.acces(L, ind));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Liste liste1 = new Liste();
		creationListe(liste1);
		if(liste1.estVide(liste1)) {
			System.out.println("La liste est vide");
		}else {
			System.out.println("Les elements de la liste sont : ");
			affichageListe(liste1);
		}
	}
}
