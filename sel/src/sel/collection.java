package sel;

import java.util.ArrayList;
import java.util.List;

public class collection {
	
	public void variantsOfHondaCar()
	{
		List  <String> al = new ArrayList<String> ();
		
		al.add("Honda City");
		al.add("Honda Civic");
		al.add("Honda Amaze");
		al.add("Honda Jazz");
		al.add("Honda Brio");
		al.add("Honda City");
		al.add("Honda Accord");
		System.out.println(al);
		
		List  <String> a2 = new ArrayList<String> ();
		a2.addAll(al);
		System.out.println(a2);
		
		a2.remove(2);
		System.out.println(a2);
		
		a2.remove("Honda City");
		System.out.println(a2);
		
		System.out.println(al.get(1));
		
		System.out.println(al.indexOf("Honda Civic"));
		
		System.out.println(al.indexOf("Honda CRV"));
		
		System.out.println(al.lastIndexOf("Honda City"));
		
		a2.clear();
		System.out.println(a2);

		
	}

	public static void main(String[] args) {

		collection cl = new collection();
		
		cl.variantsOfHondaCar();

	}

}
