package com.asn.dagger2subcomponent.child

import dagger.Component
import dagger.Subcomponent

@Subcomponent(modules = [(ChildModule::class)])
interface ChildComponent {
 //todo   fun inject(activity: SubActivity)
}