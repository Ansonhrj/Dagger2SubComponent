package com.asn.dagger2subcomponent.child

import com.asn.dagger2subcomponent.ui.SubActivity
import dagger.Component
import dagger.Subcomponent

@Subcomponent(modules = [(ChildModule::class)])
interface ChildComponent {
    fun inject(activity: SubActivity)
}