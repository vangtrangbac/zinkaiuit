package com.example.chapter1_activities_intend;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;

public class splash extends Activity{
  MediaPlayer oursong;

@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.splash);
	
	oursong=MediaPlayer.create(splash.this, R.raw.a);
	//Kiem tra chackbox trong file prefs.xml de cho phep hcya nhac hay ko
	oursong.start();
	Thread timer =new Thread(){
		public void run(){
			try{
				sleep(5000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}finally{
				Intent open=new Intent("come.example.chapter1_activities_intend.Menu");
			}
		}
	};
	timer.start();
}

@Override
protected void onPause() {
	// TODO Auto-generated method stub
	super.onPause();
	oursong.release();
	finish();
}
  

  
}
