package collectionsPrac;


import org.testng.annotations.Test;

public class ArrayListPrac implements Comparable<ArrayListPrac> {
	
	public String s;
	public int i;
	public char c;
	public  ArrayListPrac(String s,int i, char c)
	{
		this.s=s;
		this.i=i;
		this.c=c;
			
	}
	@Override
	public int compareTo(ArrayListPrac o) {
		// TODO Auto-generated method stub
		return this.i-o.i;
		//return 0;
	}
	
	public char getC() {
		return c;
	}public int getI() {
		return i;
	}public String getS() {
		return s;
	}
	w

}
