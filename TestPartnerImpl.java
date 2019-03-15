/*Test de PartnerImpl*/


public class TestPartnerImpl {
	
	public static void main (String[] args) {
		PartnerImpl p = new PartnerImpl();
		PartnerImpl p2 = new PartnerImpl("Pepe",100, 18, 'H', Sport.RUGBY);
		PartnerImpl p3 = new PartnerImpl();
		PartnerImpl p4 = new PartnerImpl();
		
		/*Orden de los parametros del constructor de parametros: 
		 * String surnameName, double fee, int age, char gender, Sport sport*/
		 System.out.println(p.toString());
		 System.out.println(p2.toString());
		 System.out.println(p3.toString());
		 System.out.println(p4.toString());
		 
		 try{
		 p.setFee(50);
		 p.setAge(7);
		 p.setSport(Sport.CRICKET);
		 p2.setAge(17);
		}catch (ExceptionPartner error) {System.out.println("Error");}
		 System.out.println(p2.toString());
		 System.out.println(p.toString());
		 
		
	}
}

