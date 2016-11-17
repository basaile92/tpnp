
public class PblBinPack {
    private int nbObjets; 
    private int poids[];
    private int cap;
    private int nbSacs;
     //  //
    public PblBinPack(int n, int p[], int nbs, int c){
    nbObjets=n;
    poids=p;
    cap=c;
    nbSacs=nbs;
    }
    
   
     //retourne Vrai SSi le pb a une solution
    public boolean aUneSolution() {
    	

    	
    	return false;
    	
    	
    	
    }
    
    //Algo non déterministe
    //si il y aune solution, au moins une exécution doit retourner Vrai
    // sinon, toutes les exécutions doivent retourner Faux
    public boolean aUneSolutionNonDeterministe() {
		return false;
	//   A compléter
    //génère alétaoirement un certificat et vérifie si il est correct
    }

   // différents accesseurs, fonctions affichage ...

    public int[] getPoids(){
    	
    	return this.poids;
    }
    
    public int getNbSacs(){
    	
    	return this.nbSacs;
    }
    
    public int getNbObjets(){
    	
    	return this.nbObjets;
    }
    
    public int getCap(){
    	
    	return this.cap;
    }

}
