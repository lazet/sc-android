package org.sc.android;

import roboguice.activity.RoboActivity;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import org.lcf.android.event.EventManager;

import com.google.inject.Inject;

public class ScActivity extends RoboActivity {

    private static String TAG = "sc-android";
    
    @Inject
    private EventManager em;
    /**
     * Called when the activity is first created.
     * @param savedInstanceState If the activity is being re-initialized after 
     * previously being shut down then this Bundle contains the data it most 
     * recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		Log.i(TAG, "onCreate");
        setContentView(R.layout.main);
    }

}

