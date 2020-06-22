package prac;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Prac {
	//@Test
	public char firstWord()
	{
		String s="GeeksforGeeks";
		
		HashMap<Character, Integer> hs=new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++)
		{
		if(hs.containsKey(s.charAt(i)))	
		{
			hs.put(s.charAt(i), hs.get(s.charAt(i))+1);
			
		}
		else
		hs.put(s.charAt(i), 1);
		}
		int value=0;
		char key='\0';
		
	for(Entry<Character, Integer> ent : hs.entrySet())	
	{
		if(ent.getValue()>value)
		{
		value=ent.getValue();
		key=ent.getKey();
		}
		
	}
		return key;
		//return value;
	
	}
	
	/*
	 * public static void main(String[] args) { System.out.println(new
	 * Prac().firstWord()); }
	 */
//@Test
public void largest2()
{
int[] arr= {1,22,33,11,22,33,11,2};
int largest1=arr[0];
int largest2=arr[1];
for(int i=2;i<arr.length-1;i++)
{
if(arr[i]>largest1)
{
largest2=largest1;
largest1=arr[i];

}
else if(arr[i]>largest2 && arr[i]!=largest1)
{
largest2=arr[i];	
}

}
System.out.println("Lagrest are"+ largest1 + " " + largest2);
}
//@Test
//To find the odd even
public boolean evenodd(int[] arr,int length,int sum)
{
	for(int i=0;i<length-2;i++)
	{
	int current_sum=sum-arr[i];
	HashSet<Integer> hs=new HashSet<Integer>();
	for(int j=i+1;j<length;j++)
	{
		if(hs.contains(current_sum-arr[j]) && current_sum-arr[j]!=(int)hs.toArray()[hs.size()-1])
		{
			System.out.printf("Triplet is %d, %d, %d", arr[i], arr[j] ,current_sum-arr[j]);
			return true;
		}
	}
	}
	return false;
	}
	/*
	 * public static void main(String[] args) { int[] arr=
	 * {1,2,3,4,5,6,7,8,11,22,33,44,112,1123}; int sum=99; int length=arr.length;
	 * new Prac().evenodd(arr, length, sum);
	 * 
	 * }
	 */

@Test
public void findMissing()
{
int posa=Integer.MIN_VALUE;
int posb=Integer.MIN_VALUE;
int nega=Integer.MIN_VALUE;
int negb=Integer.MIN_VALUE;
int[] arr= {1,2,3,4,1,3,4,1,122,11,22,-9,-19,-11};

for(int i=0;i<arr.length;i++)
{
if(arr[i]>posa)
{
posb=posa;
posa=arr[i];

}
else if (arr[i]>posb) {
	posb=arr[i];
	
}
if(arr[i]<0 && Math.abs(arr[i])>Math.abs(nega))
{
negb=nega;
nega=arr[i];
}
else if (arr[i]<0 && Math.abs(arr[i])>Math.abs(negb)) {
negb=arr[i];	
}
}
if(posa*posb> n)
}

	
}

