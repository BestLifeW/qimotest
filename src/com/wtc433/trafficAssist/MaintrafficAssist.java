package com.wtc433.trafficAssist;

import com.wtc433.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MaintrafficAssist extends Activity implements OnClickListener {

	private ImageView backicon;
	private Button xianluchaxun, wodeweizhi, guanjiandianchaxun;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		setContentView(R.layout.trafficassist_activity);

		backicon = (ImageView) findViewById(R.id.backicon);
		TextView titleText = (TextView) findViewById(R.id.titleText);
		titleText.setText("出行指南");
		backicon.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});

		xianluchaxun = (Button) findViewById(R.id.bt_xianluchaxun);
		wodeweizhi = (Button) findViewById(R.id.bt_wodeweizhi);
		guanjiandianchaxun = (Button) findViewById(R.id.bt_guanjiandianchaxun);

		xianluchaxun.setOnClickListener(this);
		wodeweizhi.setOnClickListener(this);
		guanjiandianchaxun.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Intent intent = null;
		switch (v.getId()) {
		case R.id.bt_xianluchaxun:
			intent = new Intent(getApplicationContext(), Xianluchaxun.class);
			break;

		case R.id.bt_wodeweizhi:
			intent = new Intent(getApplicationContext(), Wodeweizhi.class);
			break;
		case R.id.bt_guanjiandianchaxun:
			intent = new Intent(getApplicationContext(), Guanjiandianchaxun.class);
			break;
		default:
			break;
		}
		startActivity(intent);
	}
}
