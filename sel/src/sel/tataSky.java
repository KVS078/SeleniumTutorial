/*Abstract class example*/

package sel;

public class tataSky extends CableTV {

	
	
	public void setTopBox()
	{
		
			System.out.println("Set Top Box of tataSky has to be installed");
		
	}
	
	
	public void channels()
	{
		
			System.out.println("tataSky will  provide 75 channels");
		
	}

	public void price()
	{
		
			System.out.println("Price for tataSky membership is Rs.850");
		
	}
	
	public static void main(String[] args) {
		
		CableTV ct = new tataSky();
		ct.setTopBox();
		ct.channels();
		ct.price();
		/*ct.general();*/

	}

}
