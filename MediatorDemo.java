

public class MediatorDemo
{
	public static void main(String[] args) 
	{

		OnsiteColleague onsite = new OnsiteColleague("Linda"); 
		MobileColleague mobile = new MobileColleague("Sam"); 
		MarsColleague mars = new MarsColleague("Nova"); 
		
		System.out.println("First Test:");
     	onsite.send("Hello World!"); 
		mobile.send("Way to Go!"); 

		System.out.println("\nSecond Test:");
		onsite.removeMe();
		mars.send("Double thumbs!");
  }
}