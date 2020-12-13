import java.util.ArrayList;

public class Lecteur extends Personne{

	private String Numero_telephone;
	private  int Carte_fid ;
	
	public ArrayList<Lecteur> Liste = new ArrayList<Lecteur>();
	
	public void ajouterLecteur(Lecteur L)
	{
		if(chercher(L.cin) == null)
		{
			Liste.add(L);
			System.out.println("Lecteur Ajouter avec succes  !");
		}
		else
		{
			System.out.println("Lecteur existe déja !");
		}
		
	}
	public Lecteur chercher(String cin)
	{
		Lecteur lecteurTrouve = null;
		for(Lecteur L : Liste){
			  if(L.cin.equals(cin)){
				  lecteurTrouve = L;
			     break;
			  }
			}
		return lecteurTrouve;
		
	}
	
	public void supprimerLecteur(String  cin)
	{
		Lecteur lecteurTrouve;
		if(chercher(cin) != null)
		{
			lecteurTrouve = chercher(cin);
			Liste.remove(lecteurTrouve);
			System.out.println("Suppression effectuée avec sucées !");
		}
		else
		{
			System.out.println("Lecteur inexistant !");
		}
		
		 
	}
	public void modifierLecteur(String cin , String n,String p,String m ,String nt ,int  Carte_fid)
	{
		Lecteur lecteurTrouve;
		
		if(chercher(cin) != null)
		{
			lecteurTrouve = chercher(cin);
			supprimerLecteur(cin);
			 
			lecteurTrouve.nom = n;
			lecteurTrouve.prenom = p;
			lecteurTrouve.mail = m;
			lecteurTrouve.Numero_telephone= nt;
			lecteurTrouve.setCarte_fid(Carte_fid);
			 
			ajouterLecteur(lecteurTrouve);
			System.out.println("Lecteur Modifier avec succés !");
 
			 
		}
		else
		{
			System.out.println("Lecteur inexistant !");
		}
		
	}
	
	
	public Lecteur(String c, String n, String p, String m,String nt, int Cf ) {
		super(c, n, p, m);
		setNumero_telephone(nt);
		setCarte_fid(Cf);
		 
	}
	
	public  int Calcul_nbr_lecteur_fidel()
	{
		int cpt=0;
		 
		for(Lecteur L : Liste){
			if(L.Carte_fid>4) {
				cpt++;
			}
			  
			}
		return cpt;
		
	}
	public void afficheLecteurs(String cin)
	{
		
		String expression ;
		if(Calcul_nbr_lecteur_fidel()==1)
		{
			expression = " est un lecteur ";
		}
		else
		{
			expression = " sont des lecteurs ";
		}
	 
		if(cin == "-1")
		{
			System.out.println(" ---------------------------------------------------");
			System.out.println("| Il existe "+Liste.size()+" Lecteurs dont "+Calcul_nbr_lecteur_fidel()+" "+expression+" fidéle dans la bibliotheque|");
			System.out.println(" ---------------------------------------------------");
			
			for(Lecteur L : Liste){
				   
				
			System.out.println(" ___________________________");
			System.out.println("|");
			System.out.println("|  CIN :"+L.cin);
			System.out.println("|  Nom :"+L.nom);
			System.out.println("|  Prenom :"+L.prenom);
			System.out.println("|  Email :"+L.mail);
			System.out.println("|   Numéro de téléphone:"+L.Numero_telephone);
			System.out.println("|  Nombre de livre lus :"+L.Carte_fid);
			System.out.println("|");
			System.out.println("___________________________");
			
			}
		}
		else
		{
			Lecteur lecteurTrouve = chercher(cin);
			
			System.out.println(" ___________________________");
			System.out.println("|");
			System.out.println("|  CIN :"+lecteurTrouve.cin);
			System.out.println("|  Nom :"+lecteurTrouve.nom);
			System.out.println("|  Prenom :"+lecteurTrouve.prenom);
			System.out.println("|  Email :"+lecteurTrouve.mail);
			System.out.println("|   Numéro de téléphone:"+lecteurTrouve.Numero_telephone);
			System.out.println("|  Nombre de livre lus :"+lecteurTrouve.Carte_fid);
			System.out.println("|");
			System.out.println("___________________________");
		 
			
		}
	}
 
	public String getNumero_telephone() {
		return Numero_telephone;
	}
	public void setNumero_telephone(String numero_telephone) {
		Numero_telephone = numero_telephone;
	}
	public int getCarte_fid() {
		return Carte_fid;
	}
	public void setCarte_fid(int carte_fid) {
		Carte_fid = carte_fid;
	}
	 
 
	  

}
