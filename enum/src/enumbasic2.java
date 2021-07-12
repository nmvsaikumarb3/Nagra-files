
enum colour
	{
		RED,GREEN,BLUE,YELLOW;
	static int price=5;
	public static int getprice()
	{
		return price;
	}
		
	}
/*it is the internal process 
 * class colour{
	static final colour RED=new colour();
	static final colour GREEN=new colour();
	static final colour BLUE=new colour();
	
}*/
public class enumbasic2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(colour.getprice());
		System.out.println(colour.price);
		colour c1=colour.RED;
		switch(c1)
		{
		case RED:
			System.out.println("shades of relationship");
			break;
		case GREEN:
			System.out.println("nature love");
			break;
		case BLUE:
			System.out.println("depth ocean");
			break;
		case YELLOW:
			System.out.println("party time");
			break;
		
		}

	}

}
