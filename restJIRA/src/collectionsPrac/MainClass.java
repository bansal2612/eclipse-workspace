package collectionsPrac;

import java.util.ArrayList;
import java.util.Collections;

import org.testng.annotations.Test;

public class MainClass {
	int i=0;
	float f=45;
	double d=49.0;
	@Test
	public void test()
	{
		StringBuffer sb1 = new StringBuffer("Amit");
		  StringBuffer sb2 = new StringBuffer("Amit");
		  String ss1 = "Amit";
		  System.out.println(sb1==sb2);
		  System.out.println(sb1.equals(sb2));
		  System.out.println(sb1.equals(ss1));
		  System.out.println("Poddar".substring(3)); 
	}
	/*
	 * public static void main(String[] args) { ArrayListPrac obj=new
	 * ArrayListPrac("Test", 33, 'a'); ArrayListPrac obj1=new ArrayListPrac("Test1",
	 * 3, 'a'); ArrayListPrac obj2=new ArrayListPrac("Tester", 334, 'a');
	 * ArrayList<ArrayListPrac> arr=(ArrayList<ArrayListPrac>)
	 * Collections.synchronizedList(new ArrayList<ArrayListPrac>()); arr.add(obj);
	 * arr.add(obj1); arr.add(obj2); IntCompare obj3=new IntCompare();
	 * 
	 * Collections.sort(arr,Collections.reverseOrder());
	 * 
	 * for (ArrayListPrac arrayListPrac : arr) {
	 * System.out.println(arrayListPrac.getS() + " " + arrayListPrac.getI() + " " +
	 * arrayListPrac.getC()); } }
	 */
}
