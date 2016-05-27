package com.wtc433;

import com.baidu.mapapi.SDKInitializer;

import android.app.Application;

public class MyAppliction extends Application {
	@Override
	public void onCreate() {
		SDKInitializer.initialize(getApplicationContext());
	}
}
