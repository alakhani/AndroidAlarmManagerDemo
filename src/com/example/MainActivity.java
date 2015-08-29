package com.example;

import java.util.Calendar;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;


public class MainActivity extends Activity {

	private PendingIntent pendingIntent;
	private static final String PROX_ALERT_INTENT = 
			"com.javacodegeeks.android.lbs.ProximityAlert";


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.MONTH, 12);
		calendar.set(Calendar.YEAR, 2014);
		calendar.set(Calendar.DAY_OF_MONTH, 2);

		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 46);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.AM_PM,Calendar.PM);
		
		
		//Intent myIntent = new Intent(MainActivity.this, MyReceiver.class);
		//pendingIntent = PendingIntent.getBroadcast(MainActivity.this, 0, myIntent,0);

		//Intent intent = new Intent(PROX_ALERT_INTENT);
		//PendingIntent proximityIntent = PendingIntent.getBroadcast(this, 0, intent, 0);
		
		//AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);
		//alarmManager.set(AlarmManager.RTC, calendar.getTimeInMillis(), proximityIntent);
		
		//IntentFilter filter = new IntentFilter(PROX_ALERT_INTENT);  
		//registerReceiver(new MyReceiver(), filter);

	}


}
