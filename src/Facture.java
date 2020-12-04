import java.util.HashMap;
import java.util.Map;

public class Facture {
	
	private Client client;
	private Map<Medicament, Integer> products = new HashMap<Medicament, Integer>();
	
    public Facture(Client client){
	  // TODO Auto-generated constructor stub
	      this.client = client;
    }
	
	
	
	
	public void addProduct(Medicament medicament,Integer quantity){
		
		if(medicament.getQte() < quantity ) {
			
			System.out.println("error la quantite et faible");
			
		}else {
			
			int qte = medicament.getQte();
			
			medicament.setQte(qte - quantity);
			
			this.products.put(medicament,quantity);
			client.setId();
			if(client.getNbrachat() == 3) {
				
				client.status = "fedele";
				
			}
			System.out.println("Achat bien effectuer");
			
		}
		
		
	}
	
	
	
	
	public Client getCustomer() {
		
		return client;
	}
	
	
	
	public Map<Medicament,Integer> getProducts(){
		return products;
	
	}
	
	
	
	
	public void afficher() {
		for (Map.Entry<Medicament, Integer> entry : products.entrySet()) {
	        System.out.println(entry.getKey() + ":" + entry.getValue());
	    }
	}
	

}
