package com.cia.cia;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

public class CIAApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        this.context = getApplicationContext();
    }

    public static Context getContext()
    {
        return context;
    }
}
