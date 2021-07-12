package singleton;

public class singletonclass {

	public static void main(String[] args) {
		sai obj=sai.getinstance();
		sai obj1=sai.getinstance();
		
		

	}

}
class sai
{
	static sai s1=new sai();
	private sai()
	{
		
	}

	public static sai getinstance()
	{
		System.out.println("hiii");
		return s1;
	}
}
