package com.wtc433.trafficAssist;

import com.wtc433.BaseBaiduMap;
import com.wtc433.R;

import android.widget.TextView;

public class Xianluchaxun extends BaseBaiduMap {

	@Override
	public void init() {
		setContentView(R.layout.xianluchaxun_activity);
		TextView textView = (TextView) findViewById(R.id.titleText);
		textView.setText("路线查询");
	}

}
