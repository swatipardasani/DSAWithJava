package com.dsawithjava.arrays;

/*
 * Author : Swati Pardasani
 * Date : 04/12/2020
 * 
 * Arrays are non-primitive datatypes(a Data Structure as well) in Java which are collection of datatypes of similar kind.
 */

public class BasicArrayExample
{
	/* Only Declaration */
	private static int[] lucky_numbersarray = new int[5];
	
	/* Declaration + Instatntiation */
	private static String[] lucky_folksarray = { "Anjali" , "Rahul" , "Tina", "Sameer"}  ;
	
	/* Getters & Setters */
	public static void setLuckyNumbers(int[] value)
	{
		lucky_numbersarray = value ;
		
	}
	
	public static int getLuckyNumbers()
	{
		int index = 0;
		/* Iterating Over Integer type array */
		for(int luckyno : lucky_numbersarray)
		{
		System.out.println("Lucky Number " + index + "=" +  luckyno)  ;
		
		/* Output
		 *  Lucky Number 0=5
		 *  Lucky Number 1=10
		 *	Lucky Number 2=15
		 *	Lucky Number 3=20
		 *	Lucky Number 4=25
		 *	Lucky Number 5=30
		 */
		
		index++ ;
		}
		
		return lucky_numbersarray.length;
	}
	
	public static int getLuckyFolks()
	{
		int index  = 0;
		/* Iterating Over String array */
		for(String luckyfolk : lucky_folksarray)
		{
		System.out.println("Lucky Folk " + index + "=" + luckyfolk);
		
		/* Output
		 *	Lucky Folk 0=Anjali
		 *	Lucky Folk 1=Rahul
		 *	Lucky Folk 2=Tina
		 *	Lucky Folk 3=Sameer
		 */
		
		index++;
		}
		return lucky_folksarray.length;
		
	}
	
	public static void main(String[] args)
	{
		int length = 0;
		/* Lucky Numbers */
		setLuckyNumbers(new int[]{5 , 10 , 15, 20, 25, 30});
		length = getLuckyNumbers();
		System.out.println("Total Lucky Numbers are " + length);
		
		/* Output
		 * Total Lucky Numbers are 6
		 */
		
		/* Lucky Folks */
		length = 0 ;
		length = getLuckyFolks();
		System.out.println("Total Lucky Folks are " + length);
		
		/*Output
		 * Total Lucky Folks are 4
		 */
	}
}
