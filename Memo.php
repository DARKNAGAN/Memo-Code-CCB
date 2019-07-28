<?php
// Création de la Class

public class Club {

// Initialise les paramètres des Clubs
	private  $id;
	private  $nom;
	private  $adresse;
	private  $email;
	private  $laLigueRegionale;	//récupère dans une autre class Ligue ces paramètres
	private  $lesLicences;		//Tableau des Licence dans la class Licence
	
//	Création de la fonction d'initialisation des paramètres
	public function __construct Club ($id, $nom, $adresse, $email, $laLigueRegionale){
		$this->id = $id;
		$this->nom = $nom;
		$this->adresse = $adresse;
		$this->email = $email;
		$this->laLigueRegionale = $laLigueRegionale;
	}

//Getters & Setters
	public function getId() {
		return $this->id;
	}
	public function setId($id) {
		$this->id = $id;
	}

	public function getNom() {
		return $this->nom;
	}
	public function setNom($nom) {
		$this->nom = $nom;
	}

	public function getAdresse() {
		return $this->adresse;
	}
	public function setAdresse($adresse) {
		$this->adresse = $adresse;
	}

	public function getEmail() {
		return $this->email;
	}
	public function setEmail($email) {
		$this->email = $email;
	}

	public function getEmail() {
		return $this->email;
	}
	public function setEmail($email) {
		$this->email = $email;
	}

// for/foreach  pour parcourir ArrayList 
//Récupération des valeurs dans la class Licences d'un tableau
		 for($this->lesLicences as $uneLicence){
		 	$uneLicence->$numero  					//Parametre 
		 	$uneLicence->Getdescription()			//Fonction
		 }

//Tableau Array
	public function GetLicenceActive()	{
		
			$listeLicenceActive = array();
//On parcourt toutes les licences du club et on ne garde que celles qui sont actives.
			foreach ($this->LesLicences as $uneLicence)
			{
		       
				if ($uneLicence->EstActive())
				{
					$listeLicenceActive[] = $uneLicence;
				}
			}
			return $listeLicenceActive;
		}

?>