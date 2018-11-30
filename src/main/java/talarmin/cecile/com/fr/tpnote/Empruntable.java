package talarmin.cecile.com.fr.tpnote;

public class Empruntable {
	
	private boolean limitationPretAuxAgences;
	private boolean defectueux;
	
	Empruntable()
	{
		this.defectueux = false;
		this.limitationPretAuxAgences = false;
	}
	
	public void declarerDefectueux()
	{
		this.defectueux = true;
	}

	public boolean isLimitationPretAuxAgences() {
		return limitationPretAuxAgences;
	}

	public void setLimitationPretAuxAgences(boolean limitationPretAuxAgences) {
		this.limitationPretAuxAgences = limitationPretAuxAgences;
	}

	public boolean isDefectueux() {
		return defectueux;
	} 
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
