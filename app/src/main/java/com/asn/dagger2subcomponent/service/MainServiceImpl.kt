package com.asn.dagger2subcomponent.service

import javax.inject.Inject

class MainServiceImpl @Inject constructor():MainService {
    override fun getMainInfo(): String {
        return "This is main info"
    }
}
