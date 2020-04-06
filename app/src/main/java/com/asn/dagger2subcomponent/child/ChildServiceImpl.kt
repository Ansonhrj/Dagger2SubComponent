package com.asn.dagger2subcomponent.child

import javax.inject.Inject

class ChildServiceImpl @Inject constructor(): ChildService{
    override fun getChildInfo(): String {
        return "Info from Child Service impl"
    }
}