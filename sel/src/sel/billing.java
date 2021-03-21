/* Interface example*/

package sel;

public abstract class billing {

	int bill,quantity=2;
	int rate=12;
	String customerName="Venkat";
	
	public abstract void paymentMethod();
	public abstract void amount();

	
	public void cName()
	{
		System.out.println("Cutomer Name is :"+ " "+ customerName);
	}
	

}
