package com.junyjiang.learning;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class OtherActivity extends Activity{
	private Button btSend;
	private Button StartRadio;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.other_activity);
		btSend = (Button) findViewById(R.id.btSend);
		StartRadio =(Button)findViewById(R.id.startRadioActivity);
		btSend.setText(R.string.send);
		btSend.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Uri uri = Uri.parse("smsto:0800000123");
				Intent massge = new Intent(Intent.ACTION_SENDTO,uri);
				massge.putExtra("sms_body", "The SMS text");
				startActivity(massge);
				
			}
		});
		StartRadio.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(OtherActivity.this, RadioTest.class);
				startActivity(intent);
			}
		});
		
	}
	

}
