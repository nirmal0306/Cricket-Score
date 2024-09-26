package com.nirmal.cric

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.nirmal.cric.databinding.FragmentItemDetailBinding


class ItemDetailsFragment:Fragment() {
    private lateinit var binding: FragmentItemDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentItemDetailBinding.inflate(inflater,container,false)
        return binding.root
    }
}