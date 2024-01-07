package CodingInterview;

public class PrintPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPrime;
		
		for ( int i=3; i<=100; i++)
		{
			isPrime = checkPrime(i);
			
			if (isPrime)
			{
				System.out.println(i);
			}
		}

	}
	public static boolean checkPrime (int n)
	{
		int p;
		for(int i=2; i<=n/2;i++)
		{
			p=n%i;
			if (p == 0)
			{
				return false;
			}
		}
		return true;
		
	}

}
