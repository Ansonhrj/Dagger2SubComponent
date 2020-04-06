package com.asn.dagger2subcomponent.parent

import com.asn.dagger2subcomponent.child.ChildComponent
import com.asn.dagger2subcomponent.child.ChildModule
import dagger.Component

@Component(modules = [(ParentModule::class)])
interface ParentComponent {
    fun addSub(module: ChildModule): ChildComponent
}