package com.nirmal.cric.util

import android.util.Log
import androidx.databinding.BindingAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.animation.AnimatableView.Listener

@BindingAdapter("onPageChangeListener")
fun addPageChangeListener(viewPager: ViewPager,listener: onPageChangeListener?) {
    Log.i("setOnPageChangeListener","hello")
    viewPager.clearOnPageChangeListeners()
    viewPager.addOnPageChangeListener(listener!!)
}

private fun ViewPager.addOnPageChangeListener(listener: onPageChangeListener) {
    TODO("Not yet implemented")
}

class onPageChangeListener {

}
