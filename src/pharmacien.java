
public class pharmacien {
	
     private String nom;
     private String prenom;
     private double Salaire;
     private static int code = 0;
     public int id;
     
     public pharmacien(String nom,String prenom,double salaire){
		// TODO Auto-generated constructor stub 
    	 this.nom = nom;
    	 this.prenom = prenom;
    	 this.Salaire = salaire;
    	 pharmacien.code++;
    	 this.id =  pharmacien.code;
	}
     public int getCode(){
    	 return pharmacien.code;
     }
     public String getNom(){
    	 return this.nom;
     }
     
     public void setNom(String nom){
    	 this.nom = nom;
     }
     public String getPrenom(){
    	 return this.prenom;
     }
     
     public void setPrenom(String Prenom){
    	 this.prenom = Prenom;
     }
     
     public double getSalaire(){
    	 return this.Salaire;
     }
     
     public void setSalaire(double salaire){
    	 this.Salaire = salaire;
     }
     
     
     
     
     
     
     
	
	

}
