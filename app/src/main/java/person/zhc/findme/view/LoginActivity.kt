package person.zhc.findme.view

import android.app.Activity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*
import person.zhc.findme.R

/**
 * Created by huanchen on 2018/8/23.
 */
class LoginActivity : Activity() {
    var name:String = "";



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login);

        initParams();
        initEvents();
    }

    fun initParams(){
        name = userName.text.toString();
    }

    fun initEvents(){
        signInBtn.setOnClickListener(View.OnClickListener {

        })
    }
}