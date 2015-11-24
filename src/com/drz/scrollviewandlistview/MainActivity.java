package com.drz.scrollviewandlistview;

import com.drz.utils.DataContants;
import com.drz.utils.UIUtils;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.AbsListView.LayoutParams;

public class MainActivity extends Activity {

	private com.drz.scrollviewandlistview.view.SelfListView lvContent;
	private ScrollView sView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();

	}

	private void initView() {
		lvContent = (com.drz.scrollviewandlistview.view.SelfListView) this.findViewById(R.id.lv_content);
		sView = (ScrollView) this.findViewById(R.id.sv);

		lvContent.setAdapter(new MyAdapter());
		// sView.smoothScrollTo(0, 0);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	class MyAdapter extends BaseAdapter {

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return DataContants.NAMES.length;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			if (convertView == null) {
				TextView view = new TextView(getApplicationContext());
				convertView = view;
			}
			LayoutParams params = new AbsListView.LayoutParams(AbsListView.LayoutParams.MATCH_PARENT, (int) UIUtils.dip2px(getApplicationContext(), 70));

			TextView view = (TextView) convertView;
			view.setText(DataContants.NAMES[position]);
			view.setTextColor(Color.BLACK);

			// 文本框布局属性的设置
			view.setBackgroundColor(Color.argb(8, 0, 0, 0));
			
			int padding = UIUtils.dip2px(getApplicationContext(), 5);
			view.setPadding(padding, padding, padding, padding);
			view.setTextSize(18);
			view.setGravity(Gravity.CENTER);
			view.setLayoutParams(params);
			return convertView;
		}
	}

}
