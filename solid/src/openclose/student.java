package openclose;

public class student extends school {

	public student(String name, int id, String department) {
		super(name, id, department);
		// TODO Auto-generated constructor stub
		System.out.println("student performance");
	}
	//students duties
		private void readbooks()
		{
			System.out.println("preparing for his semister exams");
		}
		private void writeexam()
		{
			System.out.println("writing the semister exam");
		}
		private void play()
		{
			System.out.println("playing cricket");
		}
		@Override
		public void performduty() {
			// TODO Auto-generated method stub
			readbooks();
			writeexam();
			play();
			
		}
	
	

}
