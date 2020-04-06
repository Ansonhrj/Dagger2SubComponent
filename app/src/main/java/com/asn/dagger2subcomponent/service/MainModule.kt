package com.asn.dagger2subcomponent.service

import dagger.Module
import dagger.Provides

@Module
class MainModule {

    @Provides
    fun provideMainService(service: MainServiceImpl):MainService{
        return service
    }
}