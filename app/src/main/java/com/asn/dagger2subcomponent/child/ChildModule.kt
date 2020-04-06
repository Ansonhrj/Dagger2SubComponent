package com.asn.dagger2subcomponent.child

import dagger.Module
import dagger.Provides

@Module
class ChildModule {
    @Provides
    fun provideSubService(service: ChildServiceImpl): ChildService {
        return service
    }
}