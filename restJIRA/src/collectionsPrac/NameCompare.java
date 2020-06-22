package collectionsPrac;

import java.util.Comparator;

public class NameCompare implements Comparator<ArrayListPrac>{


@Override
public int compare(ArrayListPrac a1, ArrayListPrac a2) {
	// TODO Auto-generated method stub
	return a1.getS().compareTo(a2.getS());	
}
}
