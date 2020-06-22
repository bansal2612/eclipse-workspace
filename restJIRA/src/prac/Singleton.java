package prac;

public class Singleton {
	public static Singleton single_obj=null;
	public String s;
	private Singleton() {
		// TODO Auto-generated constructor stub
		s="Hi This is first value";
	}
	public static Singleton  getInst()
	{
		if(single_obj==null)
		{
			single_obj=new Singleton();
			return single_obj;
		}
		return single_obj;
	}

	
}
