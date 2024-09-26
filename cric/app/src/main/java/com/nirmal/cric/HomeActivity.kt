package com.nirmal.cric

import android.os.Bundle
import android.util.Log
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import com.nirmal.cric.adapter.HomePagerAdapter
import com.nirmal.cric.databinding.ActivityHomeBinding



class HomeActivity : AppCompatActivity(), ViewPager.OnPageChangeListener {
    private lateinit var adapter: HomePagerAdapter
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = HomePagerAdapter(supportFragmentManager)
        binding.vpHome.adapter = adapter
        binding.tbLayout.setupWithViewPager(binding.vpHome)
        binding.vpHome.currentItem = 0
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        TODO("Not yet implemented")
    }

    override fun onPageSelected(position: Int) {
        Log.e("onPageSelected: ",position.toString() )
    }

    override fun onPageScrollStateChanged(state: Int) {
        TODO("Not yet implemented")
    }
}


