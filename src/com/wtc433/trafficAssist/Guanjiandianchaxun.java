package com.wtc433.trafficAssist;

import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.poi.PoiCitySearchOption;
import com.baidu.mapapi.search.poi.PoiDetailResult;
import com.wtc433.PoiSearchBaseActivity;

import android.widget.Toast;

public class Guanjiandianchaxun extends PoiSearchBaseActivity {

	@Override
	public void poiSearchInit() {
		poiSearch.searchInCity(getSearchParams());
	}

	private PoiCitySearchOption getSearchParams() {
		PoiCitySearchOption params = new PoiCitySearchOption();
		params.city("厦门");
		params.keyword("kfc");

		return params;
	}

	/** 获取兴趣点详情信息 */
	@Override
	public void onGetPoiDetailResult(PoiDetailResult result) {
		if (result == null || result.error != SearchResult.ERRORNO.NO_ERROR) {
			Toast.makeText(getApplicationContext(), "没有搜索到相关的信息", 1).show();
			return;
		}

		Toast.makeText(getApplicationContext(), result.getShopHours() + ", " + result.getTelephone(), 1).show();
	}

}
