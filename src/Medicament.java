
public class Medicament  {
	
	private String nom;
	private double price;
	private static int ref = 0;
	public int id;
	private int qte;
	
	
	public Medicament(String nom,double price,int qte){
		
		this.nom = nom;
		this.price = price;
		Medicament.ref++;
		id = Medicament.ref;
		this.qte = qte;
		
	}
	
	
     public void setNom(String nom){
    	 
    	 this.nom = nom;
    	 
     }
     
     public void setPrice(double price) {
    	 
    	 this.price = price;
    	 
     }
     
     
     public String getNom(){
    	 
    	return this.nom;
    	 
     }
     
     public double getprice(){
    	 
    	return this.price;
    	 
     }
     
     public int getRef() {
    	 
    	 return Medicament.ref;
    	 
     }
     
     public void setQte(int qte ) {
    	 this.qte = qte;	 
     }
     
     public int getQte() {
    	 
    	 return qte;
    	 
     }
	 
     
	
	
	
	

}
