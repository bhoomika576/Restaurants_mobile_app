package com.example.restaurants.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.restaurants.databinding.RestaurantItemBinding
import com.example.restaurants.models.Menu

class MyRecyclerViewAdapter (val menuList: List<Menu>):
    RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder>() {

    //inner class
    class MyViewHolder(val binding: RestaurantItemBinding): RecyclerView.ViewHolder(binding.root){}


    override fun onCreateViewHolder(parent: ViewGroup, viewType:
    Int): MyViewHolder {
        val binding =
            RestaurantItemBinding.inflate(
                LayoutInflater.from(parent.context
                ), parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return menuList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position:
    Int) {
        val currentItem = menuList[position]
        holder.binding.menuImage.setImageResource(currentItem.image)
        holder.binding.menuName.text = currentItem.name
        holder.binding.menuAwait.text = currentItem.menuAwait
        holder.binding.location.text = currentItem.location
        holder.binding.menuPrice.text = currentItem.price
    }
}