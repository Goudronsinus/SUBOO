
package version;

import itf.IRessource;


public class Ressource implements IRessource {

	private String name;

	private Integer quantite;



	public Ressource(String name, Integer quantite, Unite unite) {
		this.name = name;
		this.quantite = quantite;
	}
	
	public Ressource (IRessource iRessource) {
		this.name = iRessource.getRessourceName();
		this.quantite = iRessource.getValeur();
	}
	public Ressource(String name){
		this.name = name;
		quantite = 0;
	}
	
	public Ressource(String name, Integer quantite) {
		this.name = name;
		this.quantite = quantite;
	}


	public void setValeur(Integer valeur) {
		quantite = valeur;
	}

	
	public String getRessourceName() {
		return name;
	}

	public Integer getValeur() {
		return quantite;
	}
}