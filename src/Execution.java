import java.util.Scanner;

public class Execution {
	
	public static Livre L1 = new Livre("antigone","EditionGermany",2009);
	
	public static Lecteur P1 = new Lecteur ("BH98123","Choukri","elmehdi","medelmehdi.choukri@gmail.com","0614075409",5);
	
	public static Bienfaiteur B1 = new Bienfaiteur ("BH98123","medelmehdi.choukri@gmail.com","GodsPlan",5);
	
	
	public static void ajouterLecteur()
	{
		String nom,prenom,mail,tel,cin;
		int nbrLivreLus;
		Scanner in = new Scanner(System.in);
		System.out.println("Entrer le cin du lecteur \n");
		cin = in.next();
		if(P1.chercher(cin)==null)
		{
			System.out.println("Entrer le nom du lecteur \n");
			nom = in.next();
			System.out.println("Entrer le prenom du lecteur \n");
			prenom = in.next();
			System.out.println("Entrer l'email du lecteur \n");
			mail = in.next();
			System.out.println("Entrer le téléphone du lecteur \n");
			tel = in.next();
			
			System.out.println("Entrer le nombre de livre lus par ce lecteur \n");
			nbrLivreLus = in.nextInt();
			
			 
			Lecteur P2 = new Lecteur (cin,nom,prenom,mail,tel,nbrLivreLus);

			P1.ajouterLecteur(P2);
		}
		else
		{
			System.out.println("Lecteur existe déja !");
		}
		
		 
		
	}
	public static void ajouterBienfaiteur()
	{
		String surnom,mail,cin;
		int nbrLivreOfferts;
		Scanner in = new Scanner(System.in);
		System.out.println("Entrer le cin du bienfaiteur \n");
		cin = in.next();
		if(B1.chercher(cin)==null)
		{
			System.out.println("Entrer le surnom du bienfaiteur \n");
			surnom = in.next();
			 
			System.out.println("Entrer l'email du bienfaiteur \n");
			mail = in.next();
		 
			
			System.out.println("Entrer le nombre de livres offerts par ce bienfaiteur \n");
			nbrLivreOfferts = in.nextInt();
			
			 
			Bienfaiteur B2 = new Bienfaiteur (cin,mail,surnom,nbrLivreOfferts);

			B1.ajouterBienfaiteur(B2);
		}
		else
		{
			System.out.println("Bienfaiteur existe déja !");
		}
		
		 
		
	}
 
	
	public static void ajouterLivre()
	{
		String nom,edition;
		int dateEdition;
		Scanner in = new Scanner(System.in);
		System.out.println("Entrer le nom du livre \n");
		nom = in.next();
		System.out.println("Entrer l'edition du livre \n");
		edition = in.next();
		
		System.out.println("Entrer la date d'edition du livre \n");
		dateEdition = in.nextInt();
		
		Livre L2 = new Livre(nom,edition,dateEdition);
		L1.ajouterLivre(L2);
		 
		
	}
	public static void modifierLivre()
	{
		String nom,edition;
		int dateEdition,idLivre;
		Scanner in = new Scanner(System.in);
		

		System.out.println("Entrer l'identifiant du livre \n");
		idLivre = in.nextInt();
		
		if(L1.chercher(idLivre) != null)
		{
			System.out.println("Entrer le nouveau nom du livre \n");
			nom = in.next();
			System.out.println("Entrer la nouvelle l'edition du livre \n");
			edition = in.next();
			
			System.out.println("Entrer la nouvelle date d'edition du livre \n");
			dateEdition = in.nextInt();
			
			L1.modifierLivre(idLivre,nom,edition,dateEdition);
			System.out.println("Modification faite avec succees !");
		}
	
 
	}
	public static void modifierBienfaiteur()
	{
		String surnom,mail,oldCin,newCin;
		int nbrLivreOfferts;
		Scanner in = new Scanner(System.in);
		System.out.println("Entrer le cin du bienfaiteur \n");
		oldCin = in.next();
		if(B1.chercher(oldCin) != null)
		{
			 
			System.out.println("Entrer le nouveau surnom du bienfaiteur \n");
			surnom = in.next();
			 
			System.out.println("Entrer nouveau email du bienfaiteur \n");
			mail = in.next();
		 
			
			System.out.println("Entrer nouveau le nombre de livres offerts par ce bienfaiteur \n");
			nbrLivreOfferts = in.nextInt();
			
			 

			B1.modifierBienfaiteur(oldCin,surnom,mail,nbrLivreOfferts);
		}
	
 
	}
	
