/*Abstract class example*/

package sel;

public class SCV extends CableTV {

	
	
	public void setTopBox()
	{
		
			System.out.println("Set Top Box of SCV has to be installed");
		
	}
	
	
	public void channels()
	{
		
			System.out.println("SCV will  provide 100 channels");
		
	}

	public void price()
	{
		
			System.out.println("Price for SCV membership is Rs.1000");
		
	}
	
	public static void main(String[] args) {
		
		CableTV ct = new SCV();
		ct.setTopBox();
		ct.channels();
		ct.price();
		ct.general();

	}

}
