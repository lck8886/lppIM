package com.lpp.im.base

import android.os.Bundle
import android.view.*
import androidx.fragment.app.DialogFragment

abstract class BaseDialogFragment : DialogFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dialog = dialog
        dialog?.let {
            getDialog()?.window?.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            getDialog()?.window?.setGravity(Gravity.CENTER)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
        return inflater.inflate(getLayoutResId(), container, false)
    }

    override fun onStart() {
        super.onStart()
        dialog?.window?.setBackgroundDrawableResource(android.R.color.transparent)
        dialog?.setCanceledOnTouchOutside(setCannotCancel())
        dialog?.window?.setDimAmount(setDimAmount())
    }

    open fun setCannotCancel() : Boolean{
        return true
    }

    open fun setDimAmount() : Float {
        return 0.5f
    }

    protected abstract fun getLayoutResId() : Int
}