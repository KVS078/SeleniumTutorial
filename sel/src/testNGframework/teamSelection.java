package testNGframework;

import org.testng.annotations.Test;

public class teamSelection {

	@Test(priority = 2,groups= {"Playing XI"})
	public void player1()
	{
		System.out.println("KL Rahul");
	}
	
	@Test(groups= {"Non-Playing XI"})
	public void player2()
	{
		System.out.println("Rohit Sharma");
	}
	
	@Test(groups= {"Non-Playing XI"})
	public void player3()
	{
		System.out.println("Shikhar Dhawan");
	}
	
	@Test(priority = 3,groups= {"Playing XI"})
	public void player4()
	{
		System.out.println("Ishan Kishan");
	}
		
	@Test(priority = 1,groups= {"Playing XI"})
	public void player5()
	{
		System.out.println("Virat Kohli Capitan");
	}
	
	@Test(priority = 4,groups= {"Playing XI"})
	public void player6()
	{
		System.out.println("Shreyas Iyer");
	}
	
	@Test(priority = 5,groups= {"Playing XI"})
	public void player7()
	{
		System.out.println("Rishabh Pant");
	}
	
	@Test(priority = 6,groups= {"Playing XI"})
	public void player8()
	{
		System.out.println("Surya Kumar Yadav");
	}
	
	@Test(priority = 7,groups= {"Playing XI"})
	public void player9()
	{
		System.out.println("Hardik Pandya");
	}
	
	@Test(priority = 8,groups= {"Playing XI"})
	public void player10()
	{
		System.out.println("Bhuvaneswar Kumar");
	}
	
	@Test(priority = 9,groups= {"Playing XI"})
	public void player11()
	{
		System.out.println("Shardul Thakur");
	}
	
	@Test(priority = 10,groups= {"Playing XI"})
	public void player12()
	{
		System.out.println("Washington Sundar");
	}
	
	@Test(groups= {"Non-Playing XI"})
	public void player13()
	{
		System.out.println("Axar Patel");
	}
	
	@Test(priority =11,groups= {"Playing XI"})
	public void player14()
	{
		System.out.println("Yuvendra Chalal");
	}
	
	@Test(groups= {"Non-Playing XI"})
	public void player15()
	{
		System.out.println("Navdeep Saini");
	}
	
	@Test(groups= {"Non-Playing XI"})
	public void player16()
	{
		System.out.println("Thangarasu Natarajan");
	}
	
	@Test(groups= {"Non-Playing XI"})
	public void player17()
	{
		System.out.println("Varun Chakaravarthy");
	}
	
	@Test(groups= {"Non-Playing XI"})
	public void player18()
	{
		System.out.println("Rahul Tewatia");
	}
}
