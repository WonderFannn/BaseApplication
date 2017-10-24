package com.wangfan.baseapplication.application;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;

import com.tencent.bugly.crashreport.CrashReport;

public class BaseApplication extends Application {
	private static Context context;
	@Override
	public void onCreate() {
        context = getApplicationContext();
        //Bugly
        CrashReport.initCrashReport(getApplicationContext(), "c5ca7fd5af", true);
		super.onCreate();
	}

    public static Context getContext() {
        return context;
    }
    /**
     * 获取当前在前台的activity
     */
    public static String getRunningActivityName(){
        ActivityManager activityManager = (ActivityManager)context.getSystemService(Context.ACTIVITY_SERVICE);
        String runningActivity = activityManager.getRunningTasks(1).get(0).topActivity.getClassName();
        return runningActivity;
    }
	
}
