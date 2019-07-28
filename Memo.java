« == » : permet de tester l'égalité.

« != » : permet de tester l’inégalité.

« < » : strictement inférieur.

« <= » : inférieur ou égal.

« > » : strictement supérieur.

« >= » : supérieur ou égal.

« && » : l'opérateur ET. Il permet de préciser une condition

« || » : le OU. Même combat que le précédent.

«  ? : » : l'opérateur ternaire. Pour celui-ci, vous comprendrez mieux avec un exemple qui sera donné vers la fin de ce chapitre.

// Création de la Class

	public class Club {

// Initialise les paramètres des Clubs
	private int id;
	private String nom;
	private String adresse;
	private String email;
	private LigueRegionale laLigueRegionale;	//récupère dans une autre class une ligue
	private ArrayList<Licence> lesLicences;		//Tableau des Licence
	
//	Création de la fonction d'initialisation des paramètres
	public Club (int id, String nom, String adresse, String email, LigueRegionale laLigueRegionale){
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
		this.email = email;
		this.laLigueRegionale = laLigueRegionale;
		this.lesLicences = new ArrayList<Licence>();
	}

char tableauCaractere[] = {'a','b','c','d','e','f','g'};
       
for(int i = 0; i < tableauCaractere.length; i++)
{
  System.out.println("À l'emplacement " + i +" du tableau nous avons = " + tableauCaractere[i]);
}

//Getters & Setters
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

	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}



// for/foreach  
//Récupération des valeurs dans Licences dans tableau d'une autre Class pour un    VAriable Et Fonction
		 for(Licence uneLicence: this.lesLicences){
		 	uneLicence.numero  	//Parametre 
		 	uneLicence.description	//Fonction
		 }



//Tableau ArrayList
    public List<Absence> getAbsencesEnAttente() {
    	 
    	 ArrayList<AbsenceAtt> listattente = new ArrayList<AbsenceAtt>();

    	 for(Absence uneAbsence: this.lesAbsences){
    	 	
    	 	if = (uneAbsence.getLeEtat=="ATT"){	//comparaison ==		// affectation = 

    	 		Absence.add(uneAbsence)

				 }	
    	 		 return listattente;
    	 	}
    }

Scanner sc = new Scanner(System.in);
System.out.println("Veuillez saisir un mot :");
String str = sc.nextLine();
System.out.println("Vous avez saisi : " + str);

int i = 0;
if (i < 0)
{
  System.out.println("Ce nombre est négatif !");
} 
else
{
  if(i == 0)
    System.out.println("Ce nombre est nul !");
 
  else
    System.out.println("Ce nombre est positif !");
 
}*


int note = 10; //On imagine que la note maximale est 20

switch (note)
{
  case 0:
    System.out.println("Ouch !");
    break;
  case 10:
    System.out.println("Vous avez juste la moyenne.");
    break;
  case 20:
    System.out.println("Parfait !");
    break;
  default:
    System.out.println("Il faut davantage travailler.");
}

String prenom;
char reponse = 'O';
Scanner sc = new Scanner(System.in);
while (reponse == 'O')
{
  System.out.println("Donnez un prénom : ");
  prenom = sc.nextLine();
  System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");                        
  //Sans ça, nous n'entrerions pas dans la deuxième boucle
  reponse = ' ';
                        
  //Tant que la réponse n'est pas O ou N, on repose la question
  while(reponse != 'O' && reponse != 'N')
  {
    //On demande si la personne veut faire un autre essai
    System.out.println("Voulez-vous réessayer ? (O/N)");
    reponse = sc.nextLine().charAt(0);
  }
}
System.out.println("Au revoir…");