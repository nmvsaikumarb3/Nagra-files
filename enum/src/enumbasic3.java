interface hello
{
	public void sai();
	
}



enum phone implements hello   //here we can implements in enum but not extend class
	{
		MI(8500),SUMSUNG,LAVA(1000);
	
	
	phone()               //zero parameter constructor
	{
		
		System.out.println("hi sai");
		
	}
	
	phone(int p1)            //parameterized constructor
	{
		System.out.println("hiii");
	}
	phone(double p2)            //parameterized constructor
	{
		System.out.println("sai");
		
	}
	static int price;
	public static int getprice()
	{
		return price;
	}
	@Override
	public void sai() {
		// TODO Auto-generated method stub
		System.out.println("helloooo");
		
		
	}
		
	}
public class enumbasic3 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(phone.getprice());
		System.out.println(phone.price);
		System.out.println(phone.SUMSUNG.ordinal()); //ordinal method show the 
		                                              //order of constant
		                                                

		phone c1=phone.MI;
		c1.sai();
		switch(c1)
		{
		case MI:
			System.out.println("popular phone");
			break;
		case SUMSUNG:
			System.out.println("standard phone");
			break;
		case LAVA:
			System.out.println("costly phone");
			break;
		
		}

	}

}
