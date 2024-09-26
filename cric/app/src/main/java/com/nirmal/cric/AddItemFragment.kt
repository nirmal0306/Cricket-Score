package com.nirmal.cric

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.nirmal.cric.databinding.FragmentAddItemBinding


class AddItemFragment:Fragment() {
    private lateinit var binding: FragmentAddItemBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentAddItemBinding.inflate(inflater,container,false)
        return binding.root
    }
}


