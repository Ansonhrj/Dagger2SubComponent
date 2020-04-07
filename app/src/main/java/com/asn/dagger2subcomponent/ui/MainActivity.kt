package com.asn.dagger2subcomponent.ui

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.asn.dagger2subcomponent.ApplicationModule
import com.asn.dagger2subcomponent.DaggerApplicationComponent
import com.asn.dagger2subcomponent.MainApplication
import com.asn.dagger2subcomponent.R
import com.asn.dagger2subcomponent.service.DaggerMainComponent
import com.asn.dagger2subcomponent.service.MainModule
import com.asn.dagger2subcomponent.service.MainService
import javax.inject.Inject

//class MainActivity : AppCompatActivity() {
class MainActivity : BaseActivity() {

    private val TAG = "MainActivity asn"
    @Inject
    lateinit var mContext: Context

    @Inject
    lateinit var mActivity: Activity

    @Inject
    lateinit var mMainService:MainService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initInjection()

//        mClickBtn.setOnClickListener {
//            if (mContext == null){
//                toast("context is null")
//            }
//
//            if (mActivity == null){
//                toast("activity is null")
//            }
//            toast(mMainService.getMainInfo())
//        }
        mContext?.apply {
            Log.d(TAG,"mContext2="+toString())
        }
        mActivity?.apply{
            Log.d(TAG,"mActivity2="+toString())
        }
        Log.d(TAG,mMainService.getMainInfo())

        jumpToSubActivity()
    }

    private fun jumpToSubActivity() {
        val intent = Intent(application, SubActivity::class.java)
        Log.d(TAG, "jump to sub activity")
        startActivity(intent)
    }

    /*
        Dagger2注入注册
     */
    private fun initInjection() {

//        val applicationComponent = DaggerApplicationComponent.builder().applicationModule(
//            ApplicationModule(application as MainApplication)
//        ).build()
//        val activityComponent =
//            DaggerActivityComponent.builder().applicationComponent(applicationComponent)
//                .activityModule(ActivityModule(this)).build()
//        DaggerMainComponent.builder().activityComponent(activityComponent).mainModule(MainModule())
//            .build().inject(this)
        DaggerMainComponent.builder().activityComponent(mActivityComponent).mainModule(MainModule())
            .build().inject(this)
    }
}
