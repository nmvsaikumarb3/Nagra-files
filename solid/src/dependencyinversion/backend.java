package dependencyinversion;

public class backend implements developer{
	public void writejavabackend()
	{
		System.out.println("write java backend");
	}

	@Override
	public void develop() {
		// TODO Auto-generated method stub
		this.writejavabackend();
		
	}

}
