package talarmin.cecile.com.fr.tpnote;

import java.util.List;

public class Administrateur extends Employe{
	
	Administrateur(Agence a, Entreprise e)
	{
		super(a,e);
	}
	
	boolean attribuerMateriel(Empruntable e_table, Emprunteur e_teur)
	{
		int stockEmpr = e_teur.listeMateriel().size();
		
		if(e_table.isLimitationPretAuxAgences()&& Agence.class.isInstance(e_teur))
		{
			e_teur.ajouterAuStock(e_table);
		}
		else
		{
			e_teur.ajouterAuStock(e_table);
		}
		
		if(stockEmpr<e_teur.listeMateriel().size())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	boolean recupererMateriel(Empruntable e_table, Emprunteur e_teur)
	{
		if(e_teur.perdreMateriel(e_table))
		{
			this.ajouterAuStock(e_table);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	List<Empruntable> stockEntreprise()
	{
		return this.getEntreprise().listeMateriel();
	}
	
	List<Empruntable> stockAgence()
	{
		return this.getAgence().listeMateriel();
	}
	
	void transfererMateriel(Emprunteur e_teurDest, Empruntable e_table,Emprunteur e_teurCible)
	{
		if(e_table.isLimitationPretAuxAgences())
		{
			if(Agence.class.isInstance(e_teurCible))
			{
				if(e_teurDest.perdreMateriel(e_table))
				{
					e_teurCible.ajouterAuStock(e_table);
				}
			}
		}
		else if(e_teurDest.perdreMateriel(e_table))
		{
			e_teurCible.ajouterAuStock(e_table);
		}
	
	}
	
	void supprimerMateriel(Empruntable e_table)
	{
		this.perdreMateriel(e_table);
	}
	
	void supprimerMaterielDefectueuxEntreprise()
	{
		for(Empruntable e_table : this.getEntreprise().listeMateriel())
		{
			if(e_table.isDefectueux())
			{
				this.getEntreprise().perdreMateriel(e_table);
			}
		}
	}
	
	void supprimerMaterielDefectueuxAgence(Agence a)
	{
		/*for(Empruntable e_table : a.listeMateriel())
		{
			if(e_table.isDefectueux())
			{
				a.perdreMateriel(e_table);
			}
		}*/
		Empruntable e_table1;
		for(int i=0; i<a.listeMateriel().size();i++)
		{
			e_table1 = a.listeMateriel().get(i);
			if(e_table1.isDefectueux())
			{
				a.perdreMateriel(e_table1);
			}
		}
		
		
	}
	
	void supprimerMaterielDefectueuxDe(Emprunteur e_teur)
	{
		for(Empruntable e_table : e_teur.listeMateriel())
		{
			if(e_table.isDefectueux())
			{
				e_teur.perdreMateriel(e_table);
			}
		}
	}
	
	

}
