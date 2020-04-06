package com.asn.dagger2subcomponent

import android.content.Context
import dagger.Component

/*
        Application级别Component
     */
@Component(modules = [(ApplicationModule::class)])
interface ApplicationComponent {

    fun context():Context
}
