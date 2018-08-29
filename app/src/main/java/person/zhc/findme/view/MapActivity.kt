package person.zhc.findme.view

import android.app.Activity
import android.os.Bundle
import com.baidu.mapapi.CoordType
import com.baidu.mapapi.SDKInitializer
import com.baidu.mapapi.map.BaiduMap
import com.baidu.mapapi.map.MapView
import kotlinx.android.synthetic.main.map_view.*
import person.zhc.findme.R

/**
 * Created by huanchen on 2018/8/23.
 */
class MapActivity : Activity() {
    var mMapView:MapView ?= null;
    var mBaiduMap:BaiduMap?=null;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.map_view);

        mMapView = mmap;
        mBaiduMap = mMapView?.map;
    }

    override fun onResume() {
        super.onResume()
        mMapView?.onResume();
    }
}