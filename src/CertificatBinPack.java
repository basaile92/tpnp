
public class CertificatBinPack implements Certificat {

	private PblBinPack pb;
	private int[] tabNumSac;
 	 //	//   A compléter ... votre représenttaion du certificat

	 public CertificatBinPack(PblBinPack p) {
		 	this.pb = p;
	 }
	    
	 public CertificatBinPack(PblBinPack p, int[] aff) {
	      	this.pb = p;
	      	this.tabNumSac = aff;
	    } 
	    
	  //Implémnetation del'interface:
	    
	 public boolean estCorrect(){
		 
		 int[] poids = this.pb.getPoids();
		 int[] poidsTotaux = new int[this.pb.getNbSacs()];
		 
		 // Si ça fonctionne pas mettre des 0 partout dans le tableau en premier
		 for(int i = 0; i < this.pb.getNbObjets(); i++){
			 
			 poidsTotaux[this.tabNumSac[i]] += poids[i] ;
		 }
		 
		 for(int i = 0; i < this.pb.getNbSacs(); i++){
			 
			 if(poidsTotaux[i]> this.pb.getCap())
				 return false;
		 }
		 
		return true;
	  }

	 public void suivant() {
	    //   A compléter
	   }
	 
	 public boolean estDernier() {
		return false;
	  	//   A completer
	  }
	    
	 public void alea() {
	   	//   A compléter
	 }
	    
	 public void affiche() {
	 	//   A compléter
	 }
	    

}
