package apparatus.module;

import com.volmit.apparatus.module.ApparatusModule;

public class ExampleModule extends ApparatusModule
{
	public void onEnable()
	{
		l("Hello World! I'm Enabled!");
		l("This is INFO");
		w("This is a WARNING");
		f("This is FATAL");
	}

	public void onDisable()
	{
		l("Goodbye!");
	}

	public void onTick()
	{
		// TODO Auto-generated method stub

	}
}
