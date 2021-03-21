/* Interface example*/

package sel;

public class relianceFresh extends billing implements superMarket {

	
	

	@Override
	public void vegetables() {

		System.out.println("Price of Cauliflower is Rs.110 per kg");
		System.out.println("Price of Onion is Rs.200 per kg");

	}

	@Override
	public void fruits() {

		System.out.println("Price of Shimla Apple is Rs.170 per kg");
		System.out.println("Price of Nagpur Orange is Rs.90 per kg");
		
	}

	@Override
	public void amount() {
		
		bill = (quantity*rate);

		
		System.out.println("Bill for this customer is:"+ bill );
		
	}

	@Override
	public void paymentMethod()
	{
		System.out.println("Three payment methods are available to pay the bill:" + ""+ "Digital payments,Debit card, Cash");
	}
	
	public static void main(String[] args) {
		
		relianceFresh rf = new relianceFresh();
		
		rf.vegetables();
		rf.fruits();
		rf.cName();
		rf.paymentMethod();
		rf.amount();
		
	}
	
}
