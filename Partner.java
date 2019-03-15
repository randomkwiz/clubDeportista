/* Interface de Partner  */


public interface Partner {
	//getters
   	public String getSurnameName ();
   	public double getFee();
   	public int getAge();
   	public char getGender();
   	public Sport getSport();
   	public int getNumPartner();
   	public double getRelevance();
   
   	//setters
   	public void setFee (double fee);
   	public void setAge(int age) throws ExceptionPartner;
   	public void setSport(Sport sport);

}

