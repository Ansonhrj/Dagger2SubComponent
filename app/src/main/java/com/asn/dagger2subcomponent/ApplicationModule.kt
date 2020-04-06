package com.asn.dagger2subcomponent

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(private val context:MainApplication) {

    @Provides
    fun provideContext(): Context {
        return this.context
    }
}
