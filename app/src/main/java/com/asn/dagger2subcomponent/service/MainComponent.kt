package com.asn.dagger2subcomponent.service

import com.asn.dagger2subcomponent.ui.ActivityComponent
import com.asn.dagger2subcomponent.ui.MainActivity
import dagger.Component

/*
        业务级Component
     */
@Component(dependencies = [ActivityComponent::class],modules = [(MainModule::class)])
interface MainComponent {
    fun inject(activity:MainActivity)
}
