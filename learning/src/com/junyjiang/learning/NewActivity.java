package com.junyjiang.learning;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class NewActivity extends Activity{
	private TextView TextView01;
	private Button btOther;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new);
		btOther = (Button)findViewById(R.id.btOther);
		btOther.setText(R.string.call_other);
		TextView01 = (TextView)findViewById(R.id.TextView01);
		//获取intent对象中的值
		Intent intent = getIntent();
		String text1 = intent.getStringExtra("text01");
		Log.e("junyjiang", text1+"-------------");
		TextView01.setText(text1);
		btOther.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent= new Intent();
				intent.setClass(NewActivity.this, OtherActivity.class);
				startActivity(intent);
				
			}
		});
	}
	

}
