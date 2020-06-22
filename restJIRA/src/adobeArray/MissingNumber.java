package adobeArray;

import org.testng.annotations.Test;

public class MissingNumber {
	//@Test
	public void findMissingNumber()
	{
		int[] arr= {1,2,3,4,5,6,8,2,1,8,10};
		int[] reg=new int[arr.length];
		for(int i:arr)
		{
			reg[i]=1;
		}
		for(int i=0;i<reg.length;i++)
		{
			if(reg[i]==0)
			{
				System.out.println(i);
			}
			
		}
			
		
	}
	//@Test
	public void findMissing()
	{
		int[] arr= {1,3,4,5,6,7,8,9,10};
		int sum=(arr.length+1)*(arr.length+2)/2;
		for(int i=0;i<arr.length;i++)
		{
			sum-=arr[i];
			
		}
		System.out.println(sum);
		
	}
	//@Test
	public void findMul()
	{
		int[] arr= {1,23,1,33,45,5,11,4,111,67,-1,-200};
		int mul, largestmul;
		int diff,largestdiff=0,index1=0,index2=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				diff=Math.abs(arr[i]-arr[j]);
						if(diff>largestdiff)
						{
							largestdiff=diff;
							index1=i;
							index2=j;
						}
				
			}
			
		}
		System.out.println("Largest diff is :" + largestdiff);
		System.out.println("Numbers are:" + arr[index1] + " And " + arr[index2]);
		
	}
	//@Test
	public void findMull()
	{
		
		int posa=0,posb=0,nega=0,negb=0;
		int[] arr= {1,2,33,11,22,1,-44,-67,11,-99};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>posa )
			{
				posb=posa;
				posa=arr[i];
				
			}
			else if (arr[i]>posa ) {
				{
					posb=arr[i];
					System.out.println("posb");
				}
			if(arr[i] < 0 && Math.abs(arr[i]) > 
            Math.abs(nega))
			{
				
				negb=nega;
				nega=arr[i];
				System.out.println("nega");
			}
			else if (arr[i]<0 && Math.abs(arr[i]) > Math.abs(negb)) {
				negb=arr[i];
				System.out.println("negb");
			}
				
			}
		}
		if(posa*posb>nega*negb)
		{
			System.out.println(posa*posb);
		}
		else
			System.out.println(nega*negb);
	}
	
	 static void maxProduct(int arr[], int n) 
	    { 
	        if (n < 2) 
	        { 
	            System.out.println("No pairs exists"); 
	            return; 
	        } 
	       
	        if (n == 2) 
	        { 
	            System.out.println(arr[0] + " " + arr[1]); 
	            return; 
	        } 
	       
	        // Iniitialize maximum and second maximum 
	        int posa = Integer.MIN_VALUE, 
	            posb = Integer.MIN_VALUE; 
	       
	        // Iniitialize minimum and second minimum 
	        int nega = Integer.MIN_VALUE,  
	            negb = Integer.MIN_VALUE; 
	       
	        // Traverse given array 
	        for (int i = 0; i < n; i++) 
	        { 
	            // Update maximum and second maximum 
	            // if needed 
	            if (arr[i] > posa) 
	            { 
	                posb = posa; 
	                posa = arr[i]; 
	            } 
	            else if (arr[i] > posb) 
	                posb = arr[i]; 
	       
	            // Update minimum and second minimum  
	            // if needed 
	            if (arr[i] < 0 && Math.abs(arr[i]) > 
	                       Math.abs(nega)) 
	            { 
	                negb = nega; 
	                nega = arr[i]; 
	            } 
	            else if(arr[i] < 0 && Math.abs(arr[i])  
	                       > Math.abs(negb)) 
	                negb = arr[i]; 
	        } 
	       
	        if (nega * negb > posa * posb) 
	            System.out.println("Max product pair is {" 
	                          + nega + ", " + negb + "}"); 
	        else
	            System.out.println("Max product pair is {" 
	                          + posa + ", " + posb + "}"); 
	    } 
	      
	 public static void main(String[] args) {
		int[] arr= {1,2,33,11,22,1,-44,-67,11,-99,-188};
		int n=arr.length;
		maxProduct(arr, n);
	}

}
