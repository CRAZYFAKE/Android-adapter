package com.yyx.commonadapter;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.commonadapter.R;

public class MainActivity extends Activity {

	private ListView mListView;
	private List<MyBean> mDatas = new ArrayList<MyBean>();

	// 想要设置的adapter
	private MyAdapter myAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initDatas();

		mListView = (ListView) findViewById(R.id.id_lv_main);
		myAdapter = new MyAdapter(getApplicationContext(), mDatas,
				R.layout.item_list);
		// 设置适配器
		mListView.setAdapter(myAdapter);

	}

	private void initDatas() {
		MyBean myBean = null;
		myBean = new MyBean("1万能Adapter", "10086", "2015-4-4");
		mDatas.add(myBean);
		myBean = new MyBean("2万能Adapter", "10086", "2015-4-4");
		mDatas.add(myBean);
		myBean = new MyBean("3万能Adapter", "10086", "2015-4-4");
		mDatas.add(myBean);
		myBean = new MyBean("4万能Adapter", "10086", "2015-4-4");
		mDatas.add(myBean);
	}

}
