package com.lpp.im.dialog

import android.os.Bundle
import android.view.Gravity
import android.view.View
import com.lpp.im.R
import com.lpp.im.base.BaseDialogFragment

class LoadingCanCancelDialog : BaseDialogFragment() {

    companion object {
        @JvmStatic
        fun newInstance(): LoadingCanCancelDialog {
            return LoadingCanCancelDialog()
        }
    }

    override fun getLayoutResId(): Int {
        return R.layout.layout_loading
    }

    override fun setDimAmount(): Float {
        return 0.0f
    }

}