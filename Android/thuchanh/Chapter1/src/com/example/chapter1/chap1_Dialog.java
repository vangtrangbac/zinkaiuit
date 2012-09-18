package com.example.chapter1;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class chap1_Dialog extends Activity{
   CharSequence[] items ={"Google","Apple","Microsoft"};
   boolean[] itemsChecked=new boolean[items.length];
   /*Call when the activity is first created */
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	showDialog(0);
}
@Override
protected Dialog onCreateDialog(int id) {
	switch(id){
		case 0:
			return new AlertDialog.Builder(this)
			.setIcon(R.drawable.icon)
			.setTitle("This is a dialog with some simple text ...")
			.setPositiveButton("OK",new
					DialogInterface.OnClickListener() {
						
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
							Toast.makeText(getBaseContext(), "OK clicked", Toast.LENGTH_LONG).show();
							
						}
									
						
					})
			.setNegativeButton("OK",new
					DialogInterface.OnClickListener() {
						
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
							Toast.makeText(getBaseContext(), "Cancel clicked", Toast.LENGTH_LONG).show();
							
						}
									
						
					})
			.setMultiChoiceItems(items,itemsChecked,new DialogInterface.OnMultiChoiceClickListener() {
				
				public void onClick(DialogInterface dialog, int which, boolean isChecked) {
					// TODO Auto-generated method stub
					Toast.makeText(getBaseContext(), items[which]+(isChecked? "checked": "unchecked")
							, Toast.LENGTH_SHORT).show();
				}
			})
			.create();
		
	}
	// TODO Auto-generated method stub
	return null;
}

   
}
