package com.wtc433.campuLife;

import com.wtc433.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainCampuLife extends Activity {
	private ImageView backButton;
	private Button xiaoyuanpingmiantu, xiaoyuanfengjing, xinshengzhinan;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.camoulife_activity);

		TextView titleText = (TextView) findViewById(R.id.titleText);
		titleText.setText("学校生活");

		backButton = (ImageView) findViewById(R.id.backicon);
		backButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				backButton.setImageResource(R.drawable.backicon1);
				finish();
			}
		});
		xiaoyuanfengjing = (Button) findViewById(R.id.xiaoyuanfengjing);
		xiaoyuanfengjing.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = null;
				intent = new Intent(getApplicationContext(), CampusSceneryActivicty.class);
				startActivity(intent);
			}
		});
	}
}