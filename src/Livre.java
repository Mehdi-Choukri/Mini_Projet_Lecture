import java.util.ArrayList;

public class Livre {
	
	private   int id;
	static int cpt=0;
	private String nom ;
	private String edition ;
	private int dateEdition;
	
	public ArrayList<Livre> Liste = new ArrayList<Livre>();
	
	public Livre(String N,String E,int DE)
	{
		id=cpt++;
		setNom(N);
		setEdition(E);
		setDateEdition(DE);
	}
	public Livre()
	{ 
		
	}
 
	
	public void ajouterLivre(Livre L)
	{
		Liste.add(L);
		System.out.println("Livre Ajouter avec succes  !");
	}
	
	public Livre chercher(int id)
	{
		Livre livreTrouve = null;
		for(Livre L : Liste){
			  if(L.id == id){
				  livreTrouve = L;
			     break;
			  }
			}
		return livreTrouve;
		
	}
	
	
	
	
 
	 
	public void supprimerLivre(int id)
	{
		Livre livreTrouve;
		if(chercher(id) != null)
		{
			livreTrouve = chercher(id);
			Liste.remove(livreTrouve);
			System.out.println("Suppression effectuée avec sucées !");
		}
		else
		{
			System.out.println("Livre inexistant !");
		}
		
		 
	}
	public void modifierLivre(int id , String N,String E ,int DE )
	{
		Livre livre_Trouve;
		
		if(chercher(id) != null)
		{
			livre_Trouve = chercher(id);
			supprimerLivre(id);
			 
			livre_Trouve.nom = N;
			livre_Trouve.edition = E;
			livre_Trouve.setDateEdition(DE);
			ajouterLivre(livre_Trouve);
			 
			System.out.println("Livre Modifier avec succés !");
			 
		}
		else
		{
			System.out.println("Livre inexistant !");
		}
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}


	public int getDateEdition() {
		return dateEdition;
	}


	public void setDateEdition(int dateEdition) {
		this.dateEdition = dateEdition;
	}
	 
	public void afficheLivres(int ID)
	{
		if(ID == -1)
		{
			System.out.println(" -----------------------------------------");
			System.out.println("| Il existe "+Liste.size()+" Livres dans la bibliotheque|");
			System.out.println(" -----------------------------------------");
			
			for(Livre L : Liste){
				   
				
			System.out.println(" ___________________________");
			System.out.println("|");
			System.out.println("|  Identifiant :"+L.id);
			System.out.println("|  Nom :"+L.nom);
			System.out.println("|  Edition :"+L.edition);
			System.out.println("|  Date d'édition :"+L.dateEdition);
			System.out.println("|");
			System.out.println("___________________________");
			
			}
		}
		else
		{
			Livre livreTrouve = chercher(ID);
			System.out.println(" ___________________________");
			System.out.println("|");
			System.out.println("|  Identifiant :"+livreTrouve.id);
			System.out.println("|  Nom :"+livreTrouve.nom);
			System.out.println("|  Edition :"+livreTrouve.edition);
			System.out.println("|  Date d'édition :"+livreTrouve.dateEdition);
			System.out.println("|");
			System.out.println("___________________________");
			
		}
	}
	
	 
	
	
	
}
