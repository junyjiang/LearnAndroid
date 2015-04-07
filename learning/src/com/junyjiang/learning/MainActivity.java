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

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// ����IDȡ�ö�Ӧ�ؼ�
		EditText01 = (EditText) findViewById(R.id.EditText01);
		BtClick = (Button) findViewById(R.id.btClick);
		BtClick.setText(R.string.Click_Me);
		// ���click����
		BtClick.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// ��ȡ�༭���е��ַ���
				String textstr = EditText01.getText().toString();
				Log.e("junyjiang", textstr + "~~~~~~~~~~~~~~~~~~~~~~~");
				// ���õ����ַ�����ŵ�intent������
				Intent intent = new Intent();
				intent.putExtra("text01", textstr);
				// ʹ��intent����NewActivity
				intent.setClass(MainActivity.this, NewActivity.class);
				startActivity(intent);
				MainActivity.this.finish();

			}
		});
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
