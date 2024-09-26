package com.nirmal.cric.util


import android.util.Patterns
import android.widget.TextView
import java.util.regex.Pattern

class Validate(val tv:TextView) {

    fun isEmpty(msg: String): Validate {
        if (tv.text.toString().isEmpty())
            throw ValidateException(msg)
        return this
    }

    fun isEmptyWithTrim(msg: String): Validate {
        if (tv.text.toString().trim().isEmpty())
            throw ValidateException(msg)
        return this
    }

    fun minLength(size: Int, msg: String): Validate {
        if (tv.text.toString().length > size)
            throw ValidateException(msg)
        return this

    }

    fun checkEmail(msg: String): Validate {
        if (!tv.text.toString().matches(Patterns.EMAIL_ADDRESS.toRegex()))
            throw ValidateException(msg)
        return this
    }

    fun compare(tv1: TextView, msg: String) {
        if (!tv.text.toString().equals(tv1.text.toString())) {
            throw ValidateException(msg)
            tv.requestFocus()
        }
    }
}



