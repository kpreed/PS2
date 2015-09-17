package MainPackage;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

public class MyIntegerTest 
{
	private static MyInteger myIntEven;
	private static MyInteger myIntOdd;
	private int even = 2;
	private int odd = 3;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		//Initialize MyInteger objects
		myIntEven = new MyInteger(2);
		myIntOdd = new MyInteger(3);
	}

	@Test
	public void testEven() 
	{
		//Test all of the methods that use myIntEven
		assertTrue(myIntEven.getValue() == 2);
		assertTrue(myIntEven.isEven() == true);
		assertFalse(myIntEven.isOdd() == true);
		assertTrue(MyInteger.isEven(myIntEven) == true);
		assertFalse(MyInteger.isOdd(myIntEven) == true);
		assertTrue(myIntEven.equals(2));
		assertFalse(myIntEven.equals(3));
		assertTrue(myIntEven.equals(myIntEven));
		assertFalse(myIntEven.equals(myIntOdd));
	}
	
	@Test
	public void testOdd()
	{
		//Test methods using myIntOdd that weren't tested before
		assertFalse(myIntOdd.isEven() == true);
		assertTrue(myIntOdd.isOdd() == true);
		assertTrue(MyInteger.isOdd(myIntOdd) == true);
		assertFalse(MyInteger.isEven(myIntOdd) == true);
	}
	
	@Test
	public void testStatic()
	{
		//Test the static methods that weren't tested previously (not including the isPrime() method)
		assertTrue(MyInteger.isEven(even) == true);
		assertFalse(MyInteger.isOdd(even) == true);
		assertTrue(MyInteger.isOdd(odd) == true);
		assertFalse(MyInteger.isEven(odd) == true);
	}
	
	@Test
	public void testIsPrime()
	{
		//Tests all versions of the isPrime() method
		Integer[] primeArr = new Integer[] {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
		ArrayList<Integer> primes = new ArrayList<Integer>(Arrays.asList(primeArr));
		
		for (Integer i = 0;i <= 100;i++)
		{
			MyInteger num = new MyInteger(i);
			
			if (primes.contains(i))
			{
				assertTrue(MyInteger.isPrime(i)); //static version of isPrime() also tests non-static version
				assertTrue(MyInteger.isPrime(num));
			}
			
			else
			{
				assertFalse(MyInteger.isPrime(i));
				assertFalse(MyInteger.isPrime(num));
			}
		}
	}
	
	@Test
	public void testParse()
	{
		//Tests both parseInt methods
		String num = "4156";
		assertTrue(MyInteger.parseInt(num) == 4156); //parseInt(String num) also tests parseInt(char[] num)
	}
}