	public static void modifierLecteur()
	{
		String nom,prenom,mail,tel,cin;
		int nbrLivreLus;
		Scanner in = new Scanner(System.in);
		

		System.out.println("Entrer l'identifiant du Lecteur \n");
		cin = in.next();
		
		if(P1.chercher(cin) != null)
		{
			 
			System.out.println("Entrer le nom du lecteur \n");
			nom = in.next();
			System.out.println("Entrer le prenom du lecteur \n");
			prenom = in.next();
			System.out.println("Entrer l'email du lecteur \n");
			mail = in.next();
			System.out.println("Entrer le téléphone du lecteur \n");
			tel = in.next();
			
			System.out.println("Entrer le nombre de livre lus par ce lecteur \n");
			nbrLivreLus = in.nextInt();
			
			P1.modifierLecteur(cin,nom,prenom,mail,tel,nbrLivreLus);
			 
		}
	
 
	}
	public static void supprimerLivre()
	{
		int idLivre;
			Scanner in = new Scanner(System.in);
			System.out.println("Entrer l'identifiant du livre \n");
			idLivre = in.nextInt();
			
			L1.supprimerLivre(idLivre);
			
		
	}
	public static void supprimerLecteur()
	{
		String cinLecteur;
			Scanner in = new Scanner(System.in);
			System.out.println("Entrer l'identifiant du Lecteur \n");
			cinLecteur = in.next();
			
			P1.supprimerLecteur(cinLecteur);
			
		
	}
	public static void supprimerBienfaiteur()
	{
		String cinBienfaiteur;
			Scanner in = new Scanner(System.in);
			System.out.println("Entrer l'identifiant du cinBienfaiteur \n");
			cinBienfaiteur = in.next();
			
			B1.supprimerBienfaiteur(cinBienfaiteur);
			
		
	}
	public static void afficherLivre()
	{
		int idLivre;
		Scanner in = new Scanner(System.in);
		System.out.println("Entrer l'identifiant du livre \n");
		idLivre = in.nextInt();
		
		L1.afficheLivres(idLivre);
		
	}
	public static void afficherLecteur()
	{
		String cinLecteur;
		Scanner in = new Scanner(System.in);
		System.out.println("Entrer l'identifiant du Lecteur \n");
		cinLecteur = in.next();
		
		P1.afficheLecteurs(cinLecteur);
		
	}
	public static void afficherBienfaiteur()
	{
		String cinBienfaiteur;
		Scanner in = new Scanner(System.in);
		System.out.println("Entrer l'identifiant du Bienfaiteur \n");
		cinBienfaiteur = in.next();
		
		B1.afficheBienfaiteur(cinBienfaiteur);
		
	}
	
	public static void menuLecture()
	{ 
		int choix;
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("------------Menu Livre------------- ");
		System.out.println("|                                  |");
		System.out.println("| 1)- Ajouter un livre      	   |");
		System.out.println("| 2)- Modifier un livre    	   |");
		System.out.println("| 3)- Supprimer un livre   	   |");
		System.out.println("| 4)- Chercher un livre    	   |");
		System.out.println("| 5)- Afficher tous les livres     |");
		System.out.println("|                                  |");
		System.out.println("| votre choix :            	   |");
		choix = in.nextInt();
		switch(choix)
		{
		case  1:
		
			ajouterLivre();
			menuLecture();
			break;
		case  2:
			modifierLivre();
			menuLecture();
			break;
		case  3:
			supprimerLivre();
			menuLecture();
			break;
		case  4:
			afficherLivre();
			menuLecture();
			break;
		case  5:
			L1.afficheLivres(-1);
			menuLecture();
			 
			
			break;
		default : menuGlobal();
		
		}
		 
		
		
	}
	public static void menuBienfaiteur()
	{
		int choix;
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("------------Menu Bienfaiteur------------- ");
		System.out.println("|                                        |");
		System.out.println("| 1)- Ajouter un Bienfaiteur      	 |");
		System.out.println("| 2)- Modifier un Bienfaiteur    	 |");
		System.out.println("| 3)- Supprimer un Bienfaiteur   	 |");
		System.out.println("| 4)- Chercher un Bienfaiteur    	 |");
		System.out.println("| 5)- Afficher tous les Bienfaiteur      |");
		System.out.println("|                                        |");
		System.out.println("| votre choix :            	         |");
		choix = in.nextInt();
		switch(choix)
		{
		case  1:
		
			ajouterBienfaiteur();
			menuBienfaiteur();
			break;
		case  2:
			modifierBienfaiteur();
			menuBienfaiteur();
			break;
		case  3:
			supprimerBienfaiteur();
			menuBienfaiteur();
			break;
		case  4:
			afficherBienfaiteur();
			menuBienfaiteur();
			break;
		case  5:
			B1.afficheBienfaiteur("-1");
			menuBienfaiteur();
			 
			
			break;
			default : menuGlobal();
		
		}
		
	}
	
