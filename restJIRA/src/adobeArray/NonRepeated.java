package adobeArray;

import org.testng.annotations.Test;

public class NonRepeated {
	
	@Test
	public void nonRepeated()
	{
		int x=0;
		int count;
		int[] arr= {1,33,11,2,33,1,3,11,4,55};
		boolean[] flag=new boolean[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(!flag[i])
			{
				count=1;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[j]==arr[i])
					{
						flag[j]=true;
						count++;
					}
				}
				if(count==1)
				{
					System.out.println(arr[i]);
					x++;
					break;
					
				}
				
			}
		}
		if(x==0)
		{
			System.out.println("No one is repeating");
		}
		
	
	}

}
