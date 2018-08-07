/**
 * CIAEngine
 * 采集器管理，数据优化，网络操作管理
 * DickLight
 */
package com.cia.cia;

import com.cia.cia.getters.BaseGetter;

import java.util.ArrayList;
import java.util.List;
import com.cia.cia.myinterface.*;
import com.cia.cia.CIAData.*;
import java.util.*;

/**
 *
 */
public class CIAEngine {
    List<BaseGetter> getters;
    public CIAEngine()
    {
        getters = new ArrayList<BaseGetter>();
    }

    public void addGetter(BaseGetter getter)
    {
        getters.add(getter);
    }

    public void removeGetter(BaseGetter getter)
    {

    }
	
	
	
	public void startGetter()
	{
		for (BaseGetter gettet:getters)
		{
			//先判断采集器是否需要自动运行，需要的话，开线程来
			//管理自动运行
			if (gettet.NEED_AUTO_RUN)
			{
				Timer timer = new Timer();
				timer.schedule(new AutoTask(gettet), 0, gettet.TASK_TIME);
			}
		}
		
	}
	
	
	
	
	
	class GetterReturn implements IGetter
	{

		@Override
		public void OnGetterReturn(CIAData data)
		{
			// TODO: Implement this method
		}
		
		
	}
	
	class GetterTaskReturn implements IGetter
	{

		@Override
		public void OnGetterReturn(CIAData data)
		{
			// TODO: Implement this method
		}

		
	}
	
	
	class AutoTask extends TimerTask
	{
		BaseGetter getter;
		
		public AutoTask(BaseGetter getter)
		{
			this.getter = getter;
		}

		@Override
		public void run()
		{
			// TODO: Implement this method
			getter.get(new GetterTaskReturn());
		}
		

		
	}
	
}
