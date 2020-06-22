package adobeArray;

import org.testng.annotations.Test;

public class LargestNumberInArray {

	
	public void largestNumber()
	{
		int[] a= {1,23,11,23,111,3,11,3};
		int largest1=a[0];
		int largest2=a[1];
		int temp;
		if(largest2>largest1)
		{
			temp=largest1;
			largest1=largest2;
			largest2=temp;
		}
		for(int n=2;n<a.length;n++)
		{
			if(largest1<a[n])
			{
				//temp=largest1;
				
				largest2=largest1;
				largest1=a[n];
			}
			else if(largest2<a[n] && a[n] != largest1)
			{
				largest2=a[n];
				
			}
			
		}
		System.out.println("Largest Numbers are:" + largest1 + " " + largest2);
		
	}
@Test
public void sortArray()
{
	int temp;
int[] a= {1,3,11,2,44,11,22,33};
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println(a[a.length-2]);
}

}
