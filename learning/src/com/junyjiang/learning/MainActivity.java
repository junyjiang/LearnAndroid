package com.junyjiang.learning;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	private EditText EditText01;
	private Button BtClick;
	private Button StartHandlerTest;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.e("junyjiang", "----------------I am onCreate-------------------");
		setContentView(R.layout.activity_main);
		// 根据ID取得对应控件
		EditText01 = (EditText) findViewById(R.id.EditText01);
		BtClick = (Button) findViewById(R.id.btClick);
		BtClick.setText(R.string.Click_Me);
		StartHandlerTest = (Button)findViewById(R.id.startHandlerTest);
		StartHandlerTest.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, HandlerTest.class);
				startActivity(intent);
				
			}
		});
		// 添加click监听
		BtClick.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// 获取编辑框中的字符串
				String textstr = EditText01.getText().toString();
				Log.e("junyjiang", textstr + "~~~~~~~~~~~~~~~~~~~~~~~");
				// 将得到的字符串存放到intent对象中
				Intent intent = new Intent();
				intent.putExtra("text01", textstr);
				// 使用intent调起NewActivity
				intent.setClass(MainActivity.this, NewActivity.class);
				startActivity(intent);
//				MainActivity.this.finish();

			}
		});
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.e("junyjiang", "----------------I am onStart-------------------");
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		Log.e("junyjiang", "----------------I am ReStart-------------------");
		super.onRestart();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.e("junyjiang", "----------------I am onResume-------------------");
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.e("junyjiang", "----------------I am onPause-------------------");
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.e("junyjiang", "----------------I am onStop-------------------");
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.e("junyjiang", "----------------I am onDestroy-------------------");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(0, 1, 1, R.string.abort);
		menu.add(0, 2, 2, R.string.exit);
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	//
	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == 2) {
			MainActivity.this.finish();
		}else {
			Toast.makeText(MainActivity.this, "test_______junyjiang",Toast.LENGTH_SHORT).show();
		}		
		return super.onOptionsItemSelected(item);
	}

}
