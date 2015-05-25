package com.junyjiang.learning;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;

public class ProgressBarTest extends Activity{
	
	private ProgressBar firstBar;
	private ProgressBar secBar;
	private Button  begin;
	private int i=0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.progressbar);
		firstBar = (ProgressBar) findViewById(R.id.firstProgressBar);
		secBar = (ProgressBar) findViewById(R.id.secondProgressBar);
		begin = (Button) findViewById(R.id.progressbt);
		begin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(i==0){
					firstBar.setVisibility(View.VISIBLE);
				}else if(i<100){
					firstBar.setProgress(i);
					firstBar.setSecondaryProgress(i+10);
				}else{
					firstBar.setVisibility(View.GONE);
					secBar.setVisibility(View.VISIBLE);
				}
				i= i + 10;
				if(i>100){
					Intent intent =new Intent();
					intent.setClass(ProgressBarTest.this, ListViewTest.class);
					startActivity(intent);
				}
				
			}
		});
	}
	
}
