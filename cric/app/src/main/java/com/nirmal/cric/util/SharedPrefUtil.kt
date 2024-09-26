package com.nirmal.cric.util

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences

class SharedPrefUtil() {
    private val LOGIN="login"
    private lateinit var sharedPref:SharedPreferences
    fun init(context: Context): SharedPrefUtil {
        if (sharedPref == null)
            sharedPref = context.getSharedPreferences(context.packageName,Activity.MODE_PRIVATE)
        return this
    }

    fun getString(name:String): String? {
        return sharedPref.getString(name,"")
    }
    fun getBoolean(name:String): Boolean {
        return sharedPref.getBoolean(name,false)
    }
    fun getInt(name:String): Int {
        return sharedPref.getInt(name,0)
    }
    fun putBoolean(name: String,value: Boolean){
        sharedPref.edit().putBoolean(name,value).commit()
    }
    fun putString(name: String,value: String){
        sharedPref.edit().putString(name,value).commit()
    }
    fun putInt(name: String,value: Int){
        sharedPref.edit().putInt(name,value).commit()
    }
    fun clearPref(){
        sharedPref.all.clear()
    }
    fun remove(name: String){
        sharedPref.edit().remove(name)
    }
    fun flagLoggedIn(){
        sharedPref.getBoolean(LOGIN,true)
    }
    fun isLogin(): Boolean {
        return sharedPref.getBoolean(LOGIN,false)
    }
    fun flagLoggedOut(){
        sharedPref.edit().putBoolean(LOGIN,false).commit()
    }
}