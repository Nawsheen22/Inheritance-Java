
public class Panda1 extends Panda {
	
	String name;
	String colour;
	String origin;
	
	
	@Override
	void print(String Name , String colour , String origin) {
		 this.name= Name;
		 this.colour=colour;
		 this.origin=origin;
		 
		 System.out.println("Name of the Panda:"+name);
		 System.out.println("Colour of the Panda:"+colour);
		 System.out.println("Origin of the Panda:"+origin);
		

}
}