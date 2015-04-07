package com.junyjiang.learning;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class NewActivity extends Activity{
	private TextView TextView01;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new);
		TextView01 = (TextView)findViewById(R.id.TextView01);
		//获取intent对象中的值
		Intent intent = getIntent();
		String text1 = intent.getStringExtra("text01");
		Log.e("junyjiang", text1+"-------------");
		TextView01.setText(text1);
		
	}
	

}
