
public class Client {
	
	private String nom;
	private String prenom;
	private String cni;
	private static  int id = 0;
	private int nbrachat;
	public String status = "Vide";
	
	
	public Client(String nom,String prenom,String cni){
		// TODO Auto-generated constructor stub
		this.nom = nom;
		this.prenom = prenom;
		this.cni = cni;
	}
	
	public void setId() {
		
		this.id++;
		this.nbrachat = id;
		
	}
	
	public int getNbrachat() {
		
		return this.nbrachat;
		
	}
	public void setNom(String nom){
		
		this.nom = nom;
		
		
	}
	
	public String getNom() {
		
		return this.nom;
		
	}
	
	public void setPrenom(String prenom){
		
		this.prenom = prenom;
		
		
	}
	
	public String getPrenom() {
		
		return this.prenom;
		
	}
	
	public void setCni(String cni){
		
		this.cni = cni;
		
		
	}
	
	public String getCni() {
		
		return this.cni;
		
	}
	
	public void Afficher() {
		
		
		System.out.println(" Nom : " + this.nom + " prenom : " + this.prenom + "  status :  " + this.status);
		
	}
	
	
	

}
