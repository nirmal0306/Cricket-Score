package com.nirmal.cric.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.nirmal.cric.HomeFragment
import com.nirmal.cric.NotificationFragment
import com.nirmal.cric.ProfileFragment

class HomePagerAdapter(manager: FragmentManager):FragmentStatePagerAdapter(manager) {
    override fun getCount(): Int = 3

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return HomeFragment()
            1 -> return NotificationFragment()
            else -> return ProfileFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "Home"
            1 -> return "Notification"
            else -> return "Profile"
        }
        return null
    }

}