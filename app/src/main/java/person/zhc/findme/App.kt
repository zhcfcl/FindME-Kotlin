package person.zhc.findme

import android.app.Application
import com.baidu.mapapi.CoordType
import com.baidu.mapapi.SDKInitializer

/**
 * Created by huanchen on 2018/8/29.
 */
class App:Application() {
    override fun onCreate() {
        super.onCreate()

//        BaiduMap init
        SDKInitializer.initialize(this);
        SDKInitializer.setCoordType(CoordType.BD09LL);
    }
}