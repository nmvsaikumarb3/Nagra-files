package openclose;

public class classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		management m1=new management();
		school sc=new student("sai",1,"ECE");
		m1.checkup(sc);
		
		management m2=new management();
		school sc1=new teacher("mukesh",2,"ECE");
		m2.checkup(sc1);

	}

}
