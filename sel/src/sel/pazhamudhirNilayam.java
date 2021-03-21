/* Interface example*/

package sel;

public class pazhamudhirNilayam extends billing implements superMarket {

	
	@Override
	public void vegetables() {

		System.out.println("Price of Tomato is Rs.125 per kg");
		System.out.println("Price of Carrot is Rs.165 per kg");

	}

	@Override
	public void fruits() {

		System.out.println("Price of Fig is Rs.148 per kg");
		System.out.println("Price of Guava is Rs.56 per kg");
		
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
		
		pazhamudhirNilayam pn = new pazhamudhirNilayam();
		
		pn.vegetables();
		pn.fruits();
		pn.cName();
		pn.paymentMethod();
		pn.amount();
		
	}

}
