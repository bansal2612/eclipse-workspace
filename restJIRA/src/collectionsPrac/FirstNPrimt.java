package collectionsPrac;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class FirstNPrimt {
	//First Method
	public char findFirstNonRepeated(String s)
	{
		char[] ch=s.toCharArray();
		Map<Character, Integer> m=new LinkedHashMap<Character, Integer>(s.length());
		for (char c : ch) {
			m.put(c, m.containsKey(c)? m.get(c) +1 :1);
			
		}
		for(Entry<Character, Integer> ent:m.entrySet())
		{
			if(ent.getValue()==1)
			{
				return ent.getKey();
			}
		}
		for(Entry<Character, Integer> ent:m.entrySet())
		{
			
		}
		
        throw new RuntimeException("Not getting character");
	}
	public static void main(String[] args) {
		FirstNPrimt obj=new FirstNPrimt();
		//System.out.println(obj.findFirstNonRepeated("helloworld"));
		obj.getCharUnique("");
	}
	
	//Second Method
	public void getCharUnique(String s)
	{
		Set<Character> repeating=new HashSet<Character>();
		List<Character> nonrepeating=new ArrayList<Character>();
		
		for(int i=0;i<s.length();i++)
		{
		if(repeating.contains(s.charAt(i)))
		{
			continue;
		}
		if(nonrepeating.contains(s.charAt(i)))
		{
			nonrepeating.remove((Character)s.charAt(i));
			repeating.add(s.charAt(i));
			
		}
		else
			nonrepeating.add(s.charAt(i));
		}
		System.out.println("First Char is: " + nonrepeating.get(0));
	}
	//Third Meth

}
