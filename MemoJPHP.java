
//Class
public class Pratiquant {
	
	private int id;
	private String nom;
	private String prenom;
	private String adresse;
	private String email;
	private ArrayList<Licence> lesLicences;
	
//Fonction
public Pratiquant (int id, String nom, String prenom, String adresse, String email)
{
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.adresse = adresse;
	this.email = email;
	this.lesLicences = new ArrayList<Licence>();
}

public void ajouterLicence (Licence laLicence)
{
	this.lesLicences.add(laLicence);
}

//Getter
public String getNom ()
{
	return this.nom;
}
public String getPrenom ()
{
	return this.prenom;
}
}