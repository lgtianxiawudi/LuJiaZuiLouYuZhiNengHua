package com.example.intelligentbuildingmanagement;

import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Event;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.Menu;

public abstract class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		init();
	}
	public abstract void init();
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		Action();
	}
	public abstract void Action(); 
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		if(keyCode==KeyEvent.KEYCODE_BACK){
			return false;
		}
		return super.onKeyDown(keyCode, event);
	}
}
