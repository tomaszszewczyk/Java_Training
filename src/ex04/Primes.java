package ex04;

public class Primes {
	public static void main(String[] args)
	{
		for(int i = 1; i < 100000; i++)
		{
			Number number = new Number(i);
			if(number.isPrimal())
				System.out.println("Liczba " + number + " jest pierwsza");
			else
				System.out.println("Liczba " + number + " nie jest pierwsza");
		}
	}
}

class Number {
	int val;

	public Number(int aVal) {
		val = aVal;
	}
	
	public boolean isPrimal() {
		for (int i=2; i < val/2+1; i++)
			if(val % i == 0)
				return false;
		return true;
	}
	
	public String toString()
	{
		return "" + val;
	}
}