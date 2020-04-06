package com.asn.dagger2subcomponent.ui

import android.app.Activity
import android.content.Context
import com.asn.dagger2subcomponent.ApplicationComponent
import dagger.Component

/*
    Activity级别Component
 */
@Component(dependencies = [(ApplicationComponent::class)],modules = [(ActivityModule::class)])
interface ActivityComponent {

    fun activity():Activity
    fun context(): Context
}
