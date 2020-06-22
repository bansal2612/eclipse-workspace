package string;

import org.testng.annotations.Test;

public class StringPrac {

	
	//@Test
	public void stringPrac(String s,String substring)
	{
		String[] arr=s.split(" ");
		//System.out.println(arr.length);
		for(int i=arr.length-1;i>=0;i--)
		{
			//System.out.println(arr[i]);
			if(arr[i].equals(substring))
			{
				System.out.println("Index is:" + i);
				break;
			}
		}
		
	}
	public static void main(String[] args) {
	new StringPrac().stringPrac("Hi this is Hi This", "Hi");
	}}
