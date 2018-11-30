package talarmin.cecile.com.fr.tpnote;

import java.util.*;

public class Emprunteur {
	private List<Empruntable> stock;
	
	Emprunteur()
	{
		this.stock = new ArrayList<Empruntable>();
	}

	public List<Empruntable> listeMateriel() {
		return stock;
	}

	public void setStock(List<Empruntable> stock) {
		this.stock = stock;
	}
	
	public void ajouterAuStock(Empruntable e)
	{
		stock.add(e);
	}
	public boolean perdreMateriel(Empruntable e)
	{
		return this.stock.remove(e);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
