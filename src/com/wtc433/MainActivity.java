package com.wtc433;

import com.wtc433.campuLife.MainCampuLife;
import com.wtc433.trafficAssist.MaintrafficAssist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button campusLife, trafficAssist, scenery, phoneAssist;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);

		campusLife = (Button) findViewById(R.id.campusLife);
		trafficAssist = (Button) findViewById(R.id.trafficAssist);
		scenery = (Button) findViewById(R.id.scenery);
		phoneAssist = (Button) findViewById(R.id.phoneAssist);

		// 给按钮设置监听

		campusLife.setOnClickListener(new myclick());
		trafficAssist.setOnClickListener(new myclick());
		scenery.setOnClickListener(new myclick());
		phoneAssist.setOnClickListener(new myclick());

		campusLife.setOnTouchListener(new myclick());
		trafficAssist.setOnTouchListener(new myclick());
		scenery.setOnTouchListener(new myclick());
		phoneAssist.setOnTouchListener(new myclick());

		// 设置按钮动画
		AlphaAnimation alphaAnimation = new AlphaAnimation(0, 1);
		AlphaAnimation alphaAnimation1 = new AlphaAnimation(0, 1);
		AlphaAnimation alphaAnimation2 = new AlphaAnimation(0, 1);
		AlphaAnimation alphaAnimation3 = new AlphaAnimation(0, 1);
		alphaAnimation.setDuration(1000);
		alphaAnimation.setFillAfter(true);
		alphaAnimation1.setDuration(1500);
		alphaAnimation1.setFillAfter(true);
		alphaAnimation2.setDuration(2000);
		alphaAnimation2.setFillAfter(true);
		alphaAnimation3.setDuration(2500);
		alphaAnimation3.setFillAfter(true);

		campusLife.startAnimation(alphaAnimation);
		trafficAssist.startAnimation(alphaAnimation1);
		scenery.startAnimation(alphaAnimation2);
		phoneAssist.startAnimation(alphaAnimation3);

	}

	public class myclick implements OnClickListener, OnTouchListener {

		@Override
		public boolean onTouch(View v, MotionEvent event) {
			Intent intent = null;
			switch (v.getId()) {
			case R.id.campusLife:
				if (event.getAction() == MotionEvent.ACTION_DOWN) {
					campusLife.setBackgroundResource(R.drawable.bt1_1);
					intent = new Intent(getApplicationContext(), MainCampuLife.class);
					startActivity(intent);

				}
				if (event.getAction() == MotionEvent.ACTION_UP) {
					campusLife.setBackgroundResource(R.drawable.bt1);
				}
				break;

			case R.id.trafficAssist:
				if (event.getAction() == MotionEvent.ACTION_DOWN) {
					/*
					 * 5/23日做百度地图
					 */
					intent = new Intent(getApplicationContext(), MaintrafficAssist.class);
					startActivity(intent);
					trafficAssist.setBackgroundResource(R.drawable.bt2_1);
				}
				if (event.getAction() == MotionEvent.ACTION_UP) {
					trafficAssist.setBackgroundResource(R.drawable.bt2);
				}
				break;
			case R.id.scenery:
				if (event.getAction() == MotionEvent.ACTION_DOWN) {
					scenery.setBackgroundResource(R.drawable.bt3_1);
				}
				if (event.getAction() == MotionEvent.ACTION_UP) {
					scenery.setBackgroundResource(R.drawable.bt3);
				}
				break;
			case R.id.phoneAssist:
				if (event.getAction() == MotionEvent.ACTION_DOWN) {
					phoneAssist.setBackgroundResource(R.drawable.bt4_1);
				}
				if (event.getAction() == MotionEvent.ACTION_UP) {
					phoneAssist.setBackgroundResource(R.drawable.bt4);
				}
				break;
			default:
				break;
			}

			return true;
		}

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.campusLife:
				break;
			case R.id.trafficAssist:
				break;
			case R.id.scenery:
				break;
			case R.id.phoneAssist:
				break;
			default:
				break;
			}
		}

	}
}
