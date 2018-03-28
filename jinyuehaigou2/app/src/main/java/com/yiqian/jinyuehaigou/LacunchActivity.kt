package com.yiqian.jinyuehaigou

/**
 * Created by aptx on 17-9-27.
 */
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import kotlin.concurrent.thread

class LacunchActivity : Activity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)
       /* Thread(Runnable {
            runOnUiThread {
                //跳转至 MainActivity
                startActivity(Intent(this, MainActivity::class.java))
                //结束当前的 Activity
                this.finish()
            }
        }).start()*/
        val time = 1000    //设置等待时间，单位为毫秒
        val handler = Handler()
        //当计时结束时，跳转至主界面
        handler.postDelayed(Runnable {
            startActivity(Intent(this, MainActivity::class.java))
            this.finish()
        }, time.toLong())
    }
}
