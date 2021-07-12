package dependencyinversion;

public class frontend implements developer{
	public void writejavafrontend()
	{
		System.out.println("write the java frontend");
		
	}

	@Override
	public void develop() {
		// TODO Auto-generated method stub
		this.writejavafrontend();
		
	}

}
