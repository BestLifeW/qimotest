package com.wtc433.campuLife;

import com.wtc433.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewSwitcher.ViewFactory;

public class CampusSceneryActivicty extends Activity implements ViewFactory {

	private ImageSwitcher imageSwitcher;
	private LinearLayout linearLayout;

	private int[] mImages = { R.drawable.s1, R.drawable.s2, R.drawable.s3, R.drawable.s4, R.drawable.s5, R.drawable.s6,
			R.drawable.s7, R.drawable.s8 };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.campus_scenery_activicty);

		imageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher1);
		linearLayout = (LinearLayout) findViewById(R.id.linearlayout);
		imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));
		imageSwitcher.setOutAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_out));
		imageSwitcher.setFactory(this);

		for (int i = 0; i < mImages.length; i++) {
			linearLayout.addView(getImageView(i));
		}

	}

	private ImageView getImageView(int i) {
		ImageView imageView = new ImageView(this);
		imageView.setImageResource(mImages[i]);
		imageView.setId(i);
		imageView.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				imageSwitcher.setBackgroundResource(mImages[v.getId()]);
			}
		});
		return imageView;
	}

	@Override
	public View makeView() {
		ImageView imageView = new ImageView(this);
		return imageView;
	}

}
