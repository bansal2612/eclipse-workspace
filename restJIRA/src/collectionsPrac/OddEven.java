package collectionsPrac;

public class OddEven {
	public void getEvenOdd(long n)
	{
		boolean flag=true;
		for(long i=0;i<n;i++)
		{
			flag= !flag;
		}
		if(flag==true)
			System.out.println("Number is even");
		else
	        System.out.println("Number is odd");
	}
	public void getEvenOddMult(int n)
	{
		int quot=n/2;
		if(quot*2==n)
		{
			System.out.println("number is even");
		}
		else
			System.out.println("Number is odd");
	}
	public static void main(String[] args) {
		new OddEven().getEvenOddMult(22);
	}

}
