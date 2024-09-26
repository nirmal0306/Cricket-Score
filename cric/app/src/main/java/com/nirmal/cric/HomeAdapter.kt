package com.nirmal.cric

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nirmal.cric.databinding.RowHomeBinding

class HomeAdapter : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {
    class ViewHolder(binding: RowHomeBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(RowHomeBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }

    override fun getItemCount()=5

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }



}
