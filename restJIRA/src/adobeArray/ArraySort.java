package adobeArray;

import java.util.HashSet;

import org.testng.annotations.Test;

public class ArraySort {
	
	public boolean sortArray(int arr_size,int[] arr,int sum)
	{
		
		for(int i=0;i<arr_size-2;i++)
		{
			int current_sum=sum-arr[i];
			HashSet<Integer> hs=new HashSet<Integer>();
			for(int j=i+1;j<arr_size;j++)
			{
				if(hs.contains(current_sum-arr[j]) && current_sum-arr[j] != (int)hs.toArray()[hs.size()-1])
				{
					System.out.printf("Triplet is %d, %d, %d",arr[i],arr[j], current_sum-arr[j]);
					return true;
				}
				hs.add(arr[j]);
				
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		int[] arr={1,23,11,22,11,2}; 
		new ArraySort().sortArray(6, arr ,26);
	}

}
