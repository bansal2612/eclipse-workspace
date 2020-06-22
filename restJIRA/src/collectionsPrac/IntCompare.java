package collectionsPrac;

import java.util.Comparator;

public class IntCompare implements Comparator<ArrayListPrac>{

	@Override
	public int compare(ArrayListPrac o1, ArrayListPrac o2) {
		// TODO Auto-generated method stub
		if(o1.getI()>o2.getI()) return 1;
		else if (o1.getI()<o2.getI()) return -1;
		else return 0;
	}

}
