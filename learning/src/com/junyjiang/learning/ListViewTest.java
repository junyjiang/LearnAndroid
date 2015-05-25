package com.junyjiang.learning;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.ListActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class ListViewTest extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listviewmain);
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String,String>>();
		HashMap<String , String> map1 = new HashMap<String, String>();
		HashMap<String , String> map2 = new HashMap<String, String>();
		HashMap<String , String> map3 = new HashMap<String, String>();
		map1.put("user_name", "test");
		map1.put("user_ip", "8.8.8.8");
		map2.put("user_name", "test1");
		map2.put("user_ip", "9.8.8.8");
		map3.put("user_name", "test2");
		map3.put("user_ip", "10.8.8.8");
		list.add(map1);
		list.add(map2);
		list.add(map3);
		SimpleAdapter listAdapter = new SimpleAdapter(this, list, R.layout.user, new String[] {"user_name","user_ip"}, new int[] {R.id.user_ip,R.id.user_name});
		setListAdapter(listAdapter);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		System.out.println("id~~~~~~~~~~~~~~~~~~~~~~~~~~"+id);
		System.out.println("position~~~~~~~~~~~~~~~~~~"+position);
	}
	
	
}
