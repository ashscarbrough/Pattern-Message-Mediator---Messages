/*
 * Name: Ash Scarbrough
 * Class: CSCI-C490
 * Semester: Summer II, 2017
 * Assignment: Lab 5, part 2
 */

abstract class Colleague
{
	private static Mediator mediator = null;
	private String name;

	public Colleague(String nomen)
	{
		this.name = nomen;
		mediator = getMediator();
		mediator.addColleague(this);
	}
	
	public void send(String message)
	{
	   mediator.send(this, message);
	}
	
	public Mediator getMediator()
	{
		if (mediator == null)
			mediator = new ApplicationMediator();
		
		return mediator;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void removeMe()
	{
		mediator.removeColleague(this); 	// Removes object from colleague list
	}

    public abstract void receive(Colleague originator, String message);		
}