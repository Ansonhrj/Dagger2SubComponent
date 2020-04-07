package com.asn.dagger2subcomponent.ui

import android.os.Bundle
import android.util.Log
import com.asn.dagger2subcomponent.child.ChildModule
import com.asn.dagger2subcomponent.child.ChildService
import com.asn.dagger2subcomponent.parent.DaggerParentComponent
import com.asn.dagger2subcomponent.parent.ParentModule
import com.asn.dagger2subcomponent.parent.ParentService
import javax.inject.Inject

class SubActivity : BaseActivity() {

    private val TAG = "SubActivity asn"

    @Inject
    lateinit var mParentService: ParentService

    @Inject
    lateinit var mChildService: ChildService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        InitInjection()

        Log.d(TAG, "Parent=" + mParentService.getParentInfo())
        Log.d(TAG, "Child=" + mChildService.getChildInfo())
    }

    private fun InitInjection() {
        DaggerParentComponent.builder().parentModule(ParentModule()).build().addSub(ChildModule())
            .inject(this)
    }
}