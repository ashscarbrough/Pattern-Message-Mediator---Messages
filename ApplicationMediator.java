/*
 * Name: Ash Scarbrough
 * Class: CSCI-C490
 * Semester: Summer II, 2017
 * Assignment: Lab 5, part 2
 */

import java.util.ArrayList;

class ApplicationMediator implements Mediator
{
	private static ArrayList<Colleague> colleagues;

    public ApplicationMediator()
    {
    	colleagues = new ArrayList<Colleague>();
    } 

    public void addColleague(Colleague colleague)
    {
    	colleagues.add(colleague);	// Addition of Colleague to Array List
    }
    
    public void removeColleague(Colleague colleague)
    {
    	colleagues.remove(colleague);	// Removal of Colleague from Array List
    }

	public void send(Colleague originator, String message)	
	{
		for(int i=0; i<colleagues.size(); i++)
		{
			Colleague col = colleagues.get(i);
			if(col != originator)
			{
				col.receive(originator, message);
			}
		}
	}
}