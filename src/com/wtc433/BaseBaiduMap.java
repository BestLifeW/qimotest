package com.wtc433;

import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapStatusUpdate;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.model.LatLng;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public abstract class BaseBaiduMap extends Activity {

	protected MapView mMapView;
	protected BaiduMap baiduMap;
	// 厦门理工的位置
	protected LatLng XMLG = new LatLng(24.6304210000, 118.0932890000);

	// 这里加final 的目的是为了不让子类覆盖，是为了预防这里的一些类，
	// 还没初始化的时候 被子类调用
	@Override
	protected final void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.basebaidumap);
		mMapView = (MapView) findViewById(R.id.bmapView);
		baiduMap = mMapView.getMap();
		MapStatusUpdate mapStatusUpdate = MapStatusUpdateFactory.newLatLng(XMLG);
		baiduMap.setMapStatus(mapStatusUpdate);
		mapStatusUpdate = MapStatusUpdateFactory.zoomTo(15);
		baiduMap.setMapStatus(mapStatusUpdate);
		init();
	}

	public abstract void init();


	@Override
	protected void onResume() {
		super.onResume();
		mMapView.onResume();
		Log.i("baidu1", "回复");
	}

	@Override
	protected void onPause() {
		super.onPause();
		mMapView.onPause();
		Log.i("baidu1", "暂停");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		mMapView.onDestroy();
		Log.i("baidu1", "销毁");
	}
}
