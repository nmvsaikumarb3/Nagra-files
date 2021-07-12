package abstractfactory;

public class viewers {

	public static void main(String[] args) {

		superhero hero = null;
		hollywoodheros hollywoodhero = null;
		String power = null;

		// Get Factory object by passing the factory type
		hollywoodhero = hollywoodheros.gethollywoodhero("marvel");

		System.out.println("hero hero type : " + hollywoodhero.getClass().getName());
		
		System.out.println();

		// Get hero object by passing the hero type
		hero = hollywoodhero.gethero("ironman");
		System.out.println("hero Type : "+hero.getClass().getName());
		power = hero.powers();
		System.out.println(" powers : "+power);
		
		System.out.println();

		hero = hollywoodhero.gethero("captainamerica");
		System.out.println("hero Type : "+hero.getClass().getName());
		power = hero.powers();
		System.out.println("powers : "+power);
		
		hero = hollywoodhero.gethero("thor");
		System.out.println("hero Type : "+hero.getClass().getName());
		power = hero.powers();
		System.out.println("powers : "+power);

		System.out.println("---------------------------------------------------------");
		// Get Factory by passing the factory type
		
		
		hollywoodhero = hollywoodhero.gethollywoodhero("Dc");

		System.out.println("hero hero type : " + hollywoodhero.getClass().getName());
		System.out.println();

		// Get hero object by passing the hero type
		hero = hollywoodhero.gethero("superman");
		System.out.println("hero Type : "+hero.getClass().getName());
		power = hero.powers();
		System.out.println(" powers : "+power);
		
		System.out.println();

		hero = hollywoodhero.gethero("batman");
		System.out.println("hero Type : "+hero.getClass().getName());
		power = hero.powers();
		System.out.println(" powers : "+power);

		System.out.println();
		
		try{
		hero = hollywoodhero.gethero("wonderwomen");
		System.out.println("hero Type : "+hero.getClass().getName());
		power = hero.powers();
		System.out.println(" powers : "+power);
		}
		catch(Exception e)
		{
			System.out.println("hero type : wonderwomen");
			System.out.println("powers : smart");
			
		}


}
}
