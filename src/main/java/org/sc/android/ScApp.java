package org.sc.android;

import org.lcf.android.data.Constants;
import org.lcf.android.data.DataManager;
import org.lcf.android.event.EventModule;

import roboguice.RoboGuice;

import com.google.inject.Injector;
import com.google.inject.util.Modules;

import android.app.Application;

public class ScApp extends Application {
	@Override
	public void onCreate() {
		Injector i = RoboGuice.setBaseApplicationInjector( this, RoboGuice.DEFAULT_STAGE, Modules.override(RoboGuice.newDefaultRoboModule(this)).with(new EventModule()));
		i.injectMembers(this);
		DataManager dm = i.getInstance(DataManager.class);
		Constants.init("http://api.tongcard.net/", null);
		super.onCreate();
	}
}
