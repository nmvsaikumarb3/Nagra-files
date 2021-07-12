package abstractfactory;

public class marvelhero extends hollywoodheros {
	
	@Override
	public superhero gethero(String herotype)
	{
		superhero hero=null;
		if(herotype.equals("ironman"))
		{
			hero=new ironman();
		}
		else if(herotype.equals("captainamerica"))
		{
			hero=new captainamerica();
		}
		else if(herotype.equals("thor"))
		{
			hero=new thor();
		}
		return hero;
	}

}
