package com.example.chapter1;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;

public class chap1_hidenTitle extends Activity{
     String tag="Events";
     //** call when the activity is first created */

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//--hides the title bar---
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		Log.d(tag,"In the onCreate() event");
	}
     
}
