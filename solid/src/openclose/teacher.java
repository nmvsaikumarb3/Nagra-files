package openclose;

public class teacher extends school{

	public teacher(String name, int id, String department) {
		super(name, id, department);
		// TODO Auto-generated constructor stub
		System.out.println("teacher performance");
	}
		private void teaching()
		{
			System.out.println("teaching the chapters");
		}
		private void correction()
		{
			System.out.println("correcting the papers");
		}
		@Override
		public void performduty() {
			// TODO Auto-generated method stub
			teaching();
			correction();	
			
		}

}
