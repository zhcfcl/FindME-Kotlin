package person.zhc.findme.view

import android.app.Activity
import android.os.Bundle
import com.baidu.mapapi.map.BaiduMap
import com.baidu.mapapi.map.MapView
import kotlinx.android.synthetic.main.map_view.*

/**
 * Created by huanchen on 2018/8/23.
 */
abstract class MapActivity : Activity() {
    abstract var mMapView:MapView;
    abstract var mBaiduMap:BaiduMap;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mMapView = mmap;
        mBaiduMap = mMapView.map;
    }
}