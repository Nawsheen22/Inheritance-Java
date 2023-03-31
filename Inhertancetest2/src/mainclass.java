
public class mainclass {

	public static void main(String[] args) {
		panda p = new panda();
		panda1 p1 = new panda1 ();
		panda3 p3 = new panda3 ();
		
		
		p3.print1("Gudetama", "120 KG");
		p3.print2("Black & White", "China");
		p3.print3("Bamboo");
		
		//justifying inheritance
		System.out.println("Testing inheritance extends:");
		System.out.println(p1 instanceof panda);
		System.out.println(p3 instanceof panda);
		System.out.println(p3 instanceof panda1);
		System.out.println(p instanceof panda1);
		System.out.println(p1 instanceof panda3);
		
		

	}

}
