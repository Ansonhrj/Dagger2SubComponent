package com.asn.dagger2subcomponent.parent

import javax.inject.Inject

class ParentServiceImpl @Inject constructor():
    ParentService {

    override fun getParentInfo(): String {
        return "Msg from ParentServiceImpl"
    }
}