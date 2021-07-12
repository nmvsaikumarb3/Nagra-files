package javabuilder;

public class shop {
	public static void main(String[] args)
	{
		phone p1=new phonebuilder().setOs("apple").setRam(8).setBattery(5).getphone();
		System.out.println(p1);
	}

}
