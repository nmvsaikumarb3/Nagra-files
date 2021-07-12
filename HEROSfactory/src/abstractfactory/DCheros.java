package abstractfactory;

public class DCheros extends hollywoodheros {

	@Override
	public superhero gethero(String herotype) {
		// TODO Auto-generated method stub
		superhero hero=null;
		if(herotype.equals("superman"))
		{
			hero=new superman();
			
		}
		else if(herotype.equals("batman"))
		{
			hero=new batman();
		}
		else if(herotype.equals("wondewomen"))
		{
			hero=new wonderwomen();
		}
		return hero;
	}
	

}
