package com.junyjiang.learning;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class RadioTest extends Activity{
	//�����ؼ�����
	private RadioGroup genderGroup =null;
	private RadioButton famaleButton = null;
	private RadioButton maleButton = null;
	private CheckBox swimBox = null;
	private CheckBox runBox = null;
	private CheckBox readBox = null;
	private Button startpro =null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.radio);
		//ͨ���ؼ�ID���õ�����ؼ��Ķ���
		genderGroup = (RadioGroup) findViewById(R.id.genderGroup);
		famaleButton = (RadioButton) findViewById(R.id.femaleButton);
		maleButton = (RadioButton) findViewById(R.id.maleButton);
		swimBox = (CheckBox)findViewById(R.id.swim);
		runBox = (CheckBox)findViewById(R.id.run);
		readBox = (CheckBox)findViewById(R.id.read);
		startpro = (Button) findViewById(R.id.startPro);
		startpro.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(RadioTest.this, ProgressBarTest.class);
				startActivity(intent);
			}
		});
		genderGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				if(famaleButton.getId() == checkedId){
					System.out.println("famale");
					Toast.makeText(RadioTest.this, "famale", Toast.LENGTH_LONG).show();
				}else if(maleButton.getId() == checkedId){
					System.out.println("male");
				}
				
			}
		});
		
		swimBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if(isChecked){
					Toast.makeText(RadioTest.this, "~~~~Swim~~~~~", Toast.LENGTH_LONG).show();
				}else {
					System.out.println("swim unchecked");
				}
			}
		});
		runBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if(isChecked){
					Toast.makeText(RadioTest.this, "~~~~Runing~~~~~", Toast.LENGTH_LONG).show();
				}else {
					System.out.println("Run unchecked");
				}
			}
		});
		readBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if(isChecked){
					Toast.makeText(RadioTest.this, "~~~~Reading~~~~~", Toast.LENGTH_LONG).show();
				}else {
					System.out.println("Read unchecked");
				}
			}
		});
	}
	

}
