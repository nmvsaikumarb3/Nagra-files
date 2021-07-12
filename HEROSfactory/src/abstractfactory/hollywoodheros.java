package abstractfactory;

public abstract class hollywoodheros {
	public abstract superhero gethero(String herotype);
	
	public static hollywoodheros gethollywoodhero(String starherotype)
	{
	hollywoodheros starhero=null;
	if(starherotype.equals("marvel"))
	{
		starhero=new marvelhero();
	}
	else
	{
		starhero=new DCheros();
	}
	return starhero;
	
	
	

}
}
