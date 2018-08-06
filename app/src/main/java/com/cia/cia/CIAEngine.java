/**
 * CIAEngine
 * 采集器管理，数据优化，网络操作管理
 * DickLight
 */
package com.cia.cia;

import com.cia.cia.getters.BaseGetter;

import java.util.ArrayList;
import java.util.List;

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
}
