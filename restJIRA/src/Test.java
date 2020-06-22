import java.util.ArrayList;

public class Test implements csl,csl2{
	int i;
	int j;
	Test()
	{
		i=1;
		j=2;
	}
	
public static void main(String[] args) {
Test obj=new Test();
obj.cal(2);

}

@Override
public void cal(int item) {
	// TODO Auto-generated method stub
	System.out.println("test");
}
}
