package com.cia.cia.getters;

import com.cia.cia.myinterface.IGetter;

public class BaseGetter {
	public int TASK_TIME = 0;
	public boolean NEED_AUTO_RUN = false;
    public void init(){}
    public void get(IGetter iGetter){}
	public void setTaskTimer(int m)
	{
		this.TASK_TIME = m;
	}
	
	public void enableAutoTask(boolean s)
	{
		this.NEED_AUTO_RUN = s;
	}
}
