package com.cia.cia;
import com.cia.cia.getters.*;

public class DevDebugTool
{
	public void Test()
	{
		CIAEngine engine = new CIAEngine();
		DemoGetBatNow batGetter = new DemoGetBatNow();
		batGetter.setTaskTimer(5000);
		batGetter.enableAutoTask(true);
		engine.addGetter(batGetter);
		engine.startGetter();
	}
}
