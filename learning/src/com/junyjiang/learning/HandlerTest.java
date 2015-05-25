package com.junyjiang.learning;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HandlerTest extends Activity {
	private Button StartHandler;
	private Button EndHandler;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.handler_test);
		StartHandler = (Button) findViewById(R.id.StartHandler);
		EndHandler = (Button) findViewById(R.id.EndHandler);
		StartHandler.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				handler.post(updateThread);
			}
		});
		EndHandler.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				handler.removeCallbacks(updateThread);
				
			}
		});
	}
	Handler handler = new Handler();
	Runnable updateThread = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("updateThread");
			handler.postDelayed(updateThread, 3000);
		}
	};
	
	

}
