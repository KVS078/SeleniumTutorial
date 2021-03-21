package testNGframework;

import org.testng.annotations.Test;

public class tossCricket {
	
	@Test(enabled=true)
	public void tossing()
	{
		System.out.println("Toss has been put");
	}
	
	@Test(dependsOnMethods = "tossing")
	public void startplaying()
	{
		System.out.println("Play has started");
	}
	
	@Test(dependsOnMethods = "startplaying")
	public void batting()
	{
		System.out.println("Batting");
	}
	
	@Test(dependsOnMethods = "batting")
	public void bowling()
	{
		System.out.println("Bowling");
	}
	
}
