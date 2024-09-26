package com.nirmal.cric

import retrofit2.Call
import com.nirmal.cric.BaseCallBack
import androidx.fragment.app.Fragment

open class BaseFragment: Fragment() {

}

fun<T> Call<T>.enqueue(callback: BaseCallBack<T>.() -> Unit) {
    val callbackBk = BaseCallBack<T>()
    callback.invoke(callbackBk)
    this.enqueue(callbackBk)
}