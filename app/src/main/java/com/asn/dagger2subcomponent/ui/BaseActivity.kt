package com.asn.dagger2subcomponent.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.asn.dagger2subcomponent.MainApplication
import com.asn.dagger2subcomponent.ui.ActivityComponent

open class BaseActivity: AppCompatActivity() {

    lateinit var mActivityComponent: ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initActivityInjection()

    }

    private fun initActivityInjection() {
        mActivityComponent = DaggerActivityComponent.builder().applicationComponent((application as MainApplication).mApplicationComponent).activityModule(ActivityModule(this)).build()

    }
}
