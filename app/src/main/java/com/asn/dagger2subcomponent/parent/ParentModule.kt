package com.asn.dagger2subcomponent.parent

import dagger.Module
import dagger.Provides

@Module
class ParentModule {

    @Provides
    fun provideParentService(service: ParentServiceImpl): ParentService {
        return service
    }
}