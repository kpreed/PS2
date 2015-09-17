package MainPackage;

public class MyInteger 
{
	//Attributes
	private int value;
	
	//Constructor
	public MyInteger(int value)
	{
		this.setValue(value);
	}
	
	//Getter
	public int getValue()
	{
		return this.value;
	}
	
	//Setter
	private void setValue(int value)
	{
		this.value = value;
	}
	
	//These methods check to see if an integer is even
	public boolean isEven()
	{
		return (this.getValue() % 2 == 0);
	}
	
	public static boolean isEven(int num)
	{
		MyInteger value = new MyInteger(num);
		return value.isEven();
	}
	
	public static boolean isEven(MyInteger num)
	{
		return num.isEven();
	}
	
	//These methods check to see if an integer is odd
	public boolean isOdd() //Tested
	{
		return (this.getValue() % 2 != 0);
	}
	
	public static boolean isOdd(int num)
	{
		MyInteger value = new MyInteger(num);
		return value.isOdd();
	}
	
	public static boolean isOdd(MyInteger num)
	{
		return num.isOdd();
	}
	
	//These methods check to see if an integer is prime (positive or negative)
	public boolean isPrime()
	{
		if (Math.abs(this.getValue()) == 1 || this.getValue() == 0)
			return false;
		else
		{
			double stop = Math.sqrt(Math.abs(this.getValue()));
			for (int i = 2;i <= stop;i++)
			{
				if (this.getValue() % i == 0)
					return false;
			}
			return true;
		}		
	}
	
	public static boolean isPrime(int num)
	{
		MyInteger value = new MyInteger(num);
		return value.isPrime();
	}

	public static boolean isPrime(MyInteger num)
	{
		return num.isPrime();
	}
	
	//Checks to see if the value attribute is equal to a given integer
	public boolean equals(int num)
	{
		return (this.getValue() == num);
	}
	
	//Checks to see if the value attribute is equal to the value attribute of another MyInteger object
	public boolean equals(MyInteger num)
	{
		return (this.getValue() == num.getValue());
	}
	
	//Converts and array of numeric char's into an integer and returns the integer
	public static int parseInt(char[] num)
	{
		int length = num.length;
		int out = 0;
		for (int i = 0;i < length;i++)
		{
			String x = "" + num[i];
			out += Integer.parseInt(x)*Math.pow(10, length - i - 1);
		}
		return out;
	}
	
	//Converts a string into an integer and returns the integer
	public static int parseInt(String num)
	{
		char[] input = num.toCharArray();
		return parseInt(input);
	}
}
