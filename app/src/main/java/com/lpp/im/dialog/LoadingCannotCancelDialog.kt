package com.lpp.im.dialog

import com.lpp.im.R
import com.lpp.im.base.BaseDialogFragment

class LoadingCannotCancelDialog : BaseDialogFragment() {

    companion object {
        @JvmStatic
        fun newInstance(): LoadingCannotCancelDialog {
            return LoadingCannotCancelDialog()
        }
    }

    override fun setCannotCancel(): Boolean {
        return false
    }

    override fun getLayoutResId(): Int {
        return R.layout.layout_loading
    }

    override fun setDimAmount(): Float {
        return 0.0f
    }


}