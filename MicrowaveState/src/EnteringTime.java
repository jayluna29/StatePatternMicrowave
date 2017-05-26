public class EnteringTime extends MicrowaveState
{
	//one and only instance
	private static EnteringTime instance = null;

	private String time = "";

	//private constructor
	private EnteringTime()
	{
	}

	//singleton get instance
	public static EnteringTime getInstance()
	{
		if(instance == null)
		{
			instance = new EnteringTime();
		}

		return instance;
	}

	//handle these events in this state
	public void number(Microwave m, int num)
	{
		System.out.println("In ENTERINGTIME");
		System.out.println("Handling number");

		//append the number to the string
		time += num;

		//display the new time
		System.out.println("New time: " + time);
	}
	public void start(Microwave m)
	{
		//print current state, event and next state
		System.out.println("In ENTERINGTIME");
		System.out.println("Handling start");

		time = "";

		//change state
		m.changeState(Cooking.getInstance());


		System.out.println("Transition to COOKING");
	}
	public void cancel(Microwave m)
	{
		//print current state, event and next state
		System.out.println("In ENTERINGTIME");
		System.out.println("Handling cancel");

		time = "";

		//change state
		m.changeState(Idle.getInstance());

		System.out.println("Transition to IDLE");
	}
}