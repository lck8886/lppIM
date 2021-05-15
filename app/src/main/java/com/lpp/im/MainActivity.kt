package com.lpp.im

import android.os.Bundle
import com.lpp.im.base.BaseActivity
import com.lpp.im.databinding.ActivityMainBinding
import com.lpp.im.dialog.LoadingCanCancelDialog

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun getLayoutId(SavedInstanceState: Bundle?): Int {
        return R.layout.activity_main
    }

    override fun initData() {

    }

    override fun initUI() {
        mBinding.button.setOnClickListener {

        }
        showLoading(false)
    }

    override fun bindListeners() {

    }
}