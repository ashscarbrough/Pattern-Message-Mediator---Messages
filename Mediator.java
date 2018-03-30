
interface Mediator
{
	public void send(Colleague colleague, String message);
	public void addColleague(Colleague colleague);
	public void removeColleague(Colleague colleague);
}