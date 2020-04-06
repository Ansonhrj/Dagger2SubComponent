package com.asn.dagger2subcomponent

import android.app.Application

class MainApplication : Application() {

    lateinit var mApplicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        InitAppInjection()
    }

    private fun InitAppInjection() {
        mApplicationComponent =
            DaggerApplicationComponent.builder().applicationModule(ApplicationModule(this)).build()
    }
}