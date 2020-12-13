import java.util.ArrayList;

public class Bienfaiteur extends Personne{
	
	private String surnom ;
	private  int Carte_fid ;
	public ArrayList<Bienfaiteur> Liste = new ArrayList<Bienfaiteur>();
	
	
	public void ajouterBienfaiteur(Bienfaiteur B)
	{
		if(chercher(B.cin) == null)
		{
			Liste.add(B);
			System.out.println("Bienfaiteur Ajouter avec succes  !");
		}
		else
		{
			System.out.println("Bienfaiteur existe déja !");
		}
		
	}
	public Bienfaiteur chercher(String cin)
	{
		Bienfaiteur bienfaiteurTrouve = null;
		for(Bienfaiteur B : Liste){
			  if(B.cin.equals(cin)){
				  bienfaiteurTrouve = B;
			     break;
			  }
			}
		return bienfaiteurTrouve;
		
	}
	public void supprimerBienfaiteur(String  cin)
	{
		Bienfaiteur bienfaiteurTrouve;
		if(chercher(cin) != null)
		{
			bienfaiteurTrouve = chercher(cin);
			Liste.remove(bienfaiteurTrouve);
			System.out.println("Suppression effectuée avec sucées !");
		}
		else
		{
			System.out.println("bienfaiteur inexistant !");
		}
		
		 
	}
	public void modifierBienfaiteur(String cin , String s,String m  ,int  Carte_fid)
	{
		Bienfaiteur bienfaiteurTrouve;
		
		if(chercher(cin) != null)
		{
			bienfaiteurTrouve = chercher(cin);
			supprimerBienfaiteur(cin);
			 
			bienfaiteurTrouve.cin = cin;
			bienfaiteurTrouve.surnom = s;
			bienfaiteurTrouve.mail = m;
			 
			bienfaiteurTrouve.setCarte_fid(Carte_fid);
			 
			ajouterBienfaiteur(bienfaiteurTrouve);
			System.out.println("Bienfaiteur Modifier avec succes  !");
 
			 
		}
		else
		{
			System.out.println("Bienfaiteur inexistant !");
		}
		
	}


	public Bienfaiteur(String c, String m ,String S, int Cf) {
		super(c,  m);
		setSurnom(S);
		setCarte_fid(Cf);
	}

	public String getSurnom() {
		return surnom;
	}

	public void setSurnom(String surnom) {
		this.surnom = surnom;
	}

	public int getCarte_fid() {
		return Carte_fid;
	}

	public void setCarte_fid(int carte_fid) {
		Carte_fid = carte_fid;
	}
	public  int Calcul_nbr_bienFaiteur_fidel()
	{
		int cpt=0;
		 
		for(Bienfaiteur B : Liste){
			if(B.Carte_fid>3) {
				cpt++;
			}
			  
			}
		return cpt;
		
	}
	
	public void afficheBienfaiteur(String cin)
	{
		
		String expression ;
		if(Calcul_nbr_bienFaiteur_fidel()==1)
		{
			expression = " est un bienfaiteur ";
		}
		else
		{
			expression = " sont des bienfaiteurs ";
		}
	 
		if(cin == "-1")
		{
			System.out.println(" ---------------------------------------------------");
			System.out.println("| Il existe "+Liste.size()+" bienfaiteurs dont "+Calcul_nbr_bienFaiteur_fidel()+" "+expression+" fidéle dans la bibliotheque|");
			System.out.println(" ---------------------------------------------------");
			
			for(Bienfaiteur B : Liste){
				   
				
			System.out.println(" ___________________________");
			System.out.println("|");
			System.out.println("|  CIN :"+B.cin);
			System.out.println("|  Surnom :"+B.surnom);
			System.out.println("|  Email :"+B.mail);
			System.out.println("|  Nombre de livre offerts :"+B.Carte_fid);
			System.out.println("|");
			System.out.println("___________________________");
			
			}
		}
		else
		{
			Bienfaiteur BienfaiteurTrouve = chercher(cin);
			
			System.out.println(" ___________________________");
			System.out.println("|");
			System.out.println("|  CIN :"+BienfaiteurTrouve.cin);
			System.out.println("|  Surnom :"+BienfaiteurTrouve.surnom);
			System.out.println("|  Email :"+BienfaiteurTrouve.mail);
			System.out.println("|  Nombre  de livre offerts  :"+BienfaiteurTrouve.Carte_fid);
			System.out.println("|");
			System.out.println("___________________________");
		 
			
		}
	}

}
