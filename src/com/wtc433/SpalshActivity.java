package com.wtc433;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class SpalshActivity extends Activity {

	private Button bt_enter;
	private ImageView spalsh;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.spalsh_activity);

		bt_enter = (Button) findViewById(R.id.bt_enter);
		spalsh = (ImageView) findViewById(R.id.splashIcon);
		// 设置动画

		// 设置透明度动画
		AlphaAnimation alphaAnimation = new AlphaAnimation(0, 1);
		alphaAnimation.setDuration(2000);
		alphaAnimation.setFillAfter(true);
		// 设置缩放动画
		ScaleAnimation scaleAnimation = new ScaleAnimation(0, 1, 0, 1, Animation.RELATIVE_TO_SELF, 0.5f,
				Animation.RELATIVE_TO_SELF, 0.5f);
		scaleAnimation.setDuration(2000);
		scaleAnimation.setFillAfter(true);

		AnimationSet animationSet = new AnimationSet(true);

		animationSet.addAnimation(alphaAnimation);
		animationSet.addAnimation(scaleAnimation);

		spalsh.startAnimation(animationSet);
		// -------------------------------------
		bt_enter.setOnClickListener(new myOnClickListener());
	}

	public class myOnClickListener implements OnClickListener {
		Intent intent = null;

		@Override
		public void onClick(View v) {
			intent = new Intent(getApplicationContext(), MainActivity.class);
			startActivity(intent);
			SpalshActivity.this.finish();
		}

	}
}
