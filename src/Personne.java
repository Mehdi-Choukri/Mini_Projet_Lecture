
public abstract class Personne {
	
	public String cin;
	public String nom;
	public String prenom;
	public String mail;
	
	public Personne (String c,String n,String p,String m)
	{
		this.cin = c;
		this.nom = n;
		this.prenom = p ;
		this.mail = m;
	}
	public Personne (String c,String m)
	{
		this.cin = c;
		this.mail = m;
	}

	 
	
	

}
