package tp3;

public class Liste {
	private static final int LMAX=10000 ;
	private Element tab[] ;
	private int longueur_list ;
	public Liste() {
		tab = new Element[LMAX];
	}
	
	
	public Element[] getTab() {
		return tab;
	}
	public void setTab(Element[] tab) {
		this.tab = tab;
	}
	public int getLongueur_list() {
		return longueur_list;
	}
	public void setLongueur_list(int longueur_list) {
		this.longueur_list = longueur_list;
	}
	public Liste listeVide(){
		Liste L = new Liste() ;
		L.tab = null ;
		L.longueur_list = 0 ;
		return L ;
	}
	public Liste inserer(Liste L, int p, Element e){
		if(Longueur_rec(L) < LMAX) {
			if((Longueur_rec(L)) !=0 && p != (Longueur_rec(L)+1)) {
				for(int j=L.longueur_list; j >= p ; j--) {
					L.tab[j+1] = L.tab[j];
				}
			}
			L.tab[p] = e;
			L.longueur_list++;
		}
		else{
		System.out.println("l’insertion est impossible, la liste est saturée");
		}
		return L ;
	}
	
	public Liste supprimer(Liste L,int p) {
		if(L.longueur_list != 1 ) {
			for(int j=p;j<=L.longueur_list-1;j++) {
				L.tab[j] = L.tab[j+1];
			}
		}
		L.longueur_list--;
		return L;
	}
	
	public Element acces(Liste L, int p) {
		return L.tab[p];
	}
	public int LongueurIter(Liste L, int p) {
		return L.longueur_list;
	}
	
	public int Longueur_rec(Liste L) {
		if(L.longueur_list == 0) {
			return 0;
		}else {
			return 1+Longueur_rec(supprimer(L,1));
		}
	}
	
	public boolean estVide(Liste L) {
		return(L == listeVide());
	}
	
}
