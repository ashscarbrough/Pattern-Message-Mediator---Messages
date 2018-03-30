/*
 * Name: Ash Scarbrough
 * Class: CSCI-C490
 * Semester: Summer II, 2017
 * Assignment: Lab 5, part 2
 */

class MarsColleague extends Colleague
{
	
	public MarsColleague(String n)
	{
		super(n);
	}
	
    public void receive(Colleague originator, String message)
    {
    	System.out.println(this.getName() + " Received " + message + " from " + originator.getName());
    }	
}