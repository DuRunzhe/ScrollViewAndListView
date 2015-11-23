package com.drz.scrollviewandlistview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class SelfListView extends ListView {

	public SelfListView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public SelfListView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public SelfListView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		// 重新指定ListView的测量模式让listIVew适应ScrollView的高度
		int heightMs = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE, MeasureSpec.AT_MOST);

		super.onMeasure(widthMeasureSpec, heightMs);
	}
}
