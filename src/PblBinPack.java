
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
    	
    	if(this.nbObjets <= nbSacs){
    		
    		for(int a : this.poids){
    			
    			if(a > this.cap)
    				return false;
    			
    		}
    		return true;
    		
    	}
    	
    	
    	
    	
	 //  A compléter
      // essaie tous les certificats un à un jusqu'à en trouver un correct -si il existe	....
    	
    	
    	boolean res = false;
    	
    	while(!res){
    		
    		for(int i=0; i< this.nbSacs; i++){
    			
    			
    			
    			
    			
    		}
    		
    		
    		
    		
    		
    		
    		
    	}
    	
    	
    	
    	
    	
    	
    	
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


}
