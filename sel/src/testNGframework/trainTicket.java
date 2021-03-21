package testNGframework;

import org.testng.annotations.Test;

public class trainTicket {
	
	@Test(priority=1)
	public void Tadkal()
	{
		System.out.println("I have booked ticket in tadkal");
	}
	
	@Test(priority=2)
	public void Confirmed()
	{
		System.out.println("I have booked ticket in confirmed");
	}
	
	@Test(priority=3,enabled=false)
	public void WaitingList1()
	{
		System.out.println("I have waiting to get reservation in WL1");
	}
	
	@Test(priority=4)
	public void WaitingList2()
	{
		System.out.println("I have waiting to get reservation in WL2");
	}

}