	public static void menuGlobal()
	{
		int choix;
		Scanner in = new Scanner(System.in);
		
		 
			System.out.println("---------------Menu Global------------------ ");
			System.out.println("|                                           |");
			System.out.println("| 1)- Menu des Livres                       |");
			System.out.println("| 2)- Menu des lecteurs                     |");
			System.out.println("| 3)- Menu des Bienfaiteurs                 |");
			System.out.println("| 4)- Entrer 0 pour quitter l'application   |");
			System.out.println("| votre choix :                             |");
			System.out.println("|                                           |");
			System.out.println("|-------------------------------------------|");
			choix = in.nextInt();
			switch(choix)
			{
			case  0:
				System.out.println("|                                           |");
				System.out.println("|              à bientôt                    |");
				System.out.println("|-------------------------------------------|");
				 
					 
				break;
			case  1:
			menuLecture();
				 
			break;
			case  2:
				menuLecteur();
					 
				break;
			case 3:
				menuBienfaiteur();
				break;
			
			}
		
	}
	public static void menuLecteur()
	{
		int choix;
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("------------Menu Lecteur------------- ");
		System.out.println("|                                  |");
		System.out.println("| 1)- Ajouter un Lecteur      	   |");
		System.out.println("| 2)- Modifier un Lecteur    	   |");
		System.out.println("| 3)- Supprimer un Lecteur   	   |");
		System.out.println("| 4)- Chercher un Lecteur    	   |");
		System.out.println("| 5)- Afficher tous les Lecteurs   |");
		System.out.println("|                                  |");
		System.out.println("| votre choix :            	   |");
		choix = in.nextInt();
		switch(choix)
		{
		case  1:
		
			ajouterLecteur();
			menuLecteur();
			break;
		case  2:
			modifierLecteur();
			menuLecteur();
			break;
		case  3:
			supprimerLecteur();
			menuLecteur();
			break;
		case  4:
			afficherLecteur();
			menuLecteur();
			break;
		case  5:
			P1.afficheLecteurs("-1");
			menuLecteur();
			 
			
			break;
			default : menuGlobal();
		
		}
		 
		
	}
	public static void main(String[] args) {
		
		 

		
		
		Livre L2 = new Livre("Boite à merveille","Edition Maroc",2011);
		
		Livre L3 = new Livre("le dernier jour d'un condamné ","Edition France",1895);
		
		Livre L33 = new Livre("Corona Virus day ","Edition Monde",2020);
		
		Lecteur P3 = new Lecteur ("HH203","Rachidi","Mohamed","med@gmail.com","0614075409",6);
		Lecteur P4 = new Lecteur ("HH233","Oumaima","Naim","Ouma@gmail.com","0614075409",2);
		
		Bienfaiteur B3 = new Bienfaiteur ("HH15563","Hamid@gmail.com","OnlyGodCanjudgeMe",2);
		
		P1.ajouterLecteur(P1);
		P1.ajouterLecteur(P3);
		P1.ajouterLecteur(P4);
		
		L1.ajouterLivre(L1);
		L1.ajouterLivre(L2);
		L1.ajouterLivre(L3);
		L1.ajouterLivre(L33);
		
		B1.ajouterBienfaiteur(B1);
		B1.ajouterBienfaiteur(B3);
		
		
		menuGlobal();
		 
		  
		
		  	
				
		}
		
		
}
	 


