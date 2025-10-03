package universite_Paris8.iut.aaberkane;

import universite_Paris8.iut.aaberkane.utils.exception.PasMortException;

import java.util.ArrayList;


public class EtatCivil {

	private ArrayList<Personne> registre;

	public EtatCivil(ArrayList<Personne> l) {
		registre = l;
	}

	public ArrayList<Personne> getRegistre() {
		return registre;
	}

	public Personne getPersonne(String nom){
		for (Personne p: registre){
			if (p.getNom().equals(nom)){
				return p;
			}
		}
        return null;
    }

	public int nombreDevivant() throws PasMortException {
		int compteurNbVivant=0;
		for (Personne p: registre){
			try {
				if (p.getAnneeMort()!=1){
					compteurNbVivant++;
				}
			} catch (PasMortException pasMortException){
				System.out.println("il n'est pas mort");
			}
		}
		return compteurNbVivant;
	}


	public int nombreDeMortApres1960(){
		int compteurnbMort=0;
		for (Personne p: registre){
			try {
				if (p.getAnneeMort()>1960){
					compteurnbMort++;
				}
			} catch (PasMortException pasMortException){
				System.out.println(p.getNom() + "pas mort après 1960");
			}
		}
		return compteurnbMort;
	}

	public boolean tousMort() throws PasMortException {
		boolean ensembleMort=true;

		for (Personne p: registre){
			try {
				if (p.getAnneeMort() != 1) {
					ensembleMort = false;
				}
			} catch (PasMortException pasMortException){
				System.out.println(p.getNom() + "il n'est pas mort");
			}
		}
		return ensembleMort;
	}

	@Override
	public String toString() {
		return "EtatCivil [registre=" + registre + "]";
	}
	
	
	

}
