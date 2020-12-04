import java.util.ArrayList;
import java.util.List;

public class pharmacie {
	
	private String nom;
	private String adresse;
	private static int ref = 0;
	private List<Medicament> medicament;
	private List<pharmacien> employer;
	public  Medicament M1;
	
	public pharmacie(String nom,String adresse){
		// TODO Auto-generated constructor stub.
		this.nom = nom;
		this.adresse = adresse;
		pharmacie.ref++;
		medicament = new ArrayList<Medicament>();
		employer =   new ArrayList<pharmacien>();
	}
	//getter
	public String getNom() {
		return this.nom;
	}
	
	public String getAdress() {
		
		return this.adresse;
		
	}
	public int getRef(){
		
		return pharmacie.ref;
		
	}
	
	//setters 
	public void setNom(String nom){
		
		this.nom = nom;
		
	}
	
	public void setAdresse(String adress){
		
		this.adresse = adress;
		
	}
	
	public void AddMedicament(Medicament e) {
		// TODO Auto-generated method stub
		medicament.add(e);
		System.out.println("Le medicamant a ete ajouter");
	}
	
	
	public void deleteMedicament(int ref){
		
		int i = 0;
		boolean test = false;
		for(i = 0;i<medicament.size();i++) {
			
			if(ref == medicament.get(i).getRef()){
				
				medicament.remove(i);
				System.out.println("Suppression bien effectuer");
				test = true;
				break;
				
			}
		}
		if(test == false) {
			
			System.out.println("pardon il n'exisit pas se Medicamant");
			
		}
		
	}
	
	public void EditMedicament(String name,double price,int ref,int qte){
		int i = 0;
		boolean test = false;
		for(i = 0;i<medicament.size();i++) {
			
			if(ref == medicament.get(i).getRef()) {
				
				medicament.get(i).setNom(name);
				medicament.get(i).setPrice(price);
				medicament.get(i).setQte(qte);
				System.out.println("Modification bien effectuer");
				test = true;
				break;
			}
		}
           if(test == false) {
			
			System.out.println("pardon il n'exisit pas se Medicamant");
			
		}
		
	}
	
	public void AfficherMedicamant() {
		
		int i = 0;
		for(i = 0;i<medicament.size();i++) {	
			System.out.println("name : " + medicament.get(i).getNom() + " price : " +  medicament.get(i).getprice() + " references : " + medicament.get(i).id + " quantiter  : " + medicament.get(i).getQte());
		}
	
  }
	public Medicament RechercheMedicament(int ref) {
		int i = 0;
		
		for(i = 0;i<medicament.size();i++) {	
			if(medicament.get(i).id == ref) {
				
				M1 = medicament.get(i);
				
			}
		}
		
		return M1;
		
	}
	
	public void Addpharmacien(pharmacien e) {
		// TODO Auto-generated method stub
		employer.add(e);
		System.out.println("Le medicamant a ete ajouter");
	}
	
	
	public void deletepharmacien(int ref){
		
		int i = 0;
		boolean test = false;
		for(i = 0;i<employer.size();i++) {
			
			if(ref == employer.get(i).getCode()){
				
				employer.remove(i);
				System.out.println("Suppression bien effectuer");
				test = true;
				break;
				
			}
		}
		
		if(test == false) {
			
			System.out.println("pardon il n'exisit pas se pharmacien");
			
		}
		
	}
	
	public void Editpharmacien(String name,double Salaire,String prenom,int code){
		int i = 0;
		boolean test = false;
		for(i = 0;i<employer.size();i++) {
			
			if(code == employer.get(i).getCode()) {
				
				employer.get(i).setNom(name);
				employer.get(i).setNom(prenom);
				employer.get(i).setSalaire(Salaire);
				System.out.println("Modification bien effectuer");
				test = true;
				break;
			}
		}
		
		if(test == false) {
			System.out.println("pardon il n'exisit pas se pharmacien");
		}
		
	}
	
	public void Afficherpharmacie() {
		
		int i = 0;
		for(i = 0;i<employer.size();i++) {	
			System.out.println("name : " + employer.get(i).getNom() + " prenom : " +  employer.get(i).getPrenom() + " Salaire : " + employer.get(i).getSalaire() + " code : " +  employer.get(i).id);
		}
	
  }
	
	
}
