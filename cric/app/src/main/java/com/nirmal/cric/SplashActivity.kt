package com.nirmal.cric

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.nirmal.cric.databinding.ActivitySplashBinding
import com.nirmal.cric.util.SharedPrefUtil

class SplashActivity:AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Handler(Looper.getMainLooper()).postDelayed({
            if (SharedPrefUtil().init(baseContext).isLogin()) {
                startActivity(
                    Intent(this, HomeActivity::class.java)
                        .setFlags(FLAG_ACTIVITY_CLEAR_TOP)
                )
            }else{
                startActivity(
                    Intent(this, MainActivity::class.java)
                        .setFlags(FLAG_ACTIVITY_CLEAR_TOP)
                )

            }
        },3000)
    }
}