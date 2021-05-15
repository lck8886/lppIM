package com.lpp.im.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.lpp.im.dialog.LoadingCanCancelDialog
import com.lpp.im.dialog.LoadingCannotCancelDialog
import java.lang.reflect.ParameterizedType

abstract class BaseActivity<T : ViewDataBinding> : AppCompatActivity() {
    lateinit var mBinding: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, getLayoutId(savedInstanceState))
        //setContentView(mBinding.root)
        initData()
        initUI()
        bindListeners()
    }

    open fun showLoading(){
        LoadingCanCancelDialog.newInstance().show(supportFragmentManager, null)
    }

    open fun showLoading(canCancel: Boolean) {
        if (canCancel) {
            showLoading()
        } else {
            LoadingCannotCancelDialog.newInstance().show(supportFragmentManager, null)
        }
    }

    protected abstract fun getLayoutId(SavedInstanceState: Bundle?): Int
    protected abstract fun initData()
    protected abstract fun initUI()
    protected abstract fun bindListeners()
}