package com.nirmal.cric

import retrofit2.Call
import retrofit2.Response
import retrofit2.Callback

class BaseCallBack<T>: Callback<T> {
    var success:((Response<T>)->Unit)?=null
    var failure:((t:Throwable)->Unit)?=null

    override fun onResponse(call: Call<T>,response: Response<T>) {
        success?.invoke(response)
    }

    override fun onFailure(call: Call<T>, t: Throwable) {
        failure?.invoke(t)
    }


}