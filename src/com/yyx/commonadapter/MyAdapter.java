package com.yyx.commonadapter;

import java.util.List;

import android.content.Context;

import com.example.commonadapter.R;
import com.yyx.commonadapter.util.CommonAdapter;
import com.yyx.commonadapter.util.ViewHolder;

/**
 *@author 姚义祥
 *@2015-5-10
 *@desperation: 
 *
 */
public class MyAdapter extends CommonAdapter<MyBean>{

	public MyAdapter(Context context, List<MyBean> mDatas, int itemLayoutId) {
		super(context, mDatas, itemLayoutId);
	}
	@Override
	public void convert(ViewHolder helper, MyBean item) {
		helper.setText(R.id.tv_describe, item.getDesc());
		helper.setText(R.id.tv_phone, item.getPhone());
		helper.setText(R.id.tv_time, item.getTime());
	}
}
